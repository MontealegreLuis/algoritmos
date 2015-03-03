object HelloWorld {
  def main(args: Array[String]) {
    val A = Array(2, 300, 45, 18, 29)
    var insertion = new InsertionSort()

    insertion.sort(A, true)

    for (number <- A) {
      println(number)
    }
  }
}

class InsertionSort{
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
}
