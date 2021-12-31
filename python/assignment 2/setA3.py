s=str(raw_input('enter the string:'))
n=int(input('index number of characters you want to remove:'))
q=s[n]
new_s=s.replace(q,'')
print('original string:',s)
print('string after removing character of given index number:',new_s)