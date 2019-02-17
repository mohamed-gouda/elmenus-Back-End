/*
  = Test Cases ::
- maybe user Enters big number.

  = implementation :
  - define method "factorial" with one argument "i" type Is Long,
  make validation if the i = 0 will return 1 , if i < 0 will return -1,
  else that make recursive function .
  - in fact this way not the best way cuz if user enter big number the program will stop,
  i'm try to implementation it with anther way but i'm face some problem in code and i will try again
  explain ::
  i will create array with a big size or list and assign first index by 1 ,
  and each time i will make multiplication with array and reversed it .

  */

def factorial(i: Long):Long={
  if(i == 0)
     1
  else if(i <0)
      -1
  else
     i * factorial(i-1)
}


println( factorial(-6))
