class Solution(object):
    def twoSum(self, nums, target):

        hashmap = {}
        
        for i in range(len(nums)):
            hashmap[nums[i]] = i
        
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap and hashmap[complement] != i:
                return [i, hashmap[complement]]
