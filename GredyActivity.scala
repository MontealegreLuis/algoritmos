object GredyActivity{

var S=Array(1,3,0,5,3,5,6,8,8,2,12)
var F=Array(4,5,6,7,9,9,10,11,12,14,16)
var n=S.length-1
var A="(" + S(0) + "," + F(0) + ")" + " "

def GA(S:Array[Int],F:Array[Int]): String ={
var k=0
for (m <-1 to n){
if(S(m) >= F(k)){
A= A + "(" + S(m)+"," + F(m) + ")" + " "
k=m
}
}
return A
}

def main(args:Array[String]){
GA(S,F)	

print("Los conjuntos compatibles son:" + A)
}
}