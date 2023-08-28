#include <iostream>
using namespace std;

int dat[10001] = { 0 };

int main() {

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, temp;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> temp;
		dat[temp] += 1;
	}

	for (int i = 0; i < 10001; i++) {
		for (int j = 0; j < dat[i]; j++)
			cout << i << "\n";
	}

	return 0;
}