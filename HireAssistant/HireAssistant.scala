import scala.util.Random

object HireAssistant
{
	def main(args: Array[String]) 
	{
		var A = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

		println("Secuencia original: ")
		for(i <- 0 to A.length - 1)
		{
			println("NumO: " + A(i))
		}

		println("Nueva secuencia: ")
		if (args(0) == "1")
			Permute(A)
		else
			Permute2(A)
		for(i <- 0 to A.length - 1)
		{
			println("Num: " + A(i))
		}

		HireAssistant(A)
	}

	def HireAssistant(A:Array[Int])
	{
		var best = 0
		var candidate = -1
		for (i <- 0 to A.length - 1)
		{
			if(A(i) > best)
			{
				println("Asistente: " + i + " es mejor que el " + candidate + ", asistnte " + i + " contrtado")
				candidate = i
				best = A(i)
			}
			else
			{
				println("Asistente: " + i + " no es mejor que el asistente " + i)
			}
		}

	}

	def Permute(A:Array[Int])
	{
		var Aux = new Array[DoubleInt](A.length)
		var rndInt = new Random
		var pa = (Math.pow(A.length, 3)).floor.toInt

		for(i <- 0 to A.length - 1)
		{
			var di = new DoubleInt
			di.a = A(i)
			di.b = rndInt.nextInt(pa)
			Aux(i) = di
		}

		var tem = 0
		var tem2 = 0
		for(i <- 0 to Aux.length - 1)
		{
			tem = i
			for(j <- (i+1) to Aux.length - 1)
			{
				if(Aux(j).b < Aux(tem).b)
				{
					tem = j
				}
			}
			tem2 = Aux(i).a
			A(i) = Aux(tem).a
			A(tem) = tem2

			var temDi = Aux(i)
			Aux(i) = Aux(tem)
			Aux(tem) = temDi
		}
	}

	def Permute2(A:Array[Int])
	{
		var rndInt = new Random

		for(i <- 0 to A.length - 1)
		{
			var na = rndInt.nextInt((A.length - 1))
			var np = 0
			if ((i + na) < A.length - 1) np = (i + na)
			else np = na
			var aux = A(i)
			A(i) = A(np)
			A(np) = aux
		}
	}
}

class DoubleInt
{
	var a = 0
	var b = 0
}