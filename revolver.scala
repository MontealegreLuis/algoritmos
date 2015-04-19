import scala.util.Random
object Revolver{
def main(args:Array[String]){

var A=Array(1,2,3,4,5,6,7,8,9,10)	
var x = new Random
var n=A.length-1
var temp=0
var r=0

for (i<-0 to A.length-2){
temp=A(i)
r = i + x.nextInt( (n - i) + 1 )
A(i) = A(r)
A(r)=temp
}

println("El arreglo revuelto queda asi:")
for(i<-0 to A.length-1){
print(A(i)+" ")
}


}
}