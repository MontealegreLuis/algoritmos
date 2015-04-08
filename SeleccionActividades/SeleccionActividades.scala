import scala.Array
import scala.collection.TraversableOnce
import scala.collection.mutable.ArrayBuffer

object SeleccionActividades
{
	var a = ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
	var s = ArrayBuffer(0, 1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12)
	var f = ArrayBuffer(0, 4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16)

	def main(args: Array[String]) 
	{
		var k = (args(0).toInt)

		var result = RAS(k, a.length - 1)

		for(i <- 0 to result.length - 1)
			println("" + result(i))
	}

	def RAS(k:Int, n:Int): ArrayBuffer[Int] =
	{
		var m = k + 1;

		while( m <= n && s(m) < f(k) )
			m = m + 1
		if( m <= n)
			return RAS(m, n) :+ a(m)
		else
			return ArrayBuffer()
	}
}