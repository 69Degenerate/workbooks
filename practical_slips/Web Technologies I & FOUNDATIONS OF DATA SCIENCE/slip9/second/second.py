# Write a Python program to create a histogram of the three species of the
# Iris data.


import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
data = pd.read_csv("Iris.csv")

print (data.head(10))
data.describe()
data.info()


plt.figure(figsize = (10, 7))
x = data["SepalLengthCm"]

plt.hist(x, bins = 20, color = "green")
plt.title("Sepal Length in cm")
plt.xlabel("Sepal_Length_cm")
plt.ylabel("Count")


plt.figure(figsize = (10, 7))
x = data.SepalWidthCm

plt.hist(x, bins = 20, color = "green")
plt.title("Sepal Width in cm")
plt.xlabel("Sepal_Width_cm")
plt.ylabel("Count")

plt.show()


plt.figure(figsize = (10, 7))
x = data.PetalLengthCm

plt.hist(x, bins = 20, color = "green")
plt.title("Petal Length in cm")
plt.xlabel("Petal_Length_cm")
plt.ylabel("Count")

plt.show()
