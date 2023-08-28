#include<iostream>
using namespace std;

void merge_sort(int* A, int start, int end);
void merge(int* A, int p, int q, int r);
int N, K;
int cnt = 0;

int main() {

	cin >> N >> K;
	int* A;
	A = new int[N];

	for (int i = 0; i < N; i++) {
		cin >> A[i];
	}

	merge_sort(A, 0, N - 1);

	if (cnt < K) cout << -1;

	return 0;
}

void merge_sort(int* A, int start, int end) {
	int p = start, r = end, q;
	if (p < r) {
		q = (p + r) / 2;
		merge_sort(A, p, q);
		merge_sort(A, q + 1, r);
		merge(A, p, q, r);
	}
}

void merge(int* A, int p, int q, int r) {
	int* tmp = new int[r + 2]; // 동적 할당

 	int i = p; int j = q + 1; int t = 1;
	while (i <= q && j <= r) {
		if (A[i] <= A[j]) tmp[t++] = A[i++];
		else tmp[t++] = A[j++];
	}
	while (i <= q) tmp[t++] = A[i++];
	while (j <= r) tmp[t++] = A[j++];
	i = p; t = 1;
	while (i <= r) {
		A[i++] = tmp[t++];
		if (++cnt == K) cout << tmp[t - 1];
	}
	delete[] tmp;
}