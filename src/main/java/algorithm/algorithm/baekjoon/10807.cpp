#include<iostream>
using namespace std;

int main() {

	int N;
	cin >> N;
	int arr[201] = { 0 };

	for (int i = 0; i < N; i++) {
		int temp;
		cin >> temp;
		arr[temp + 100] += 1;
	}

	int target;
	cin >> target;

	cout << arr[target + 100];

	return 0;
}