object PermutacionOrdenacion2{
    def RIP(A:Array[Int],B:Array[Int]){
        var azar = new scala.util.Random
        var aux = 0
        var indice = 0

	val n = A.length * A.length * A.length
        var Ran = new scala.util.Random
       
        for(i <- 0 to A.length - 1){
            B(i) = Ran.nextInt(n)
        }
	
    }
    def main(args:Array[String]){
        var A = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	var B = new Array[Int](A.length)
        
	var key=0
	var j=0
	var x=0 
	var cont=0
	var aux=0
        
        println("El arreglo Original es:\n")
        for(i<- 0 to A.length-1)
            println("A["+i+"]="+A(i))
	
            
        println("\n")
          
        RIP(A,B)
        
        println("El arreglo Permutado es:\n")
        for(i<- 0 to B.length-1)
            println("B["+i+"]="+B(i))
	
	
	//Ordenacion por permutacion
	///Ordenacion 
	for (i <- 0 to B.length-1) {
      		key = B(i)
      		j = i
		x = 0
      		while (j<B.length) {
                   
	   	   if(key>B(j)){
		      key=B(j)
		      x=j	
	    	   }
	           j=j+1 
        	}
		if(key!=B(i)){
		   B(x)=B(i)
		   B(i)=key
        	   aux=A(i)
		   A(i)=A(x)
		   A(x)=aux
 		}
        }
	println("El arreglo B Ordenado es:\n")
        for(i<- 0 to B.length-1)
            println("B["+i+"]="+B(i))

	println("El arreglo Permutado y Ordenado es:\n")
        for(i<- 0 to A.length-1)
            println("A["+i+"]="+A(i))
	//////Contratacion
	key=A(0)
	for(i<-0 to A.length-1)
	{
	   if(key < A(i)){
		key=A(i)
		cont=cont+1
	   }
	}
	println("Se contrato a:"+key+" despues de haber contratado a" +cont+" anteriores a el")
	

	
    }
}




////Permute-By-Sorting
