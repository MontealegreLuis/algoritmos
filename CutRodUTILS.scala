package cut_rod

import scala.Array._
import cut_rod.Bottom_Up_Cut_Rod._
import cut_rod.Cut_Rod._
import cut_rod.Memorized_Cut_Rod._
import cut_rod.ExtendedBottomUpCutRod._


/**
 * Clase nos instanciable con métodos útiles para la implementación de los
 * algoritmos de Cut Rod vistos durante la clase
 *
 * Nos será de utilidad esta clase para evitar repetir código
 */
object CutRodUTILS {

	/**
	 * ENUM Definido para poder parametrizar con mayor facilidad
	 */
	object TIPO_DE_EJECUCION_CUT_ROD extends Enumeration {
		//type TIPO_DE_EJECUCION_CUD_ROD = Value
		val CUT_ROD, MEMORIZED_CUT_ROD, BOTTOM_UP_CUT_ROD, EXTENDED_BOTTOM_UP_CUT_ROD = Value
	}

	/**
	 * Función principal que ejecuta todo lo caracteristico del método main
	 * de los 3 tipos de algoritmos vistos en clase. A continuación se
	 * enlistan los tipos de parametros que deben proporcionarse para que
	 * la función pueda llevarse a cabo
	 *
	 * @param	quien				Tipo de ejecución que se está realizando
	 * 
	 * @param	tamanioPipe			Tamaño del Tubo usado en el algoritmo
	 *
	 * @param	queArrayPrecios		El Array de precios por tubo
	 */
	def mostrarEjecucionDeUnProgramaMainDeCutRod(
		quien: TIPO_DE_EJECUCION_CUT_ROD.Value,
		tamanioPipe: Int,
		queArrayPrecios: Array[Int]) = {
		
		
		// Mostramos el tipo de ejecución que se efectua según el caso
		var which = "Se esta ejecutando el algoritmo: "
		quien match {
			case TIPO_DE_EJECUCION_CUT_ROD.BOTTOM_UP_CUT_ROD => 
				println(which + TIPO_DE_EJECUCION_CUT_ROD.BOTTOM_UP_CUT_ROD.toString())
				
			case TIPO_DE_EJECUCION_CUT_ROD.CUT_ROD => 
				println(which + TIPO_DE_EJECUCION_CUT_ROD.CUT_ROD.toString())
				
			case TIPO_DE_EJECUCION_CUT_ROD.MEMORIZED_CUT_ROD => 
				println(which + TIPO_DE_EJECUCION_CUT_ROD.MEMORIZED_CUT_ROD.toString())
		
			case TIPO_DE_EJECUCION_CUT_ROD.EXTENDED_BOTTOM_UP_CUT_ROD => 
				println(which + TIPO_DE_EJECUCION_CUT_ROD.EXTENDED_BOTTOM_UP_CUT_ROD.toString())
		}
		

		// Mostramos los tamaños de tubos disponibles
		imprimeDialogoYArray(
					"Tamaños disponibles de los tubos:",
					range(1, 11))

		// Mostramos el arreglo de ganancias según tamaño
		imprimeDialogoYArray(
					"Arreglo de precios segun tamaño del tubo:", 
					queArrayPrecios)
					

		// Mostramos los resultados
		println("\nMaxima ganancia de cortar un tubo de: " + tamanioPipe + " metros");
		
		
		// Mandamos a llamar, Ejecutamos e Imprimimos el 
		// resultado según el algoritmo solicitado
		which = "Ganancia: $"
		quien match {
			case TIPO_DE_EJECUCION_CUT_ROD.BOTTOM_UP_CUT_ROD => 
				println(which + bottomUpCutRodAlgorithm(tamanioPipe))
				
			case TIPO_DE_EJECUCION_CUT_ROD.CUT_ROD => 
				println(which + cutRodAlgorithm(tamanioPipe))
				
			case TIPO_DE_EJECUCION_CUT_ROD.MEMORIZED_CUT_ROD => 
				println(which + memorizedCutRodAlgorithm(tamanioPipe))

			case TIPO_DE_EJECUCION_CUT_ROD.EXTENDED_BOTTOM_UP_CUT_ROD => 
				println(which + extended_Bottom_Up_Cut_Rod(tamanioPipe))				
		}
	}
	
	
	
	/**
	 * Método útil para "factorizar codigo" en cuanto a todas las impresiones 
	 * de un diálogo y un array
	 * 
	 * @param 	dialogo		String que acompañará a nuestro array
	 * 
	 * @param	mArray		Array a ser impreso
	 */
	def imprimeDialogoYArray(dialogo: String, mArray: Array[Int]) {
		println("\n" + dialogo + "\n" + mArray.mkString(", "))
	}
}









