#Code obtained from VisuAlgo , visualgo.net/en/recursion
def euclid (p,q):
  if q == 0:
    return p
  else:
    return euclid(q,p%q)

p = int(input("Please input the value of p: "))
q = int(input("Please input the value of q: "))

print("The greatest common denominator of",p,"and",q, "is:",euclid(p,q),end=".")
