class FizzBuzz:

    #412
    def fizzBuzz(n: int) -> [str]:
        l = []
        f = "Fizz"
        b = "Buzz"
        for i in range(n):
            if (i+1) % 3 == 0 and (i+1) % 5 == 0:
                l.append(f+b)
            elif (i+1) % 3 == 0:
                l.append(f)
            elif (i+1) % 5 == 0:
                l.append(b)
            else:
                l.append(str(i+1))
        return l

    print(fizzBuzz(9))