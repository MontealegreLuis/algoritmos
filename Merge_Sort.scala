object Merge_Sort{
	def Merge(A:Array[Int],p:Int,q:Int,r:Int){
		var n1 = q-p+1
		var n2 = r-q
		var h = 0
		var L = new Array[Int](n1+1)
		var R = new Array[Int](n2+1)
		    for(i<-0 to n1-1)
		       L(i)=A(p+(i+1)-1)
		       for(j<-0 to n2-1){
			 h = j+1	
			  R(j) = A(q+h)	
		       	}
		L(n1) = 10000
		R(n2) = 10000
		var i = 0
		var j = 0
		for(k<-p to r){
		   if(L(i) <= R(j)){
		     A(k) = L(i)	
		     i = i+1
		   }
		   else{
		      A(k) = R(j)	
		      j = j+1	 
		   }
		   		 	
		}
			
	}

	def MergeSort(A:Array[Int], p:Int, r:Int){
		//println("\np = "+p+", r = "+r)
			if(p<r){
			  var  q = (p+r)/2
			  //println("q = "+q)	
			  MergeSort(A,p,q) 	
			  MergeSort(A,q+1,r)
			  Merge(A,p,q,r)	
			}
	}
	
	def Imprime(A:Array[Int]){
		for(i<-0 to A.length-1){
		   print(A(i)+" ")	
		}
		
	}

	def main(args:Array[String]){
		var A = Array(10,9,8,7,6,5,4,3,2,1)
		var p = 0
		var r =	A.length	
		println("\nArreglo Inicial: ")		
		Imprime(A)
		MergeSort(A,p,r-1)
		println("\nArreglo Ordenado:")
		Imprime(A)
		println("\n") 

		
	}
}
