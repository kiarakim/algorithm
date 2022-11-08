#include<iostream>
#include<vector>
using namespace std;

int main() {

	vector<pair<int, int>> big;

	int N;
	cin >> N;
	big.resize(N);

	int rank = 1;

	for (int i = 0; i < N; i++) {
		cin >> big[i].first >> big[i].second;
	}

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (big[i].first < big[j].first && big[i].second < big[j].second)
				rank++;
		}
		cout << rank << ' ';
		rank = 1;
	}

	return 0;
}