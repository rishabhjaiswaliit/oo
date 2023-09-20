def operate(n, m, operation):
    return operation(n, m)
    

def add(a, b):
    return a + b
def multiply(a, b):
    return a * b

ans = operate(10, 30, multiply)
print(ans)
