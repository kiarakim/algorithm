R = []
for i in  range(9):
    R.append(int(input()))
max = max(R)
print(max)
print(R.index(max)+1)