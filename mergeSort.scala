
object mergeSort {

  def sort(A: Array[Int], p: Int, r: Int) {
    if (p < r) {
      val q = (p + r) / 2
      sort(A, p, q)
      sort(A, q + 1, r)
      merge(A, p, q, r)
    }
  }


  def merge(A: Array[Int], p: Int, q: Int, r: Int) = {
    val n1 = q - p + 1
    val n2 = r - q
    val L = new Array[Int](n1 + 1)
    val R = new Array[Int](n2 + 1)

    for (i <- 0 to n1 - 1) { L(i) = A(p + i)}
    L(L.length - 1) = 999999
    
    for (i <- 0 to n2 - 1) { R(i) = A(q + i + 1)}
    R(R.length - 1) = 999999

    var i = 0
    var j = 0

    for (k <- p to r) {
      if (L(i) < R(j)) {
        A(k) = L(i)
        i = i + 1
      }
      else {
        A(k) = R(j)
        j = j + 1
      }
    }
  }
  

  def main(args: Array[String]) {
    var A = Array(10, 13, 94, 9, 180, 8, 99, 30, 2)
    print("Original: ")
        for(Cont <- A){print(Cont + " ")}
        print("\n")

    sort(A, 0, A.length - 1)
        print("Ordenado: ")
        for(Cont <- A){print(Cont + " ")}
  }


  
}