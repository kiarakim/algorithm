#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main() {

	vector<string> str{ "","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ" };
	string name;
	cin >> name;
	int time = 0;

	for (int i = 0; i < name.length(); i++) {
		for (int j = 0; j < 10; j++) {
			if (str[j].find(name[i]) != -1)
				time += j + 1;
		}
	}

	cout << time;

	return 0;
}