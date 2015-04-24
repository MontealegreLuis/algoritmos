/*
  Tarea 12: Hacer en Scala Recursive-Activity-Selector(s,f,k,n)
    s y f son arreglos del tiempo donde inicia y termina la actividad
    k es el tamaño del subproblema actual
    n es el tamaño del problema original
*/
//On branch Tar12_RecursiveActivitySelector
import Array._

object RecActSel
{
  def main(args:Array[String])
  {
    var s = Array(1, 3, 0, 5, 3, 5, 6,   8,  8,  2, 12)
    var f = Array(4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16)
    var k = -1
    var n = s.length
    println("Columnas:")
    for(i<-1 to 11)
      print(i+"\t")
    println()
    println("Matrices S y F")
    for(i <- s)
      print(i + "\t") 
    println()

    for(i <- f)
      print(i + "\t") 
    println()

    //f(0) = 0	El tiempo final para la actividad cero es: cero
    var sol = Array[Int](10) //Matriz que será el arreglo solución
    sol = RAS(s,f,k,n-1)//Llamado a la RecursiveActivitySelector

    println("Conjunto solucion(el cero es conjunto vacio):\n")
    for(i<-sol)
      print((i+1)+" ")
    println()
  }//Llave del main

  def RAS(s: Array[Int], f: Array[Int], k: Int, n: Int): Array[Int] =
  {
    var vacio = Array(-1)
    var resul = Array[Int](10)
    var sol = Array[Int](10)
    var m = k+1
    if(k != -1)//Para que no entre la primera vez
      while( (m<=n)&&( s(m)<f(k) ) )
        m = m+1
    if(m <= n)
    {
      var ar = Array(m)
      return Une( ar,RAS(s,f,m,n) )
    }
    return vacio
  }//Llave de la función recursiva

  /*Función que concatena dos arreglos y marca los elementos repetidos*/
  def Une(A: Array[Int], B: Array[Int]):Array[Int] = 
  {
    var z=0
    var C = concat(A, B)	//Concatena los dos arreglos
    var n = C.length
    for(i <-0 to n-2)		//Busca repetidos
      for(j <- i+1 to n-1)
	if( C(i) == C(j) )
	  C(j) = -9999		//Marca los elementos
    return C
  }//Llave de la función Une

}//Llave del object
