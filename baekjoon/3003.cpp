#include<iostream>
using namespace std;
// Å·, Äý, ·è, ºñ¼ó, ³ªÀÌÆ®, Æù

int comp(int a, int b) {
	if (a > b) return -(a - b);
	return b - a;
}

int main() {

	ios::sync_with_stdio(0);
	cin.tie(0);

	int ori[6] = { 1,1,2,2,2,8 };
	int piece[6];
	for (int i = 0; i < 6; i++) 
		cin >> piece[i];

	for (int i = 0; i < 6; i++) {
		cout << comp(piece[i], ori[i]) << ' ';
	}
	return 0;
}