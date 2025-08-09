char* minWindow(char* s, char* t) {
    int i    = 0;
    int j    = 0;
    int tlen = strlen(t);
    int slen = strlen(s);
    int counts[256] = { 0 };
    int win[2] = { 0, INT_MAX };

    for (int i = 0; i < tlen; i++) {
        counts[t[i]]++;
    }
    while (j < slen) {
        if (counts[s[j]] > 0) {
            tlen--;
        }
        counts[s[j]]--;
        j++;
        while (tlen == 0) {
            if (j - i < win[1] - win[0]) {
                win[0] = i; win[1] = j;
            }
            counts[s[i]]++;
            if (counts[s[i]] > 0) {
                tlen++;
            }
            i++;
        }
    }
    return (win[1] != INT_MAX) 
           ? strndup(&s[win[0]], win[1] - win[0]) 
           : "";
}