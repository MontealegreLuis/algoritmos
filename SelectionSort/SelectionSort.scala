object SelectionSort
{
     def main(args: Array[String]) 
     {
      var arr = Array(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
	  var aux = 0
	  var pos = 0
	  
	  for(i <- 0 to arr.length - 1)
	  {
		  pos = i
	      for(j <- i + 1 to arr.length - 1)
		  {
		      if(arr(j) < arr(pos))
			  {
				  pos = j
			  }
		  }
		  aux = arr(i)
		  arr(i) = arr(pos)
		  arr(pos) = aux
	  }
	  
	  for(i <- 0 to arr.length - 1)
	  {
	      println(i + ": " + arr(i))
	  }
     }
 }