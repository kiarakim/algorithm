import sys

R = []
while True:
    try:
        A, B = map(int, sys.stdin.readline().split())
        R.append(A + B)
    except:
        break
for i in R:
    print(i)