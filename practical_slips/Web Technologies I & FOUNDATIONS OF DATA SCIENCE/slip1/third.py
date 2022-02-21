# Write a Python program to create a dataframe containing columns name,
# age and percentage. Add 10 rows to the dataframe. View the dataframe

import numpy as n
import pandas as p
d={'name':['A','B','C','D','E','F','G','H','I','J'],
    'age':[15,15,16,15,17,14,16,16,15,17],
    'percentage':[67,56,64,94,76,87,56,87,54,76]}
df=p.DataFrame.from_dict(d)
print('''____________________________
      data frame''')
print(df)