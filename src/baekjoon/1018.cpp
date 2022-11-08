#include<iostream>
#include<string>
using namespace std;

int countWB(int x, int y);
int countBW(int x, int y);

string WB[8] = {
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW"
};
string BW[8] = {
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB",
	"BWBWBWBW",
	"WBWBWBWB"
};

string board[50];
int main() {

	int N, M;
	cin >> N >> M;
	int cnt = 12345;
	for (int i = 0; i < N; i++)
		cin >> board[i];

	for (int i = 0; i + 8 <= N; i++) {
		for (int j = 0; j + 8 <= M; j++) {
			int temp;
			temp = min(countWB(i,j),countBW(i,j));
			if (temp < cnt) {
				cnt = temp;
			}
		}
	}
	cout << cnt;
	return 0;
}

int countWB(int x, int y) {
	int cnt = 0;
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (board[x + i][y + j] != WB[i][j])
				cnt++;
		}
	}
	return cnt;
}
int countBW(int x, int y) {
	int cnt = 0;
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if (board[x + i][y + j] != BW[i][j])
				cnt++;
		}
	}
	return cnt;
}