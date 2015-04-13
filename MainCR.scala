object MainCR1 {
  def main(args: Array[String]): Unit = {
      val A = Array(0,1,5,8,9,10,17,17,20,24,30);
      var Cr = new CutRod1();

      println("Ganancia maxima para un tubo de tamaño 5 es: "+ Cr.Cutrod1(A,5))
  }
}
