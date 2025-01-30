class Fruits:
    def __init__(self, name, color):
        self.name = name
        self.color = color

class Mango(Fruits):
    def __init__(self, name, color, season):
        super().__init__(name, color)
        self.season = season

    def __str__(self):
        return f"{self.name} is {self.color} and available in {self.season}."

class Apple(Fruits):
    def __init__(self, name, color, variety):
        super().__init__(name, color)
        self.variety = variety

    def __str__(self):
        return f"{self.name} is {self.color} and of {self.variety} variety."

class Orange(Fruits):
    def __init__(self, name, color, taste):
        super().__init__(name, color)
        self.taste = taste

    def __str__(self):
        return f"{self.name} is {self.color} and tastes {self.taste}."

class Grapes(Fruits):
    def __init__(self, name, color, size):
        super().__init__(name, color)
        self.size = size

    def __str__(self):
        return f"{self.name} is {self.color} and {self.size} in size."

# Creating objects of each class and printing attributes
mango = Mango("Mango", "yellow", "summer")
apple = Apple("Apple", "red", "Honeycrisp")
orange = Orange("Orange", "orange", "sweet")
grapes = Grapes("Grapes", "purple", "small")

print(mango)
print(apple)
print(orange)
print(grapes)
