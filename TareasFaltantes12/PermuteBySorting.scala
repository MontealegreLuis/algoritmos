
object PermuteBySorting{
  	 def PermuteBySorting(A: Array[Int])={
      		println("\n Generacion del arreglo aleatorio \n")
      		var v =math.pow(A.length, 3)
      		val r = new scala.util.Random
      		var L = new Array[Int](A.length)
      		for( i <- 0 to A.length-1) {
         			L(i) = r.nextInt(v.toInt)
      		}
      		for( i <- 0 to A.length-1){
              println(A(i)+" "+L(i))
          }
      		Sort(L,A)
     }

     def Sort(A: Array[Int], P: Array[Int]) = {
           println("\n El arreglo ordenado es:\n")
           var (minimo, aux, aux2) = (0,0,0)
           for( i <- 0 to (A.length - 2)) {
               minimo = i
      			   for( j <- (i + 1) to (A.length - 1)) {
        				   if(A(j) < A(minimo)){
          					   minimo = j
          				 }
        		   }
      		     aux = A(i)
      			   aux2 = P(i)
               A(i) = A(minimo)
      			   P(i) = P(minimo)
      			   A(minimo) = aux
               P(minimo) = aux2
      		 }

    		   for( i <- 0 to A.length-1) {
    			      println(P(i)+" "+A(i))
    		   }
     }


     def main(args: Array[String]) {
    		    val A = Array(0,1,2,3,4,5,6,7,8,9,10);
            PermuteBySorting(A)
    }
  }