package selecc

object Seleccion{
    def SelectionSort(A:Array[Int], Tamayo:Int){
      var aux = 0 
      var index = 0
      var men = 0
        for(i <- 0 to (Tamayo - 1)){
            index = i
            men = A(i)
            for(j <- (i + 1) to (Tamayo - 1)){
                if(men > A(j)){
                    men = A(j)
                    index = j
                }
            }
            if(index != i){
                aux = A(index)
                A(index) = A(i)
                A(i) = aux
            }
        }
    }
    def main(args:Array[String]){
        var A = Array(98,89,1,0,44,2,55,21,5)
        print("Original: ")
        for(Cont <- A){print(Cont + " ")}
        print("\n")
        SelectionSort(A, A.length)
        print("Ordenado: ")
        for(Cont <- A){print(Cont + " ")}
    }
}