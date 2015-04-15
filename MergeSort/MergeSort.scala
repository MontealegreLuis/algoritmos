//Daniel Elias Vazquez Lobato
//Implematacion del Algoritmo MergeSort
//Analisis y Diseño de Algoritmos

object MergeSort {

  def main(args: Array[String])
  {
    var a = Array(20,11,3,6,2,1,58,4,23,17)
    print("Arreglo original: ")
    for(i<-0 to a.length-1)
      print(a(i)+" ")

    var b = mergeSort(a,0,a.length-1)
    print("\nArreglo ordenado: ")
    for(i<-0 to b.length-1)
      print(b(i)+" ")
  }
  
  def mergeSort(a2: Array[Int], p: Int, r: Int): Array[Int] = 
  {
    if (p < r)
    {
      var q = (p+r)/2
      mergeSort(a2,p,q)
      mergeSort(a2,q+1,r)
      Mergesort(a2,p,q,r)
    }
    return a2
  }
  
  def Mergesort(a3: Array[Int], p: Int, q: Int, r: Int): Array[Int] =
  {
    val n1 = q - p + 1
    val n2 = r - q


    var Izq = Array.ofDim[Int](n1+1)
    var Der = Array.ofDim[Int](n2+1)
    
    for(i<-0 to n1-1)
      Izq(i) = a3(p + i)
    for(j<-0 to n2-1)
      Der(j) = a3(q + j + 1)    
    Izq(n1) = 100000000
    Der(n2) = 100000000
    var i=0
    var j=0
    for(k<-p to r)
    {
      if(Izq(i) <= Der(j))
      {
        a3(k) = Izq(i)
        i = i+1
      }
      else{
        a3(k) = Der(j)
        j = j+1
      }
    }
    return a3
  }
}

