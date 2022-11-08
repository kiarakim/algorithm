#include<iostream>
#include<string>
using namespace std;

int findNumber(int N) {
	int number = 666;
	int series = 0;

	while (1) {
		string tmp = to_string(number);
		for (int i = 0; i < tmp.length() - 2; i++) {
			if (tmp[i] == '6' && tmp[i + 1] == '6' && tmp[i + 2] == '6') {
				series++;
				if (series == N)
					return number;
				break;
			}
		}
		number++;
	}
}

int main() {

	int N;
	cin >> N;
	cout << findNumber(N);

	return 0;
}