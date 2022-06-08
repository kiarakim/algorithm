import sys
R = []
while True:
    A, B = map(int, sys.stdin.readline().split())
    R.append(A + B)
    if A == 0 and B == 0:
        break
for i in range(len(R)-1):
    print(R[i])