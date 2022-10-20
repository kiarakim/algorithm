#include<iostream>
#include<vector>
using namespace std;

vector<vector<int>> v;
int N, M, V;
bool used[1001];

void reset() {
	for (int i = 0; i < N; i++)
		used[i] = 0;
}

void DFS(int lev) {

	cout << lev << ' ';

	
}

void BFS(int lev) {

}

int main() {

	cin >> N >> M >> V;
	v.resize(M);

	for (int i = 0; i < M; i++) {
		int a, b;
		cin >> a >> b;
		v[i].push_back(a);
		v[i].push_back(b);
	}
	
	reset();
	DFS(V);
	cout << "\n";

	reset();
	BFS(V);


	return 0;
}