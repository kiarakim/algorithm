//#include<iostream>
//using namespace std;
//한글 깨지나
//
//void callByReference(int& a) {
//	a++;
//	a += 3;
//	a /= 2;
//	cout << "callByReference\n";
//	cout << "a : " << a << "\n";
//	cout << "a�ּ� : " << &a << "\n\n";
//
//}
//
//int main() {
//
//	int a = 5;
//	callByReference(a);
//
//	cout << "main\n";
//	cout << "a : " << a << "\n";
//	cout << "a�ּ� : " << &a << "\n\n";
//
//	return 0;
//}

#include<iostream>
using namespace std;

void callByValue(int a) {
	a++;
	a += 3;
	a /= 2;
	cout << "callByValue\n";
	cout << "a : " << a << "\n";
	cout << "a�ּ� : " << &a << "\n\n";

}

int main() {

	int a = 5;
	callByValue(a);

	cout << "main\n";
	cout << "a : " << a << "\n";
	cout << "a�ּ� : " << &a << "\n\n";

	return 0;
}