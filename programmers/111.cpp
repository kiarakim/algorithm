#include <string>
#include <vector>
#include <cmath>

using namespace std;

long long solution(long long n) {
    long long answer = 0;

    long long x = sqrt(n);

    if (x - int(x) == 0) answer = pow(int(x), 2);
    else answer = -1;

    return answer;
}
int main() {

    long long n;
    scanf("%lld", &n);

    printf("%lld", solution(n));

    return 0;
}