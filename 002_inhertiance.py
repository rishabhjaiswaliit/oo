class Vehicle:  # defining the parent class
    fuelCap = 90 # class variable


class Car(Vehicle):  # defining the child class
    fuelCap = 50

    def display(self):
        # accessing fuelCap from the Vehicle class using super()
        print("Fuel cap from the Vehicle Class:", super().fuelCap)

        # accessing fuelCap from the Car class using self
        print("Fuel cap from the Car Class:", self.fuelCap)


obj1 = Car()  # creating a car object
obj1.display()  # calling the Car class method display()


# -----------------


class ParentClass():
    def __init__(self, a, b):
        self.a = a
        self.b = b


class ChildClass(ParentClass):
    def __init__(self, a, b, c): 
        # same as
        # ParentClass.__init__(self, a, b)
        super().__init__(a, b) # notice the brackets() aka ParentClass == super()....
        self.c = c


obj = ChildClass(1, 2, 3)
print(obj.a)
print(obj.b)
print(obj.c)


# -------------------

class A:
    def display(self):
        print("This is class A")
        
class B(A):
    def display(self):
        print("This is class B")
        
class C(A):
    def display(self):
        print("This is class C")
        
class D(B, C):
    pass

obj = D()
obj.display()

# >>> D.__mro__
# (<class '__main__.D'>, <class '__main__.B'>, <class '__main__.C'>, <class '__main__.A'>, <class 'object'>)

# 
