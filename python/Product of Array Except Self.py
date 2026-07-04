#Product of Array Except Self
#brute force approch
def productExceptSelf(self, nums):
    """
    :type nums: List[int]
    :rtype: List[int]
    """
    ls=[]
    length=len(nums)
    for i in range(length):
        mul=1
        for j in range(length):
            if i==j:
                continue
            else:
                mul*=nums[j]
        ls.append(mul)
    return ls
#Less Time Complexity-->O(n)
def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        List=[0]*len(nums)
        Left=[1]*len(nums)
        Right=[1]*len(nums)
        for i in range(1,len(nums)):
            Left[i]=Left[i-1]*nums[i-1]
        for i in range(len(nums)-2,-1,-1):
            Right[i]=Right[i+1]*nums[i+1]
        for i in range(len(nums)):
            List[i]=Left[i]*Right[i]
        return List
#less space complexity code
def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        List=[1]*len(nums)
        #prefix
        for i in range(1,len(nums)):
            List[i]=List[i-1]*nums[i-1]
        suffix=1
        for i in range(len(nums)-2,-1,-1):
            suffix*=nums[i+1]
            List[i]*=suffix
        return List