object Insertion{

def main(args:Array[String]){

var A=Array(6,5,3,1,8,7,2,4)

var j=0
var temp=0

for(i<-1 to 7) {
j=i
while( j > 0 && A(j-1) > A(j) ) {
temp =A(j)
A(j)=A(j-1)
A(j-1)=temp
j=j-1
}
}
println("El vector es:")
var i=0

while(i<8){
print(A(i)+" ")
i=i+1
}

}
}