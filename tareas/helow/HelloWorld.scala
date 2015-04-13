package helow

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