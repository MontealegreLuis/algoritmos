object BottomUpCutRod
{
	def main(args: Array[String]) 
	{
		var A = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)

		println("Maxima ganancia: " + BottomUpCutRod_(A, (args(0).toInt)))
	}

	def BottomUpCutRod_(p:Array[Int], n:Int) : Int = 
	{
		var r = new Array[Int](n+1)
		r(0) = 0
		for(j<-1 to n)
		{
			var q = -1000
			for(i<- 0 to j - 1)
				q = Max(q, p(i) + r(j - i - 1))
			r(j) = q
		}
		return r(n)
	}

	def Max(a:Int, b:Int) : Int =
	{
		if (a > b)
			return a
		else
			return b
	}
}