object Activity{

var S=Array(-10000,1,3,0,5,3,5,6,8,8,2,12)
var F=Array(-10000,4,5,6,7,9,9,10,11,12,14,16)
var k=0
var n=S.length-1
var Cadena=""

def RAS(S:Array[Int],F:Array[Int],k:Int,n:Int): String ={
var m=k+1
while(m <= n && S(m) < F(k))
m=m+1
if(m<=n){
Cadena =" (" + S(m) + "," + F(m) + ") " + RAS(S,F,m,n)
return Cadena
}
else
return " "
}

def main(args:Array[String]){
RAS(S,F,k,n)	

print("Los conjuntos compatibles son:" + Cadena)
}
}