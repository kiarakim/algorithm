#include<iostream>
#include<vector>
#include<algorithm>
#include<utility>
using namespace std;

vector<string> str;
vector<pair<int, int>> v;

int main() {

	int N;
	cin >> N;

	for (int i = 0; i < N; i++) {
		int age;
		string name;
		cin >> age >> name;

		v.push_back({ age, i });
		str.push_back(name);
	}

	sort(v.begin(), v.end());

	for (int i = 0; i < N; i++) {
		cout << v[i].first << ' ' << str[v[i].second] << "\n";
	}

	return 0;
}