# Write a Python program to Add 5 rows with duplicate values and missing
# values. Add a column ‘remarks’ with empty values. Display the data

# Python program to get the number of observations, missing
# values and duplicate values
import pandas as pd

df=pd.read_csv('data.csv')
d=df.head()
df_r= pd.concat([d])

df2 = {'Country':'','Age':'','Salary':'','Purchased':''}

df_r = df.append(df2*5, ignore_index = True)
print(df_r)

address = ['']
 
df_r['Address'] = address

print(df_r)
print(df_r.info())

