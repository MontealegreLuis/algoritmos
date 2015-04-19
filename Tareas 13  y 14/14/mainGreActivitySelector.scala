//Tarea 14
//Rayen Ari Ramos Rocha 

class GreddyactivitySelector{
	def GreAcSelec(S: Array[Int],F: Array[Int]):Set[String] = {
		var n = S.length;
		var A = Set("A1")
		var k = 1

		for( m <- 2 to n-1) {
			if(S(m)>=F(k)){
				A += ("A" + m)
				k = m
			}
			
		}
		return A
	}
}

object mainGreActivitySelector{
	def main(args: Array[String]): Unit = {
		val S = Array(1,3,0,5,3,5,6,8,8,2,12)
		val F = Array(4,5,6,7,9,9,10,11,12,14,16) 

		var G = new GreddyactivitySelector();

		println("Actividades compatibles: \n\n")
		println(G.GreAcSelec(S,F));
	}
}