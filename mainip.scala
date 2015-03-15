object mainip{
	def main(args: Array[String]): Unit = {
		val A = Array(10,9,8,7,6,5,4,3,2,1,0);
		val A1 = Array(10,9,8,7,6,5,4,3,2,1,0);
		val A2 = Array(10,9,8,7,6,5,4,3,2,1,0);
		var B = new Randomize()

		println("------------------------------------------")
		B.Inplace(A)

		for( imp <- A){
			println(imp)
		} 
		println("------------------------------------------")
		B.Inplace(A1) 

		for( imp <- A1){
			println(imp)
		}
		println("------------------------------------------")
		B.Inplace(A2)


		for( imp <-A2){
			println(imp)
		} 
	}
}