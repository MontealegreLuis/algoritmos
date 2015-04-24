class InsertionSort{
  def main(args: Array[String]){
    var key = 0
    var i = 0
    var A=Array(3,5,7,2,4,7)
    var asc=true

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