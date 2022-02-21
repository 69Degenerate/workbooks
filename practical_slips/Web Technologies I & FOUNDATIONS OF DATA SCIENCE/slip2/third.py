# Create one dataframe of data values. Find out mean, range and IQR for
# this data. 


import numpy as n
import pandas as p
d={'val':[21,22,23,24,25,26,27,28,29,30]}
df=p.DataFrame.from_dict(d)
m=df.mean()
print(m)
