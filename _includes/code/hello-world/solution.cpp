#include <string>
#include <iostream>

using namespace std;
class Solution {
    public:
        void helloWorld(string s) {
            cout<<"Hello "<<s;
        }
};

int main() {
    Solution solution;
    solution.helloWorld("C++");
    return 0;
}