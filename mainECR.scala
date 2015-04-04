object mainECR{
	def main(args: Array[String]): Unit = {
	  val A2 = Array(0,1,5,8,9,10,17,17,20,24,30)
	  val B = new ExtCutRod();

	  B.PrintCutRodSolution(A2,4)
	}
	
}