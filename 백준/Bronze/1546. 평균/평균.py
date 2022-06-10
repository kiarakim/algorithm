N = int(input())
R = list(map(int, input().split()))
sum = 0
for i in R:
    i = i / max(R) * 100
    sum += i
print(sum/N)
