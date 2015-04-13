object mainMCR{
	def main(args: Array[String]): Unit = {
		val A2 = Array(0,1,5,8,9,10,17,17,20,24,30);
		var b = new MCutRod();
		println("La ganancia maxima para un tubo de 4 es "+ b.MemoCutR(A2,4)) 
	}	
}