# 60. Permutation
example:
n = 4, k = 14:

We have {1, 2, 3, 4}, find the 14th permutation.
List out all the permutations:

1 + (permutations of 2, 3, 4)
2 + (permutations of 1, 3, 4)
3 + (permutations of 1, 2, 4)
4 + (permutations of 1, 2, 3)

To find the 14th, we can see it falling to range 3 + (permutations of 1, 2, 4), since 1 + (permutations of 2, 3, 4) and 2 + (permutations of 1, 3, 4) could take the first 2 * (3!) = 12 permutations. So we can know the first number of result is 3.

Then the question turn to be a smaller problem.
{1, 2, 4}, find the 2nd permutation.
List out all the permutations:
1 + (permutations of 2, 4)
2 + (permutations of 1, 4)
4 + (permutations of 1, 2)

There are 2! + 2! + 2!, 6 permutation. The 2nd must be in range 1 + (permutations of 2, 4). So we can know the second number of result is 1.

So the question turn be a smaller problem.
{2, 4}, find the 2nd permutation. The answer is (4, 2).
So the final result is (3, 1, 4, 2)