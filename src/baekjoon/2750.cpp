#include <iostream>
using namespace std;
int main() {

	int n, temp;
	int arr[1000];

	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> arr[i];

	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	for (int i = 0; i < n; i++) {
		if (i + 1 < n && arr[i] == arr[i + 1]) continue;
		cout << arr[i] << "\n";
	}

}