def pathcount(m, n):
    if(m == 1 or n == 1):
        return 1
    return pathcount(m-1, n) + pathcount(m, n-1)
 
N = 5
M = 5
print(pathcount(N, M))
