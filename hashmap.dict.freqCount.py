class Shop:
    def __init__(this, name, numSold):
        this.name = name
        this.numSold = numSold

shops = [Shop('ShopA', 10), Shop('ShopB', 20), Shop('ShopA', 100)]
m = dict()

for shop in shops:
    name = shop.name
    numSold = shop.numSold
    m[name] = m.get(name, 0) + numSold
    # if name in m:
    #     m[name] = m[name] + numSold
    # else:
    #     m[name] = numSold
