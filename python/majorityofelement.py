#3,2,3,4,3..ans=3
a=[3,2,3,4,4,4,4,4,3]
dict={}
maximumele=0
keyelement=0
for i in a:
    if i not in dict.keys():
        dict[i]=a.count(i)
keyset=set(dict)
for i in keyset:
    if dict[i]>maximumele:
        maximumele=dict[i]
        keyelement=i
print(keyelement)