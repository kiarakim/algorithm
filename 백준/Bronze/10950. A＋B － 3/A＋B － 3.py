T = int(input())
R = []
for i in range(T):
    A, B = map(int, input().split())
    R.append(A+B)
for i in R:
    print(i)