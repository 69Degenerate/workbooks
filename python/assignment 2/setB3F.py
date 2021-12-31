num=int(input('enter a number:'))
def perfect_number(n):
    sum = 0
    for x in range(1, n):
        if n % x == 0:
            sum += x
    if(sum == n):
        print(n,'is a perfect number.')
    else:
        print(n,'is not a perfect number.')


print(perfect_number(num))