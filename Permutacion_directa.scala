object Permutacion_directa{

    def Permuta_directa(A:Array[Int]){
       
        var x = new scala.util.Random
        var aux = 0
        var indice = 0
        for(i <- 0 to A.length - 1){
	    println("i="+i)
            aux = A(i)
	    var rnd = new GenRandInt(i,A.length-1)
	    indice = rnd.next
            println("indice "+indice)
            println("a("+i+")= "+A(i))
            aux=A(i)
	    A(i)=A(indice)
            A(indice) = aux
	    println("a("+indice+")= "+A(indice))
        }
    }

    def main(args:Array[String]){
	
        var A = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        
	var key=0
	var j=0
	var x=0 

        println("El arreglo normal es:\n")
        for(i <- A)
            print(i + ", ")
            
        println("\n")
          
        Permuta_directa(A)
        
        println("El arreglo con permutacion directa es:\n")
        for(i <- A)
            print(i + ", ")
       println("\n")

	//Ordenacion por permutacion
	///Ordenacion 
	for (i <- 0 to A.length-1) {
      		key = A(i)
      		j = i
		x = 0
      		while (j<A.length) {
                   
	   	   if(key>A(j)){
		      key=A(j)
		      x=j	
	    	   }
	           j=j+1 
        	}
		if(key!=A(i)){
		   A(x)=A(i)
		   A(i)=key
 		}
        }
	println("El arreglo A Ordenado es:\n")
        for(i<- 0 to A.length-1)
            println("A["+i+"]="+A(i))

    }
}

class GenRandInt(lb : Int, ub : Int)
{
private var rnd = new scala.util.Random
def next() : Int = { lb + rnd.nextInt(ub) }
}


///RANDOMIZED-IN-PLACE


