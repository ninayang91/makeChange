# makeChange
Given unlimited 25,10,5,1 cents, count the ways of making change of int n

Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and pennies (1 cent), write code to calculate the number of ways of repre- senting n cents.

Special algorithm using recursion

for example, int n=100,

Ways (change 100 using 0,1,2,3,4 25 cents )=Ways(change 100 using 0 25 cents)+Ways(change 75 using 0 25 cents)+Ways(change 50 using 0 25 cents)+Ways(change 25 using 0 25 cents)+1 Ways(change 0 using 0 25 cents)

In this way, reduce the range (Top down)
