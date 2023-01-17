class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        s = newInterval[0]
        e = newInterval[1]
        left = []
        right = []
        for i in intervals:
            if (i[1] < s):
                left += [i]
            elif (i[0] > e):
                right += [i]
            else:
                s = min(s, i[0])
                e = max(e, i[1])
        
        res = left + [[s, e]] + right
        return res
