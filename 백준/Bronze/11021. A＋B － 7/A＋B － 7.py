import sys
T = int(input())
R = []
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    R.append(A + B)
for i in range(T):
    print("Case #{0}: {1}".format(i+1, R[i]))