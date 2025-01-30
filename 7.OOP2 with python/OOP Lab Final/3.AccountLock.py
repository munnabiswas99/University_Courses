userName = 'munna'
password = "5261"
x = input()
un = input('Enter user name: ')
ps = input('Enter password: ')

i = 0
count = 0
while i<3:
    if userName == un and password == ps:
        print('Login successful')
        break
    elif userName != un or password != ps:
        un = input('Enter user name: ')
        ps = input('Enter password: ')
        count+=1
        i+=1

if count == 3:
    print("Acount Locked")
