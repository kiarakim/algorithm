T = int(input())
R = []
for i in range(T):
    R.append(list(map(int, input().split())))
for info in R:
    avg = sum(info[1:])/info[0]
    cnt = 0
    for score in info[1:]:
        if score > avg:
            cnt += 1
    pro = cnt / info[0] * 100
    print("{0:.3f}%".format(pro))