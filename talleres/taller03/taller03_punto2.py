def perm(n, i):
  if i == len(n) - 1:
    #Base Case, ends when we have reached the outer most element in the list.
    print(n)
  else:
    for j in range(i, len(n)):
      n[i], n[j] = n[j], n[i]
      perm(n, i + 1)
      n[i], n[j] = n[j], n[i]
perm(list(str(input())), 0)
