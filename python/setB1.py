try:
    a=int(input('Enter the number : '))
    if a==0:
        print("its a zero, is'n it you dumb fuck")
    if a>0:
        print("its a positive number")
    if a<0:
        print("its a negative number")

except ValueError:
    print('''what part of 'Enter the number' you didnt understand ,you dipshit
    enter the number,PLEASE''')