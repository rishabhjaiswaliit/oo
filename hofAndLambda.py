def operate(n, m, operation):
    return operation(n, m)
    

def add(a, b):
    return a + b
def multiply(a, b):
    return a * b

ans = operate(10, 30, multiply)
print(ans)

#--lamdas method-------

def operate(n, m, operation):
    return operation(n, m)
    
ansAdd = operate(10, 30, lambda a, b: a + b)
ansMul = operate(10, 30, lambda a, b: a * b)
ansSub = operate(10, 30, lambda a, b: a - b)
ansDiv = operate(10, 30, lambda a, b: a // b)
print(ansAdd, ansMul, ansSub, ansDiv)
