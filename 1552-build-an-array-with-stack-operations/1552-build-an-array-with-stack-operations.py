class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        ret: List[str] = []
        count = 1
        for x in target:
            if x == count:
                ret.append("Push")
            else:
                while count != x:
                    ret.append("Push")
                    ret.append("Pop")
                    count += 1
                ret.append("Push")
            count+=1
        return ret
                