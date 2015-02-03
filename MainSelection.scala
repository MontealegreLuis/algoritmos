object MainSelection{
	def main(args: Array[String]): Unit = {
		val A = Array(10,9,56,7,6,5,4,1000,2,2,0)
		var B = new SelectionSort();

		B.Selection(A);

		for( imp <- A){
			println(imp)
		}
	}
	
}