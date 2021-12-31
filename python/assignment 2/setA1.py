
name = str(raw_input("Enter the words:"))
a = int(len(name) / 2)

if len(name) % 2 == 0: # even
	first_str = name[:a]
	second_str = name[a:]
else: # odd
	first_str = name[:a]
	second_str = name[a+1:]

# symmetric
if first_str == second_str:
	print(name, 'string is symmertical')
else:
	print(name, 'string is not symmertical')

# palindrome
if first_str == second_str[::-1]: 
	print(name, 'string is palindrome')
else:
	print(name, 'string is not palindrome')
