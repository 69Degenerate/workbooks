# 2. Handling Missing Value:
#a) Replace missing value of salary,age column with
# mean of that column. 

import pandas as pd


data=pd.read_csv('data.csv')
data['Salary'] = data['Salary'].fillna(data['Salary'].mean())
data['age'] = data['age'].fillna(data['age'].mean())
print(data)
 