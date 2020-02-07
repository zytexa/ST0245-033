#help from https://www.youtube.com/watch?v=0u7g9C0wSIA

#print steps
def printMove(fr,to):
  print("move from ",fr," to ",to)

#
def TowersOfHanoi(n,fr,to,aux):
  if n == 1:
    printMove(fr,to) #If there is only one disc, it can be moved to target
  else:
    TowersOfHanoi(n-1, fr, aux, to) #Move smaller stack to the auxiliary tower
    TowersOfHanoi(1, fr, to, aux) #Move the remaining disc to the target
    TowersOfHanoi(n-1, aux, to, fr) #Move the remaining smaller stack to the target
