from Virtual_mouse import Eye, Hand

x = int(input('Enter 1 for eye control\n2 for hand control\n'))
obj1 = Eye()
obj2 = Hand()
if x == 1:
    obj1.eye_control()
if x == 2:
    obj2.hand_control()