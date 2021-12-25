import numpy as n
import pandas as p
import matplotlib.pyplot as plt
d={'name':['A','B','C','D','E','F','G','H','I','J'],
    'age':[15,15,16,15,17,14,16,16,15,17],
    'percentage':[67,56,64,94,76,87,56,87,54,76]}
df=p.DataFrame.from_dict(d)

df.plot(x='name',y='percentage')

plt.show()