#include<iostream>
using namespace std;

// 별 찍기 - 2

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int N;
	cin >> N;

	for (int i = 1; i < N + 1; i++) {
		for (int j = N - i; j > 0; j--)
			cout << ' ';
		for (int j = 0; j < i; j++) 
			cout << '*';
		
		cout << "\n";
	}


	return 0;
}