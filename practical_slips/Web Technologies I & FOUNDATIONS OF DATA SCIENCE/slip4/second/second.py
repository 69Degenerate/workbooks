# Create two lists, one representing subject names and the other
# representing marks obtained in those subjects. Display the data in a pie chart
# and bar chart. 


import numpy as np
import matplotlib.pyplot as plt

sub=['maths','bio','chemistry']
mark=[57,43,76]


plt.bar(sub,mark)
plt.title("BAR CHART")
plt.xlabel('asd')
plt.ylabel('qwe')
plt.show()


plt.title("pir chart")
plt.pie(mark,labels=sub,shadow=5,autopct='%1.1f%%',explode=mark)
plt.legend()
plt.show()
