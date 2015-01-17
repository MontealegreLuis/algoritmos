val msg1 = "fizz "
val msg2 = "buzz "
var i = 1
while(i <= 100){
  if ((i % 3 == 0) && (i % 5 == 0))
   println(msg1 + msg2)
  else if (i % 3 == 0)
    println(msg1) 
  else if (i % 5 == 0) 
    println(msg2)   
   else println(i)
  i+=1
}
