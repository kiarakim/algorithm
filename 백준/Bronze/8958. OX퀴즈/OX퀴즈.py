R = []
N = int(input())

for i in range(N):
    R.append(input())

for r in R:
    sum = 0
    s = 1
    for i in r:
        if (i == 'o' or i == 'O'):
            sum += s
            s += 1
        else:
            s = 1
    print(sum)