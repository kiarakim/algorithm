N = [int(input()) for i in range(10)]

s = set()
for i in N:
    s.add(i % 42) 
print(len(s))