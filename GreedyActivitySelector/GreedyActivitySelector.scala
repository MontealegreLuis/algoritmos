import scala.Array
import scala.collection.TraversableOnce
import scala.collection.mutable.ArrayBuffer

object GreedyActivitySelector
{
	var a = ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
	var s = ArrayBuffer(0, 1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12)
	var f = ArrayBuffer(0, 4, 5, 6, 7, 9, 9, 10, 11, 12, 14, 16)

	def main(args: Array[String]) 
	{
		var res = GreedySctivitySelector_()

		for(i <- 0 to res.length - 1)
			println("" + res(i))
	}

	def GreedySctivitySelector_(): ArrayBuffer[Int] =
	{
		var A = ArrayBuffer[Int]();
		A :+ a(0)
		var n = a.length - 1
		var k = 0
		for(m <- 1 to n)
		{
			if(s(m) >= f(k))
			{
				A = (A :+ a(m))
				k = m
			}
		}
		return A
	}
}