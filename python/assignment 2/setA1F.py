num1=int(input('enter the first number:'))
num2=int(input('enter the second number:'))
num3=int(input('enter the third number:'))

def large(n1,n2,n3):
    if (n1 >= n2) and (n1 >= n3):
        return n1
    elif (n2 >= n1) and (n2 >= n3):
        return n2
    else:
        return n3

print("The largest number is", large(num1,num2,num3))