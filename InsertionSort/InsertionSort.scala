object InsertionSort
{
  def main(args: Array[String]) 
  {
      var arreglo  = Array(3, 5, 13, 7, 11, 19, 23, 17, 51, 31)
	  var key = 0
	  var i = 0
	  
	  for (j <- 1 to arreglo.length - 1)
	  {
          key = arreglo(j)
          i = j - 1
		  while (i >= 0 && arreglo(i) > key) 
		  {
			  arreglo(i + 1) = arreglo(i)
			  i = i - 1
		  }
          arreglo(i + 1) = key
      }
	  for(j <- arreglo)
	  {
	      println(j)
	  }
    }
  }