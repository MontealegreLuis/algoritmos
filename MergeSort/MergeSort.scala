object MergeSort
{
    def main(args: Array[String]) 
	{
	    var i = 0
	    var A = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
		
	    Divide(A, 0, A.length - 1)
		
		for(i <- 0 to A.length - 1)
		{
		    println(i + ": "  + A(i))
		}
	}
	
	def Divide(A: Array[Int], p: Int, r: Int) 
	{
	    if( p < r )
		{
		    var q = (p+r)/2
            Divide(A, p, q)
            Divide(A, q+1, r)
            Merge(A, p, q, r)
		}
	}
	
	def Merge(A: Array[Int], p: Int, q: Int, r: Int) 
	{
	    var i = 0
		var j = 0
		var k = 0
		var n1 = q-p+1
		var n2 = r-q
		var L = new Array[Int](n1 + 1)
		var R = new Array[Int](n2 + 1)
		
		for( i <- 0 to n1-1)
		{
		    L(i) = A(p+i)
		}
		
		for( j <- 0 to n2-1)
		{
		    R(j) = A(q+j+1)
		}
		
		L(n1) = 1000000
		R(n2) = 1000000
		i = 0
		j = 0
		
		for( k <- p to r)
		{
		    if(L (i) <= R(j))
			{
			    A(k)= L(i)
				i = i + 1
			}
			else
			{
			    A(k) = R(j)
				j = j + 1
			}
		}
	}
}