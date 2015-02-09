class MergeSort{

def Merge(A:Array[Int],p:Int,q:Int,r:Int)={
val n1=q-p+1
val n2=r-q

var L=new Array[Int](n1+1)
var R=new Array[Int](n2+1)

L(L.length)=999999
R(R.length)=999999

for(i<-0 to n1-1){
L(i)=A(p+i)	
}
for(i<-0 to n2-1){
R(i)=A(q+i+1)	
}

var i=0
var j=0

for(k<-p to r){
if(L(i)<R(j)){
A(k)=L(i)	
i=i+1
}
else{
A(k)=R(j)
j=j+1}	
}

}

def Sort(A:Array[Int],p:Int,r:Int){

if(p<r){
var q=(p+r)/2
Sort(A,p,q)
Sort(A,q+1,r)
Merge(A,p,q,r)
}
}

def main(args:Array[String]){
    var M = new MergeSort()
	var A =Array(120,13,4,99,18,6,4,300,2)
	M.Sort(A,0,A.length-1)
	for(i<-0 to A.length-1){
	print(A(i)+", ")	
	}
}


}