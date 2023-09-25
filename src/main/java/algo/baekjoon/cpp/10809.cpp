#include <iostream>
#include<string>
using namespace std;

int main() {

	string str;
	cin >> str;
	int alpha[26] = { 0 };

	for (int i = 0; i < str.length(); i++) {
		if (alpha[str[i] - 'a'] == 0) {
			alpha[str[i] - 'a'] = i + 1;
		}
	}
	for (int i = 0; i < 26; i++) {
		if (alpha[i] == 0) alpha[i] = -1;
		else alpha[i] -= 1;
		cout << alpha[i] << ' ';
	}
		
	return 0;
}