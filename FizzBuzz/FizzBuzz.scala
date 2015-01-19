object FizzBuzz
{
	def main(args: Array[String])
	{
		var i = 0
		for( i <- 0 to 100)
		{
			if( (i % 15) == 0 )
			{
				println( "FizzBuzz" )
			}
			else if( (i % 5) == 0 )
			{
				println( "Buzz" )
			}
			else if( (i % 3) == 0 )
			{
				println( "Fizz" )
			}
			else
			{
				println(i)
			}
		}
	}
}