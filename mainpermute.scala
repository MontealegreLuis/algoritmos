object mainpermute{
	def main(args: Array[String]): Unit = {
		val A = Array(10,9,8,7,6,5,4,3,2,1,0);
		val A1 = Array(10,9,8,7,6,5,4,3,2,1,0);
		val A2 = Array(10,9,8,7,6,5,4,3,2,1,0);
		var B = new Ordenar()

		B.PermuteBySorting(A) 

		B.PermuteBySorting(A1) 

		B.PermuteBySorting(A2) 
	}
}