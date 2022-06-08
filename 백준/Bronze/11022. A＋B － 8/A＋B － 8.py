import sys
T = int(input())
rA = []
rB = []
R = []
for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    rA.append(A)
    rB.append(B)
    R.append(A + B)
for i in range(T):
    print("Case #{0}: {1} + {2} = {3}".format(i+1, rA[i], rB[i], R[i]))