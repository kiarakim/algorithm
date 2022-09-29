#include<iostream>
#include<vector>
#include<algorithm>
#include<utility>
using namespace std;

int N;
vector<pair<int, string>> v;

int main() {

	cin >> N;

	for (int i = 0; i < N; i++) {
		string str;
		cin >> str;
		int len = str.length();
		v.push_back({ len, str });
	}

	sort(v.begin(), v.end());

	cout << v[0].second << "\n";

	for (int i = 1; i < N; i++) {
		if (v[i].second == v[i - 1].second) continue;
		cout << v[i].second << "\n";
	}

	return 0;
}