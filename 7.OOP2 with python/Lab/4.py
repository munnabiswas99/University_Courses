class Fruits:
    def __init__(self, name, color):
        self.name = name
        self.color = color

class Mango(Fruits):
    def __init__(self, name, color, season, color_override=None):
        super().__init__(name, color)
        self.season = season
        if color_override:
            self.color = color_override  # Overriding color attribute

    def __str__(self):
        return f"{self.name} is {self.color} and available in {self.season}."

# Creating a Mango object and overriding color
mango = Mango("Mango", "yellow", "summer", "green")
print(mango)
