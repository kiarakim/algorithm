#include <iostream>
#include<string>
using namespace std;

int main() {
		
	int N;
	string num;
	cin >> N >> num;

	int sum = 0;
	for (int i = 0; i < N; i++) {
		sum += int(num[i]) - '0';
	}

	cout << sum;
	return 0;
}