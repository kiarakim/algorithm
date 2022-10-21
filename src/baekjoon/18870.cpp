#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main() {

	vector<int> ori;
	vector<int> v; 
	int N, n;
	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> n;
		ori.push_back(n);
		v.push_back(n);
	}

	sort(v.begin(), v.end());
	v.erase(unique(v.begin(), v.end()), v.end());

	for (int i = 0; i < N; i++) {
		cout << lower_bound(v.begin(), v.end(), ori[i]) - v.begin() << ' ';
	}

	return 0;
}