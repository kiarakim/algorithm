N = int(input())
nN = N
cnt = 0

while True:
    nN = (nN % 10)*10 + ((nN // 10) + (nN % 10))%10
    cnt += 1
    if (nN == N):
        break
print(cnt)