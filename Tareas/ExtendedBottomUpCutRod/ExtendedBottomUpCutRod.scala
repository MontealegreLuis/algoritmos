object ExtendedBottomUpCutRod
{
	var r = Array[Int](0);
	var s = Array [Int](0)

	def main(args: Array[String]) 
	{
		var n = args(0).toInt
		var p = Array(1, 5, 8, 9, 10, 17, 17, 20, 24, 30)
		PrintCutRodSolution(p, n)
	}

	def ExtndedBottomUpCutRod_(p:Array[Int], n:Int)
	{
		var q = 0
		r = new Array[Int](n + 1)
		s = new Array[Int](n)
		r(0) = 0
		for(j<-1 to n)
		{
			q = -1000
			for(i<-0 to j - 1)
			{
				if (q < p(i) + r(j - i - 1))
				{
					q = p(i) + r(j - i - 1)
					s(j - 1) = i + 1
				}
			}
			r(j) = q
		}
		println("Maxima ganancia: " + r(n))
	}

	def PrintCutRodSolution(p:Array[Int], n:Int)
	{
		var n_ = n
		ExtndedBottomUpCutRod_(p, n)
		n_ = n_ - 1
		while(n_ > 0)
		{
			println("Pulgadas: " + s(n_))
			n_ = n_ - s(n_)
		}
	}
}