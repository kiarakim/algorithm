#include <iostream>
#include <stack>
using namespace std;

int main() {
	stack<int> s;      // ����
	int N;             // ����� ��
	string command;    // ��ɾ�
	int num;           // push ���� ��, ���ÿ� ���� ����
	int result = 0;    // �� ��ɾ��� �����

	cin >> N;

	for (int i = 0; i < N; i++) {
		cin >> command;

		// 1. push
		if (command == "push") {
			cin >> num;
			s.push(num);
		}

		// 2. pop
		//    ������ ��������� -1�� ���, �� �ܿ��� top ���� ��� �� pop
		else if (command == "pop") {
			if (s.size() == 0) {
				result = -1;
				cout << result << endl;
			}
			else {
				result = s.top();
				cout << result << endl;
				s.pop();
			}
		}

		// 3. size
		else if (command == "size") {
			cout << s.size() << endl;
		}

		// 4. empty
		//    size�Լ��� ����, size�� 0�̸� ������ �� ���̹Ƿ� 1, �ƴϸ� 0 ���     
		else if (command == "empty") {
			if (s.size() == 0) {
				result = 1;
				cout << result << endl;
			}
			else {
				result = 0;
				cout << result << endl;
			}
		}

		// 5. top
		//    ������ ��������� -1�� ���, �� �ܿ��� top ���� ���
		else if (command == "top") {
			if (s.size() == 0) {
				result = -1;
				cout << result << endl;
			}
			else {
				result = s.top();
				cout << result << endl;
			}
		}
	}

	return 0;
}