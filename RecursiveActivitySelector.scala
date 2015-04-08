package alg_voraces

object RecursiveActivitySelector {

	var A: Array[Actividad] = crearConjuntoDeActividades()

	def main(args: Array[String]) {
		var res = recursive_Activity_Selector(0, 11)
		
		println("Resultado de las actividades seleccionadas: ")
		var resArray : Array[String] = new Array[String](res.length)
		for (i <- 0 until res.length){
			resArray(i) = res(i).getNombre()
		}
		println(resArray.mkString(", ") + "\n\nDetallado con sus respectivos tiempos:")
		
		
		// Conjunto de las actividades con sus horas
		res foreach { 
			tempActividad => println(tempActividad.toString()) 
		}
	}
	

	def recursive_Activity_Selector(k: Int, n: Int): Array[Actividad] = {
		var m = k + 1
		var ban = true
		
		while (m <= n && ban) {
			if (A(m).getS() < A(k).getF())
				m = m + 1
			else
				ban = false
		}

		if (m <= n)
			return Array(A(m)) ++ recursive_Activity_Selector(m, n)
		else
			return Array()
	}

	def crearConjuntoDeActividades(): Array[Actividad] = {
		return Array(
				new Actividad("a0",  -1, -1), 
				new Actividad("a1",   1,  4), 
				new Actividad("a2",   3,  5), 
				new Actividad("a3",   0,  6), 
				new Actividad("a4",   5,  7), 
				new Actividad("a5",   3,  9), 
				new Actividad("a6",   5,  9), 
				new Actividad("a7",   6, 10), 
				new Actividad("a8",   8, 11), 
				new Actividad("a9",   8, 12), 
				new Actividad("a10",  2, 14), 
				new Actividad("a11", 12, 16)
			)
	}

	/**
	 * Clase utilizada para guardar las actividades y tener mayor control y modularidad
	 *
	 * @param 	mActividad	:String Nombre de la actividad creada
	 *
	 * @param	s			:Int Hora de inicio de la actividad
	 *
	 * @param	f			:Int Hora de fin de la actividad
	 */
	class Actividad(var mActividad: String, var s: Int, var f: Int) {

		/**
		 * GETTERS Y SETTERS
		 */
		def getS(): Int = {
			return s
		}

		def setS(s: Int) {
			this.s = s
		}

		def getF(): Int = {
			return f
		}

		def setF(f: Int) {
			this.f = f
		}

		def getNombre(): String = {
			return mActividad
		}

		def setNombre(act: String) {
			this.mActividad = act
		}

		override def toString: String = {
			return mActividad + "(" + s + "," + f + ")"
		}
	}
}