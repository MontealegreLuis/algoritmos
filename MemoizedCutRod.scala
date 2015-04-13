object MemoizedCutRod
{
	def main(args: Array[String]) 
	{
		var A = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

		println("Maxima ganancia: " + MemoizedCutRod_(A, (args(0).toInt)))
	}

	def MemoizedCutRod_(p:Array[Int], n:Int) : Int = 
	{
		var r = new Array[Int](n+1)
		for(i <- 1 to r.length - 1)
			r(i) = -1000
		return  MemoizedCutRodAux(p, n, r)
	}

	def MemoizedCutRodAux(p:Array[Int], n:Int, r:Array[Int]) : Int =
	{
		var q = 0

		if(r(n) >= 0)
			return r(n)
		if (n == 0)
		{
			q = 0
		}
		else
		{
			q = -1000
			for(i <- 0 to n - 1)
				q = Max(q, p(i)  + MemoizedCutRodAux(p, n - i - 1, r))
		}
		r(n) = q
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