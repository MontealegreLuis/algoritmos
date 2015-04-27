//Tarea 13
//Rayen Ari Ramos Rocha

object mainRecuActivitySelector{
	def main(args: Array[String]): Unit = {
		val S = Array(1,3,0,5,3,5,6,8,8,2,12)
		val F = Array(4,5,6,7,9,9,10,11,12,14,16) 

		var R = new RecuActivitySelector();

		println("Actividades compatibles: \n\n")
		println(R.RecursiveActivitySelector(S,F,0,10));
	}
}
