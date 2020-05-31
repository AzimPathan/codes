import numpy as np

# Convert 3-D image into 1-D vector
def img2vector(img):
	v = img.reshape(img.shape[0]*img.shape[1],img.shape[2])
	return v

img = np.array([[[ 0.67826139,  0.29380381],
        [ 0.90714982,  0.52835647],
        [ 0.4215251 ,  0.45017551]],
       [[ 0.92814219,  0.96677647],
        [ 0.85304703,  0.52351845],
        [ 0.19981397,  0.27417313]],
       [[ 0.60659855,  0.00533165],
        [ 0.10820313,  0.49978937],
        [ 0.34144279,  0.94630077]]])

print (str(img2vector(img)))