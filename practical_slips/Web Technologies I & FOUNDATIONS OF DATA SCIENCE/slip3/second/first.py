# 1. Import Dataset and do the followings:
# a) Describing the dataset
# b) Shape of the dataset
# c) Display first 3 rows from dataset

import pandas as pd

df=pd.read_csv('data.csv')
print(df.head(3))
print(df.describe())
# print(df.info())
# print(df.dtypes)
print(df.shape)
# print(df.size)
#print (df['counrty'].value_counts())
# print(df.sample(10))
# print(df.drop_duplicates(inplace=True))
# print(df.sort_values(by='Year',inplace=True))