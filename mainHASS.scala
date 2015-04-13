object mainHASS{
	def main(args: Array[String]): Unit = {
	    val A = Array(10,9,8,7,6,5,4,3,2,1,0)
	    val A1 = Array(10,9,8,7,6,5,4,3,2,1,0)
		val Ca = new hire()

		println("\n\nSeleccion por Inplace\n\n")

		Ca.selinpl(A)

		println("\n\nSeleccion por permutacion\n\n")

		Ca.selPerm(A1)
	}
 }
