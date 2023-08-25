#include<iostream>
#include<string>
#include<vector>
using namespace std;

vector<string> str;
void isPalindrome(string s) {
	int cnt = 0;
	int l = 0;
	int r = s.size() - 1;
	bool flag = true;

	for (; l <= r; l++, r--) {
		cnt++;
		if (s[l] != s[r]) {
			flag = false;
			break;
		}
	}
	cout << flag << ' ';
	if (flag && s.length() % 2 == 0) cout << cnt + 1 << "\n";
	else cout << cnt << "\n";
}

int main() {

	int T;
	cin >> T;

	for (int i = 0; i < T; i++) {
		string s;
		cin >> s;

		str.push_back(s);
	}

	for (int i = 0; i < T; i++) {
		isPalindrome(str[i]);
	}

	return 0;
}