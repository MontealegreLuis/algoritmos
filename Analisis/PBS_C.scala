//Permutación por ordenación

import scala.util.Random

object PBS_C
{
   
    	def Permute_By_Sorting(A:Array[Int]){

        	var n = A.length 

		var m = n*n*n

        	var P = new Array[Int](n)

	        var rand = new Random

	        for(i <- 0 to n - 1){

        	    P(i) = rand.nextInt(m)

        	}
		//var P = Array(36, 3, 62, 19)	

        	Sort(A,P) 
    	}

	def Sort(A:Array[Int], P:Array[Int]){

           var tam = P.length

           var k = 0

           var aux = 0

           var temp = 0

	   var menor = 0

               for(i <- 0 to (tam - 2)){            

		   k = i 

		   menor = P(k)	

                   for(j<-i+1 to tam - 1){

                      if(P(j)<menor){

                          k = j
			  menor = P(k)	
                      }
                   }
                   aux = A(i)
		  
       A(i) = A(k)
		  
       A(k) = aux
		  
       temp = P(i) 
		  
       P(i) = P(k)
		  
       P(k) = temp
               }
		//Imprime (P)
	}
	
  def Imprime(A:Array[Int]){
	
  	for(i<-0 to A.length-1)
	
  		print(" "+A(i))
	
  	println("")	
	
  }

    	def main(args:Array[String]){
  
        	var A = Array(1,2,3,4)
  
        	println("\nArreglo inicial:")
  
        	Imprime(A)          
  
        	Permute_By_Sorting(A)
  
        	println("Arreglo permutado:")
  
        	Imprime(A)
	
  	println("")
	
  }
}