#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main() {

	vector<int> v(5);
	int avg = 0;
	for (int i = 0; i < 5; i++) {
		cin >> v[i];
		avg += v[i];
	}
	avg /= 5;

	sort(v.begin(), v.end());
	
	cout << avg << "\n" << v[2];

	return 0;
}