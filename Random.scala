import scala.util.Random
object Random{
def main(args:Array[String]){

var A=Array(1,2,3,4,5,6,7,8,9,10)	
var R=new Array[Int](A.length)
var x =new Random


for (i<-0 to A.length-1){

R(i)=x.nextInt(A.length*A.length*A.length) 

//for (i<-0 to A.length-1){
//R(i)=x.nextInt(1000) 

}

var i=0
var j =0
var temp=0
var aux=0

for(i<-1 to A.length-1 ) {
j= i
while( j > 0 && R(j-1) > R(j) ) {
temp =R(j)
aux=A(j)
R(j)=R(j-1)
A(j)=A(j-1)
R(j-1)=temp
A(j-1)=aux
j=j-1
}
}

println("El arreglo revuelto queda asi:")
for(i<-0 to A.length-1){
print(A(i)+" ")
}

}
}