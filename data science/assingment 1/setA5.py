import numpy as n
import pandas as p
d={'name':['A','B',None,'C','D','E','F','G','H','I','J'],
    'age':[15,15,None,16,15,17,14,16,16,15,17],
    'percentage':[67,56,None,64,94,76,87,56,87,54,76]}
df=p.DataFrame.from_dict(d)

df["remark"]=None
print(df)
print(len(df)-len(df.drop_duplicates()))
print(len(df)-len(df.isnull()))