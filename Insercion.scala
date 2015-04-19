object Insercion{
def main(args:Array[String]){
var A=Array(60,5,1,12,4,34,7,89,30,15)

var i=0
var j =0
var temp=0


for( i<-1 to A.length-1 ) {
j= i
while( j > 0 && A(j-1) > A(j) ) {
temp =A(j)
A(j)=A(j-1)
A(j-1)=temp
j=j-1
}
}
println("el vector es:\n")
i=0
while(i<A.length){
print(A(i)+" ")
i=i+1
}

        
}
}