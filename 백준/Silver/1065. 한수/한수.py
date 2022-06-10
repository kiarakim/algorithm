N = int(input())
cnt = 0

for i in range(1, N + 1):
    if i < 100:
        cnt += 1
    else:
        L = list(map(int, str(i)))
        if L[0] - L[1] == L[1] - L[2]:
            cnt += 1
print(cnt)