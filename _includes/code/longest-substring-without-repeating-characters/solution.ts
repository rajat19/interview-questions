function lengthOfLongestSubstring(s: string): number {
    const map = new Map<string, number>();
    let index = 0, start = 0, maxlength = 0;
    while(index < s.length) {
        if (map.has(s[index])) {
            start = Math.max(start, map.get(s[index])+1);
        }
        maxlength = Math.max(maxlength, index-start+1);
        map.set(s[index], index);
        index++;
    }
    return maxlength;
};