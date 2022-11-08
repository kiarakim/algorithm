#include <string>
#include<iostream>
using namespace std;

int main() {

	int p = 15;

	int num = 1;
	string A = "";

	while (A.length() <= p) {
		A += to_string(num);
		num++;
	}

	int answer = (int)A[p]-'0';

	cout << answer;

	return 0;
}
