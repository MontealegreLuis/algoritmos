object SelectionSort{
	
def main(args:Array[String]){
var A=Array(60,5,1,12,4,34)
var f=0
var t=0
var temp=0
var aux=0

for(i<-0 to 4){
temp=0
t=A(i)

for(j<-i+1 to 5){
if(t>A(j)){
f=1
aux=j
t=A(j)	
}
}
if(f==1){
temp=A(i)
A(i)=A(aux)	
A(aux)=temp
f=0
}
}

for(i<-0 to 5){
println(A(i))}

}
}