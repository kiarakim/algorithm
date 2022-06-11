N = int(input())
num = list(map(int, input()))
sum = 0
for i in range(N):
    sum += num[i]
print(sum)