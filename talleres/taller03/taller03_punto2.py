def permutacion(prefix,s):
    if len(s) == 0:
      print(prefix)
    else:
      i=0
      for i in range (i,len(s)):
          f = s[i]
          u = s[0:i]+s[i+1]
          permutacion(f,u)
    return prefix 
    

permutacion("","abcd")