A = int(input()) #150
B = int(input()) #266
C = int(input()) #427

M = A * B * C #1703700
nM = str(M)

R = []

for i in range(10):
    R.append(0)

nM = [int(i) for i in nM]
for i in nM:
    R[i] += 1

for i in R:
    print(i)