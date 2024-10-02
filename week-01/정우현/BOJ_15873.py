arr = list(input())

a = 0
b = ''
count = 0

if arr[1] == '0':
    a = 10
    for i in range(2, len(arr)):
        b+=arr[i] 
    print(a+int(b))     
else:
    a = int(arr[0])
    for i in range(1, len(arr)):
        b+=arr[i] 
    print(a+int(b))