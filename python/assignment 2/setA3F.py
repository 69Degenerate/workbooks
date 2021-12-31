s=str(raw_input('Enter the string to reverse:'))
def rev(name):
    str=''
    for i in  name:
        str=i+str
    return str


print(rev(s))