#include<iostream>
using namespace std;

int a, b;
int used[4];
int path[2];

void run(int lev) {
	if (lev == 2) {
		cout << path[0] << ' ' << path[1] << "\n";
		return;
	}

	for (int i = 0; i < a; i++) {
		if (used[i] == 1) continue;
		used[i] = 1;
		path[lev] = i + 1;
		run(lev + 1);
		used[i] = 0;
	}
}

int main() {

	cin >> a >> b;

	run(0);

	return 0;
}