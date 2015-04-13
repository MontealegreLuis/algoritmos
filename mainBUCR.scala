object mainBUCR{
	def main(args: Array[String]): Unit = {
		val A2 = Array(0,1,5,8,9,10,17,17,20,24,30)
		var B = new BUpCutRod()

    	println("La ganancia maxima para un tubo de 4 es "+ B.ButtonUpCutRod(A2,4)) 
	}
}