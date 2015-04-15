object CutRod
{
	def main(args: Array[String]) 
	{
		var A = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

		println("Maxima ganancia: " + CutRod_(A, (args(0).toInt)))
	}

	def CutRod_(p:Array[Int], n:Int) : Int =
	{
		if(n == 0)
			return 0
		var q = -1000
		for(i <- 0 to n - 1)
			q = Max(q, p(i) + CutRod_(p, n - i - 1))
		return q
	}

	def Max(a:Int, b:Int) : Int =
	{
		if (a > b)
			return a
		else
			return b
	}
}