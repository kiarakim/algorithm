#include<iostream>
using namespace std;

int main() {

	string A, B;
	cin >> A >> B;
	string big;

	for (int i = 2; i >= 0; i--) {
		if (A[i] == B[i]) continue;
		if (A[i] > B[i]) big = A;
		else big = B;
		break;
	}
	cout << big[2] << big[1] << big[0];
	

	return 0;
}