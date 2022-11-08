#include<iostream>
#include<vector>
using namespace std;

int main() {

	vector<int> students(31);
	for (int i = 0; i < 28; i++) {
		int num;
		cin >> num;
		students[num] = 1;
	}

	for (int i = 1; i <= 30; i++) {
		if (students[i] != 1)
			cout << i << "\n";
	}

	return 0;
}