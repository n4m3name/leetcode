class MaximumWealth:

    #1672
    def maximumWealth(accounts: [[int]]) -> int:
        max = 0
        for i in range(len(accounts)):
            sum = 0
            for it in range(len(accounts[i])):
                sum += accounts[i][it]
            if sum > max:
                max = sum
        return max

    print(maximumWealth([[1,2,3],[1,2,4],[1,5,2]]))