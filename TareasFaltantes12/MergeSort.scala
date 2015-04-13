/**
 * Created by Clarissa on 11/04/2015.
 */
 object MergeSort {
    def main(args: Array[String]){
        var A = Array(1000,1,200,450,23,45,56,0,3,999,10)
        print("ARREGLO INICIAL: ")
        for(i<-0 to A.length-1)
            print(A(i)+" ")
        var b = mergeSort(A,0,A.length-1)
        print("\nARREGLO FINAL: ")
        for(i<-0 to b.length-1)
            print(b(i)+" ")
    }

    def mergeSort(AA: Array[Int], p: Int, r: Int): Array[Int] ={
        if (p < r){
            var q = (p+r)/2
            mergeSort(AA,p,q)
            mergeSort(AA,q+1,r)
            Mergesort(AA,p,q,r)
        }
        return AA
    }
    def Mergesort(A1: Array[Int], p: Int, q: Int, r: Int): Array[Int] ={
        val n1 = q - p + 1
        val n2 = r - q
        var Izq = Array.ofDim[Int](n1+1)
        var Der = Array.ofDim[Int](n2+1)
        for(i<-0 to n1-1)
           Izq(i) = A1(p + i)
        for(j<-0 to n2-1)
           Der(j) = A1(q + j + 1)
        Izq(n1) = 1000000
        Der(n2) = 1000000
        var i=0
        var j=0
        for(k<-p to r){
            if(Izq(i) <= Der(j)){
                A1(k) = Izq(i)
                i = i+1
            }
            else{
                A1(k) = Der(j)
                j = j+1
            }
        }
        return A1
    }
 }

