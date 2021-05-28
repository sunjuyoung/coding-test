def factor(n):
    if n<=1:
        return 1
    return n * factor(n-1)





def factor1(n):
    result = 1

    for i in range (1,n+1):
        result *=i
    return result


def gcd(a,b):
    if a%b == 0:
        return b

    return gcd(b,a%b)


print(gcd(192,162))

