#Concepts and part of the code is gathered from GeeksforGerks.org, excercise by Nikita Tiwari

def group_sum(set, n, sum):
  #Base Cases
  if (sum == 0):
    return True
    #If the target sum is 0, the subgroup of elements that equal 0 is the ∅.
  if (n == 0 and sum != 0):
    return False
    #If the set is empty and the target sum is different than 0, then it is impossible to find a subgroup that satisfies this target.
  
  #Ignore the last value in the set if it is larger than the target sum.
  if (set[n - 1] > sum):
    return group_sum(set, n-1, sum)
  
  #Else, check if the target sum can be obtained by including the last element or excluding the last element
  return group_sum(set, n-1, sum) or group_sum(set, n-1, sum - set[n-1])
  
set = [2, 4, 8] 
sum = 10
n = len(set)
if (group_sum(set, n, sum) == True):
  print ("There is a subset in this set that totals the target sum.")
else:
  print ("No subset has been found that totals the target sum.")
