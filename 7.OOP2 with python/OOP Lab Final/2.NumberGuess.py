import random

x = int(input('Guess the number: '))
y = random.randint(1, 100)

if x == y:
    print('Correct')

elif x < y:
    print("too low")

elif x > y:
    print('too High')
