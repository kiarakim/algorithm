#include<iostream>
using namespace std;

int part(int a) {
	int sum = a;
	while (a) {
		sum += a % 10;
		a /= 10;
	}
	return sum;
}

int main() {

	int N;
	cin >> N;


	for (int i = 1; i < N; i++) {
		int sum = part(i);
		if (sum == N) {
			cout << i << endl;
			return 0;
		}
	}
	cout << "0" << endl;

	return 0;
}