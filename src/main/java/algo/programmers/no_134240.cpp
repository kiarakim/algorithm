#include <string>
#include <vector>

using namespace std;


string solution(vector<int> food) {
    
    string answer = "";
    string left = "";
    
    for(int i = 1; i < food.size(); i++){
        if(food[i] ==  0) continue;
        int count = food[i] / 2;
        for(int j = 0; j < count; j++){
            left += to_string(i);
        }
    }
    
    answer += left + "0";
    
    for(int i = left.size() - 1; i >= 0; i--){
        answer += left.substr(i, i+1);
    }
    
    return answer;
}