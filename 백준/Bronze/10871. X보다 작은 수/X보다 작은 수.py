A, X = map(int, input().split())

R = list(map(int, input().split()))

for i in R:
    if i < X:
        print(i, end=" ")