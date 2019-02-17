
/*
= Test Cases ::
 - if user Enter Uppercase Char in word Ex: "aakkkkkbb" , OutPut == > a3k5b2 .

 = implementation :
 - define method "runLengthEncode" with one argument "word" type Is String,
 convert the "word" from string to array with build in method "toArray",
 create String "runLengthEncode" To save the result ,
 we want searching EX: [a,a,a,j,j,j,k,c,c,c] we will make validation if index[0] = index[1] or not and so on ,
 To Do That u have 2 way :
 1- make 2 pointer the first in index[0] and second in index[1] and when going second pointer in last index in array will stop , But i Don't Like To create many var so i will going to try anther way .
 2- make one pointer "v" in the first index[0] in array and validate if the v = v+1 or not , But we will face problem when the pointer in the last index in array and make validate v+1 don't work CUZ out of the rang,
 so i created while Loop has condition if pointer "v" - array.length > 1 in this case work else that out of loop .
 when the while loop is true i created if statement if index[0] = index[1] if true counter increment 1 per time,
 else that the program will save the value on index[v] and value of count in "runLengthEncode" var and set counter by 1 ,
 But Now We Have Big Problem , the program will print all data else the last data if we have "aaabbbccc" will print "a3b3" don't print "c",
 in fact the program read it and make loop and counter But the structure " save data " not available for last char ,
 so make validation if pointer "v" = (word.length-2) will print the last element Explain : rang of array [a,a,a,v,v,b] from 0 to 5
 but length the array is 6 , and while loop have range from 0 to 5 but rang of pointer from 0 to 4 so 6-4 = 2 so make validation if the pointer = word.length-2,
 if true that mean the pointer have last index in his rang and i want print last index in loop rang so i will save in runLengthEncode +=word(v+1) ,
 it's eay But i'm Not Good Instructor :D So PLZ try Delete part of code have comment "delete her" and try run code
*/


// start Function runLengthEncode >>>

def runLengthEncode(word:String) ={

  word.toArray

  var count = 1;
  var runLengthEncode:String = ""
  //for(v <- 0 to (word.length-1)){
  var v = 0

  while ((word.length -v) > 1){

    if(word(v) == word(v+1))
      count +=1

      // delete her ... Try run after Delete :)
    else if(v == (word.length-2)){
      runLengthEncode +=word(v+1)
      runLengthEncode += count
    } // end else if
    else{
      runLengthEncode +=word(v)
      runLengthEncode += count
      count = 1
    } // end else
    v+=1
  } // end while loop
  println(runLengthEncode )

} // end function runLengthEncode ...

// try test code
runLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx")


//======================================================
/*
= Test Cases ::
 - if user Enter number more than 10 Ex "a10b12c30" .

 = implementation :
 - here we creat function with argument "word" take string from user,
 and split it to array and make loop and validated each index val in array
 if the value is string or int , but by defult the datatype is string :D,
 so i'm make validation if the value <= 9 or not ,
 * Hint* in python and c# u can make validation by hexa code EX: f(line[0:1] <=str(9)) this in python ,
 * ********************************8
 * i'm try to solve it with list but i can't delete node of list
  * so i'm try to implementation the linked list and make function delete
   * but when i'm creat node class i can't create variable with data type of class :)
 */

def runLengthDecode(word:String)={

  word.split("")
  println(word.length)
 var total= ""
  var count = 0
  for(v <- 0 to word.length){
    if(word(v) >= 9){
      count = word(v+1)
      println(count)
      var n = 0
      while(n  < count){
        total += word(v)
        n += 1
      } // End While
    } // End If
  } // End runLengthDecode

  println(total)

}


runLengthDecode("c4d5b2")




/*
def runLengthDecode(word:String)={
  word.split("")

  var stuts = 0
  for(v <-word){
    if(word(v) .==(Int)){
    //  if(word(v+1) .==(Int)){
       // stuts = 1
        for(n <- v+1 to word.length){
          if(word(n) .==(Int)){
            stuts = 1
            word(v) += word(n)
            word(n) = 0.0
          }
          else
            stuts = 0
        }

      }
    //}
  }

var total = ""
  for(v <- 0 to word.length){
    if(word(v) .==(Char)){
      var n = 0
      while (n < word(v+1)){
        total += word(v)
        n += 1
      }
    }
  }



println(total)


}


runLengthDecode("n4j2")
