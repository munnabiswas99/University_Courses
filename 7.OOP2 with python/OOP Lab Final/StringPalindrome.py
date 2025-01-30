x = input("Enter a String: ")

x = x.casefold()
rev_x = reversed(x)

if list(x) == list(rev_x):
   print("The string is a palindrome.")
else:
   print("The string is not a palindrome.")
