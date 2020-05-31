import numpy as np

# Calculate sigmoid of x using numpy for vectors as well
def sigmoid(x):
	s = 1/(1+np.exp(-x))
	return s

# Calculate sigmoid derivative of vector
def sigmoid_der(x):
	s = sigmoid(x)
	sd = s*(1-s)
	return sd
	
x = np.array([1,2,3])
print(sigmoid_der(x))