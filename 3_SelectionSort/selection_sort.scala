object SelectionSort{
     
     def selection_sort(A: Array[Int]){
	var menor = 0 
	var k = 0
     	for (i <- 0 to A.length-2) {
      		menor = A(i)
		k=i
		for(j<-i+1 to A.length-1){
			if(A(j)<menor){
			  menor = A(j)
			  k = j
			}
	        }
		A(k) = A(i)
		A(i) = menor
        }
	Imprime(A)	
     }

     def Imprime(A:Array[Int]){
	for(i<-0 to A.length-1)
			print(" "+A(i))
		println("")	
     }

       def main (args: Array [String]){
     	var A=Array(91,9,58,47,16,25,4,83,22,100)
		println("\n\nOrdenamiento por Selección \n\nArreglo Inicial: ")			
		Imprime(A)	
		println("\nArreglo Ordenado: ")			
		selection_sort(A)	
		println("")	
 	}      
     	
}
