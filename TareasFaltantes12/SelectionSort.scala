object SelectionSort
{
    def main(args: Array[String]){
        var aux=0
        var temp=0
        var A=Array(1000,13,34,2,6,80,1)
        var j=0
        var i=0

        for ( i<-0 to A.length-1){
             temp=i
             for(j<-i+1 to A.length-1){
                if(A(j)<A(temp)){
                  temp=j
                }
             }
         aux= A(i)
         A(i) = A(temp)
         A(temp) = aux
        }
      for (ordenado <- A) {
        println(ordenado)
      }
    }
}

