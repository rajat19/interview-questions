class Solution {
public:
    string multiply(string num1, string num2) {
        if (num1 == "0" || num2 == "0") return "0";
        int n1 = num1.size(), n2 = num2.size();
        vector<int> result(n1+n2, 0);
        for(int i=n1-1; i>=0; i--) {
            for(int j=n2-1; j>=0; j--) {
                int mult = (num1[i] - '0')*(num2[j] - '0');
                int sum = mult + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        int i = 0;
        while(i < result.size() && result[i] == 0) {
            i++;
        }

        string res = "";
        while(i < result.size()) {
            res.push_back(result[i++] + '0');
        }
        return res;
    }
};