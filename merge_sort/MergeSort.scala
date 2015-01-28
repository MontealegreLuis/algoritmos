package merge_sort

object MergeSort {

  def main(args: Array[String])
  {
    var A = Array(1,2,3,4,5)
    
    var B = merge_algoritmo(A,0,2,5)
    for(i<-0 to B.length-1)
      println(B(i))
  }
  
  def merge_algoritmo(A: Array[Int], p: Int, q: Int, r: Int): Array[Int] =
  {
    val n1 = q - p
    val n2 = r - q

    var L = Array.ofDim[Int](n1+1)
    var R = Array.ofDim[Int](n2+1)
    
    for(i<-0 to n1-1)
      L(i) = A(p + i)
    for(j<-0 to n2-1)
      R(j) = A(q + j)    
    L(n1) = 999999999
    R(n2) = 999999999
    var i=0
    var j=0
    for(k<-p to r-1)
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