def gcd(a,b):
    i = min(a,b)
    while True:
        if a%i ==0 and b%i ==0:
            return i
        
        i = i -1



print(gcd(442,48))

def gcd2(a,b):

    if b==0:
        return a
    return gcd2(b,a%b)