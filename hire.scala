class hire{
	def selinpl(A: Array[Int]) = {
		val B = new Randomize()
		B.Inp(A)
		var Best = 0
		for( i <- 0 to A.length-1) {
			println("Entrevistando candidato: " + i)
			if(A(i)>Best){
				Best = A(i)
				println("Candidato: " + i + " es mejor que el anterior, contratado!\n Ranking es: "+A(i))
			}
		}
	}

	def selPerm(A: Array[Int]) = {
		val B = new PermBS();
		B.Pbs(A);
		var Best = 0;
		for( i <- 0 to A.length-1) {
			println("Entrevistando candidato: " + i)
			if(A(i)>Best){
				Best = A(i)
				println("Candidato: " + i + " es mejor que el anterior, contratado!\n Ranking: "+A(i))
			}
		}
	}
}
