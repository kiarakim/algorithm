#include<iostream>
using namespace std;
// ¿µ¼öÁõ

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	int X, N, a, b;
	int sum = 0;

	cin >> X >> N;
	
	for (int i = 0; i < N; i++) {
		cin >> a >> b;
		sum += a * b;
	}

	if (sum == X) cout << "Yes";
	else cout << "No";

	return 0;
}