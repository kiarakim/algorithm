#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
vector<int> v;
int N, k;

int main() {

	cin >> N >> k;

	for (int i = 0; i < N; i++) {
		int a;
		cin >> a;
		v.push_back(a);
	}

	sort(v.begin(), v.end(), greater<int>());

	cout << v[k - 1];

	return 0;
}