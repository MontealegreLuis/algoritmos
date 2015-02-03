//Metodo de ordenamiento "MergeSort"- Main
// Gerardo Flores Petlacalco
//201124783
//Analisis y diseño de algoritmos
object Main{
	def main(args: Array[String]): Unit = {
		val A = Array(10,9,8,7,6,5,4,3,2,1,0);

		var B = new MergeSort();

		B.Merge(A, 0, (A.length - 1) );

		for( imp <- A){
			println(imp)
		}
	}
	
}