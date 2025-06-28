class RandomizedSet {

    private Random random;
    private Map<Integer, Integer> map;
    private List<Integer> arr;
    public RandomizedSet() {
        random = new Random();
        map = new HashMap<>();
        arr = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, arr.size());
        arr.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int pos = map.get(val);
        if (pos < arr.size() - 1) {
            int lastElement = arr.get(arr.size() - 1);
            map.put(lastElement, pos);
            arr.set(pos, lastElement);
        }
        map.remove(val);
        arr.remove(arr.size() - 1);
        return true;
    }

    public int getRandom() {
        return arr.get(random.nextInt(arr.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */