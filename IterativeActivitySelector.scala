package alg_voraces

import alg_voraces.RecursiveActivitySelector.Actividad
import alg_voraces.RecursiveActivitySelector.crearConjuntoDeActividades

object IterativeActivitySelector {
	
	var A: Array[Actividad] = crearConjuntoDeActividades()

	def main(args: Array[String]) {
		var res = greedyActivitySelector()
		
		println("Resultado de las actividades seleccionadas: ")
		var resArray : Array[String] = new Array[String](res.length)
		for (i <- 0 until res.length){
			resArray(i) = res(i).getNombre()
		}
		println(resArray.mkString(", ") + "\n\nActividades con sus respectivos tiempos:")
		

		// Conjunto de las actividades con sus horas
		res foreach { 
			x => println(x.toString()) 
		}
	}

	def greedyActivitySelector(): Array[Actividad] = {
		val n = A.length - 1
		var res = Array(A(1))
		var k = 1
		
		for (m <- 2 to n) {
			if (A(m).getS() >= A(k).getF()) {
				res = res ++ Array(A(m))
				k = m
			}
		}
		return res
	}
}