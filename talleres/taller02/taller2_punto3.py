def sub(l):
  if l == []:
    return [[]]

  x = sub(l[1:])

  return x + [[l[0]] + y for y in x]

print(sub([5,8,9,8,2,6]))