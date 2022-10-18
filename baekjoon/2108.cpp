#include<iostream>
#include<vector>
#include<cmath>
#include<algorithm>
using namespace std;

int dat[8001] = { 0 };

int main() {

	vector<int> v;
	int N;
	cin >> N;
	for (int i = 0; i < N; i++) {
		int a;
		cin >> a;
		v.push_back(a);
		dat[a + 4000]++;
	}

	// »ê¼úÆò±Õ
	double sum = 0;
	for (int i = 0; i < N; i++) {
		sum += v[i];
	}
	sum /= N;

	// Áß¾Ó°ª
	sort(v.begin(), v.end());
	int mid = N / 2;

	// ÃÖºó°ª
	bool isFirst = false;
	int most = 0;
	int maxi = -9999;
	for (int i = 0; i < 8001; i++) {

		if (dat[i] == 0) continue;
		if (dat[i] == maxi) {
			if (isFirst) {
				most = i - 4000;
				isFirst = false;
			}
		}
		if (dat[i] > maxi) {
			maxi = dat[i];
			most = i - 4000;
			isFirst = true;
		}
	}

	// ¹üÀ§
	int range = v.back() - v.front();
	
	cout << round(sum) << "\n";
	cout << v[mid] << "\n";
	cout << most << "\n";
	cout << range;

	return 0;
}