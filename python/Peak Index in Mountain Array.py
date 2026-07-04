def peakIndexInMountainArray(self, arr):
    """
    :type arr: List[int]
    :rtype: int
    """
    peak=float('-inf')
    for i in range(1,len(arr)):
        if(arr[i-1]>arr[i]):
            return peak
            break
        peak=i

#More optimized approch using binary search
def peakIndexInMountainArray(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        s=1
        e=len(arr)-2
        while(s<=e):
            mid=s+(e-s)/2
            if arr[mid-1]<arr[mid]>arr[mid+1]:
                return mid
            elif arr[mid-1]<arr[mid]:
                s=mid+1
            else:
                e=mid-1
