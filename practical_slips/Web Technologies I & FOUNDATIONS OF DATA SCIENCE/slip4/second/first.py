# Generate a random array of 50 integers and display them using a line
# chart, scatter plot, histogram and box plot. Apply appropriate color, labels and
# styling options

import numpy as np
import matplotlib.pyplot as plt

num= np.random.randint(1,100,50)
x=num
y=x*2

print(num)

#line chart
plt.plot(x,y,c='r',marker='*',markersize=4)
plt.grid(True)
plt.legend("sOME BoDy")
plt.title('gfskdj')
plt.xlabel('asd')
plt.ylabel('qwe')
plt.show()

#scatter plot
plt.scatter(x, y)
plt.show()

#histogram 
plt.hist(x, bins=10)
plt.show()

#box plot
plt.boxplot(x)
plt.show()