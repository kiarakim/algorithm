#include<iostream>
using namespace std;
// 피보나치 수 5

int fibo(int num) {
	if (num == 0)
		return 0;
	if (num == 1)
		return 1;
	return fibo(num - 2) + fibo(num - 1);
}
int main() {

	int n;
	cin >> n;
	cout << fibo(n);
	return 0;
}
