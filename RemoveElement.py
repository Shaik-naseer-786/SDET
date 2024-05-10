arr=[1,2,3,4,5]
index=-1
key=3
for i in range(len(arr)):
    if(arr[i]==key):
        index=i 
        break 
n=len(arr)-1
res=[0]*n
j=0
for i in range(0,len(arr)):
    if(i!=index):
        res[j]=arr[i]
        j+=1
print(res)
        