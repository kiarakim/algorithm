#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main() {

	int N, M;
	cin >> N >> M;
	vector<int> card;

	for (int i = 0; i < N; i++) {
		int number;
		cin >> number;
		card.push_back(number);
	}

	sort(card.begin(), card.end());

	int min = 999999;
	int result = 0;
	int sum = 0;
	for (int i = 0; i < N - 2; i++) {
		for (int j = i + 1; j < N - 1; j++) {
			for (int k = j + 1; k < N; k++) {
				sum = card[i] + card[j] + card[k];
				if (M - sum < min && M - sum >= 0) {
					min = M - sum;
					result = sum;
				}
			}
		}
	}
	cout << result;

	return 0;
}