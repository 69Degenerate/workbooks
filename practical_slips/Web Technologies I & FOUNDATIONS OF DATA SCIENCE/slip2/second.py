# Write a python program to compute Euclidian Distance between two data
# points in a dataset. [Hint: Use linalgo.norm function from NumPy]


import numpy as np
a = np.array((1, 2, 3))
b = np.array((4, 5, 6))

dist = np.linalg.norm(a-b)

print(dist)
