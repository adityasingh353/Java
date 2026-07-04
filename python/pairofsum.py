a=[1,2,7,8,11,13]
target=9
i=0
j=len(a)-1
while i<j:
    if a[i]+a[j]==target:
        print(i,j)
    elif a[i]+a[j]<target:
        i+=1
    elif a[i]+a[j]>target:
        j-=1

