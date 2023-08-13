class SortByParity:
    def sortArrayByParity(nums):
        # Long runtime, little memory (my soln)
        c = 0
        for i in nums:
            if i%2 == 0:
                cnt = 0
                while nums[cnt]%2 == 0 and cnt < len(nums)-1:
                    cnt += 1
                nums[cnt], nums[c] = nums[c], nums[cnt]
            c += 1
        return nums

        #Short runtime, lots of memory (other's soln - better)
        # f, l = 0, len(nums)-1
        # while f<=l:
        #     if nums[f]%2 == 0:
        #         f+=1
        #     else:
        #         nums[f], nums[l] = nums[l], nums[f]
        #         l-=1
        # return nums

        # Note: Sorting into two is faster going from both ends



