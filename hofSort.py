from functools import cmp_to_key

def compareReverse(a, b):
    return b - a

arr = [9, 8, -1, 7]

arr.sort(key=cmp_to_key(compareReverse))
