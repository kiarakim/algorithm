#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
using namespace std;

int main() {

	vector<int> vi;

	string str;
	cin >> str;
	
	int len = str.length();
	for (int i = 0; i < len; i++) {
		int a = int(str[i]) - '0';
		vi.push_back(a);
	}

	sort(vi.begin(), vi.end(), greater<int>());

	for (int i = 0; i < len; i++)
		cout << vi[i];

	return 0;
}