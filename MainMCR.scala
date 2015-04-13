object MainMCR{
  def main(args: Array[String]): Unit = {
    val A = Array(0,1,5,8,9,10,17,17,20,24,30);
    var b = new MemoizedCR2();
    println("Ganancia maxima para un tubo de tamaño 6 es "+ b.MCR2(A,6))
  }
}
