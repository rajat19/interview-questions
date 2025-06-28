class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        int totalBuildings = buildings.length;
        BuildingPoint[] buildingPoints = new BuildingPoint[totalBuildings*2];
        int index = 0;
        for(int[] building: buildings) {
            buildingPoints[index++] = new BuildingPoint(building[0], building[2], true);
            buildingPoints[index++] = new BuildingPoint(building[1], building[2], false);
        }
        Arrays.sort(buildingPoints);

        TreeMap<Integer, Integer> queue = new TreeMap<>();
        queue.put(0, 1);
        int prevMaxHeight = 0;
        List<List<Integer>> result = new ArrayList<>();

        for(BuildingPoint buildingPoint: buildingPoints) {
            if (buildingPoint.isStart) {
                queue.compute(buildingPoint.y, (key, value) -> value != null ? value + 1: 1);
            } else {
                queue.compute(buildingPoint.y, (key, value) -> value == 1 ? null: value - 1);
            }
            int currentMaxHeight = queue.lastKey();
            if (prevMaxHeight != currentMaxHeight) {
                result.add(Arrays.asList(buildingPoint.x, currentMaxHeight));
                prevMaxHeight = currentMaxHeight;
            }
        }
        return result;
    }
}

class BuildingPoint implements Comparable<BuildingPoint>{
    int x;
    int y;
    boolean isStart;
    BuildingPoint(int x, int y, boolean isStart) {
        this.x = x;
        this.y = y;
        this.isStart = isStart;
    }

    public  int compareTo(BuildingPoint o) {
        if (this.x != o.x) {
            return this.x - o.x;
        }
        // if two starts are compared, then higher y should be picked first
        // if two ends are compared, then lower y should be picked first
        // if one start and one end is compared, then start should appear before end
        int h1 = isStart ? -y : y;
        int h2 = o.isStart ? -o.y : o.y;
        return h1 - h2;
    }

    public String toString() {
        return "{"+x+", "+y+", "+isStart+"}";
    }
}