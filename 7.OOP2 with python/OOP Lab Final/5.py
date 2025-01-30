import random
class Tournament:
    def __init__(self, team1, team2):
        self.team1 = team1
        self.team2 = team2

    def addMatch(self):
        print({self.team1}, 'vs', {self.team2})

    def recordResult(self):
        x = random.randint(1, 2)
        if x == 1:
            print({self.team1}, 'own')
        else:
            print({self.team2}, 'own')

        

    

