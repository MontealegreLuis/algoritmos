object InsertionSort{

  def sort(A: Array[Int], asc: Boolean){
    var key = 0
    var i = 0

    for (j <- 1 to A.length - 1) {
      key = A(j)
      i = j - 1
      while (i >= 0 && compare(A(i), key, asc)) {
        A(i + 1) = A(i)
        i = i - 1
      }
      A(i + 1) = key
    }
  }

  def compare(a: Int, b: Int, asc: Boolean): Boolean = {
    if (true == asc) {
      return a > b
    }
    return a <= b
  }

  def main(args:Array[String]){
        var A = Array(8, 2, 1, 7, 9, 3, 6, 2, 1, 5, 4)
        println("El Arreglo Original:\n")
        for(i <- A){
            print(i + ", ") 
        }
        println("\n")
        sort(A, true)
        println("El Arreglo Ordenado:\n")
        for(i <- A){
            print(i + ", ") 
        }
       println("\n")
  }
}
