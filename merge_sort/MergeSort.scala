package merge_sort

object MergeSort {

  def main(args: Array[String])
  {
    var arreglo = Array(10,4,7,3,1,8,6,2)
    println("Este es tu arreglo original: ")
    for(i<-0 to arreglo.length-1)
      print(arreglo(i)+" ")
    var B = merge_sort(arreglo,0,arreglo.length-1)
    println("\nEste es tu arreglo ordenado: ")
    for(i<-0 to B.length-1)
      print(B(i)+" ")
  }
  
  def merge_sort(A: Array[Int], p: Int, r: Int): Array[Int] = 
  {
    if (p < r)
    {
       var q = (p+r)/2
      merge_sort(A,p,q)
      merge_sort(A,q+1,r)
      merge(A,p,q,r)
    }
    return A
  }
  
  def merge(A: Array[Int], p: Int, q: Int, r: Int): Array[Int] =
  {
    val n1 = q - p + 1
    val n2 = r - q

    var L = Array.ofDim[Int](n1+1)
    var R = Array.ofDim[Int](n2+1)
    
    for(i<-0 to n1-1)
      L(i) = A(p + i)
    for(j<-0 to n2-1)
      R(j) = A(q + j + 1)    
    L(n1) = 999999999
    R(n2) = 999999999
    var i=0
    var j=0
    for(k<-p to r)
    {
      if(L(i) <= R(j))
      {
        A(k) = L(i)
        i = i+1
      }
      else{
        A(k) = R(j)
        j = j+1
      }
    }
    return A
  }
}