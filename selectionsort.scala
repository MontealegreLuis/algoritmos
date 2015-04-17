object selectionsort{
	def selection(A:Array[Int], Tam:Int){
		var indice = 0
        	var aux = 0
        	var min = 0
        	for(i <- 0 to (Tam - 1)){
            	indice = i
            	min = A(i)
            	for(j <- (i + 1) to (Tam - 1)){
                	if(min > A(j)){
                    		min = A(j)
                    		indice = j
                	}
            	}
            	if(indice != i){
                	aux = A(indice)
                	A(indice) = A(i)
                	A(i) = aux
            	}
        	}
    	}
    	def main(args:Array[String]){
		var A = Array(32,12,43,6,5,9,21,69,32,12,4,32,9)        
		var tam: Int = A.length
		print("\nArreglo original:\n|")
        	for(i <- A){
        	    print(i+"|")
        	}
        	println("\n")
        	selection(A, tam)
        	print("Arreglo ordenado por selection sort:\n|")
        	for(i <- A){
        	    print(i+"|") 
		    
        	}
		println("\n")
    	}
}
