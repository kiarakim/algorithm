#include <iostream>
#include<string>
using namespace std;

int main() {

	string str;
	cin >> str;
	int dat[26] = { 0 };

	for (int i = 0; i < str.length(); i++) {
		str[i] = toupper(str[i]);
		dat[str[i] - 'A']++;
	}

	int max = -99;
	char freq;
	for (int i = 0; i < 26; i++) {
		if (max < dat[i]) {
			max = dat[i];
			freq = (char)i + 'A';
		}
	}

	int cnt = 0;
	for (int i = 0; i < 26; i++) {
		if (max == dat[i]) cnt++;
	}

	if (cnt == 1) cout << freq;
	else cout << "?";



	return 0;
}