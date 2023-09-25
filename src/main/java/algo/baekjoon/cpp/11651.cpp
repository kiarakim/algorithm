#include<iostream>
#include<vector>
#include<algorithm>
#include<utility>
using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b) {
	if (a.second == b.second) return a.first < b.first;
	else return a.second < b.second;
}

int main() {

	vector<pair<int, int>> v;
	int N, x, y;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> x >> y;
		v.push_back({ x,y });
	}

	sort(v.begin(), v.end(), cmp);

	for (int i = 0; i < N; i++) {
		cout << v[i].first << ' ' << v[i].second << "\n";
	}

	return 0;
}