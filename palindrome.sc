
/*
= Test Cases ::
 - maybe user Enter Uppercase Char in word Ex: "akkA".
 - maybe user write one char error in word Ex: "skka" "akka".

 = implementation :
 - define method "palindrome" with one argument "word" type Is String,
 convert the "word" from string to array with build in method "toArray",
 make FOR LOOP in half the array and make validation IF the first Element in array
 equal the last Element or not and so on EX : "a,k,k,a" if 'a' in index[0]= 'a' in index[3] !
 and 'k' in index[1] = 'k' in index[2] , if equal will increment var "count" by "1",
 and show if the total count in "count" var = half "word" array , if equal that mean the "true"
 and if equal but the word have some char uppercase the program will print hint and the char have uppercase,
 and if not equal and have just one char different so maybe the user write it wrong so the program will print "False" and select place of error and give hint to user,
 and if not equal and hove more one char different the program will print "false" .


 */

// This One Function With Boolean Type return " True or flase " .
// Hint : This Function Not Have All cases " by the same way inassiment"

def palindrome2(word: String):Boolean={

  word.toArray
  var count = 0
  for (v <- 0 to word.length/2-1) {

    if(word.toLowerCase()(v) == word.toLowerCase()(word.length-1-v))
      count +=1
  } // end if statement

  // make validation if the true or false
  if(count == word.length/2)
    return true
  else
    return false

} // End The First Function "Boolean type"

// Test The Method >>>
palindrome2("Moomn")

// End Test Method >>>

// ===========================================================================

// start second Function with "Unit" type ...
// This Function have more thane cases ....

def palindrome(word: String)={

  word.toArray
  var count = 0

  // Here we want make loop on half array so write "word.length/2" but the length start from 1 and loop start from 0 so write "-1"
  for (v <- 0 to word.length/2-1) {

    /* Here We Want make validation if the first char = last char so write (word .length) and length start from 1 so write "-1" but now "word(word.length/-1)" is fixed not variable
     so write "-v" cuz v=0 in first time and increment 1 in second and so on , now we have variable decrement 1 in each time .
    */

    if(word.toLowerCase()(v) == word.toLowerCase()(word.length-1-v))
      count +=1
  } // End Loop

  // make validation if the true or false
  if(count == word.length/2) {
    println("True")
    for(v <-  0 to word.length-1) {
      if (word(v) != word.toLowerCase()(v))
        println("U Have UpperCase In Your Word '" + word(v) +"'" )
    } // End For Loop
  } // End If Statement

    // make Validation if The uppercase char found or not ...
  else if((word.length/2) - count == 1){
    println("False \n Maybe U Have write error , Try Edit To Blow Line")
    for(v <- 0 to word.length/2-1){
      if(word.toLowerCase()(v) != word.toLowerCase()(word.length-1-v)){
        println(word)
        println("'" + word(word.length-1-v) + "'")
      }// end if statement
    } // end for loop
  } // end else if

    // last end validation
  else
    println("False")

} // end function ^_^

palindrome("a2NnA")