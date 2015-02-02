object AlgoritmoMerge {
    def Merge(A:Array[Int], p:Int, q:Int, r:Int){
        var infinito = 999999999
        var i = 0; var j = 0;
        var n1 = (q - p) + 1
        var n2 = r - q
        var L = new Array[Int](n1 + 1)
        var R = new Array[Int](n2 + 1)
        for(l <- 0 to L.length - 1)
            L(l) = A(l)
        for(l <- 0 to R.length - 1)
            R(l) = A(q + l)
        
        L(n1) = infinito
        R(n2) = infinito
            
        i = 0
        j = 0
        println("p: " + p + " r: " + (r-1))
        for(k <- p to r - 1){
            if(L(i) <= R(j)){
                A(k) = L(i)
                i = i + 1
            }
            else{
                A(k) = R(j)
                j = j + 1
            }
        }
    }
    
    def merge_sort(A:Array[Int], p:Int, r:Int){
        if(p < r){
            val q = (p + r)/2
            merge_sort(A, p, q)
            merge_sort(A, q + 1, r)
            Merge(A, p, q, r)
        }
    }
    
    def main(agrs:Array[String]){
        var A = Array(8, 9, 3, 0, 13, 45, 1,3, 54, 5)
        println("Arreglo Normal:")
        for(num <- A){
            print(num + ", ")
        }
        print("\n")
        merge_sort(A, 0, A.length)
        println("\n\nArreglo Ordenado:")
        for(num <- A){
            print(num + ", ")
        }
    }
}