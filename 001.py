class ClassName:
    x = 0
    def fn1():
        print("fn1")
        
    @staticmethod
    def fn2():
        print("fn2 staticmethod")
        
    @classmethod
    def fn3(cls):
        print("fn3 classmethod cls: " + str(cls))
        cls.x = 3
    def fn4(this):
        print("fn4 instance method")

obj = ClassName()

# obj.fn1() # ERROR coz 1 arg given #same: ClassName.fn1(obj)
ClassName.fn1()

obj.fn2()
ClassName.fn2()

obj.fn3()
ClassName.fn3()

obj.fn4()
ClassName.fn4(obj)
