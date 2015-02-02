package tarea2

/**
 * Created by JordyCuan on 26/ene/15.
 */
object MergeSort {


	def main(args: Array[String]) {
		var A = Array(120, 13, 4, 99, 18, 6, 4, 300, 2)

		this.sort(A, 0, A.length - 1)
		for (i <- 0 to A.length - 1) {
			println(A(i))
		}
	}


	def sort(A: Array[Int], p: Int, r: Int): Unit = {
		if (p < r) {
			val q = (p + r) / 2
			sort(A, p, q)
			sort(A, q + 1, r)
			merge(A, p, q, r)
		}
	}


	def merge(A: Array[Int], p: Int, q: Int, r: Int) = {
		val n1 = q - p + 1
		val n2 = r - q
		val L = new Array[Int](n1 + 1)
		val R = new Array[Int](n2 + 1)

		for (i <- 0 to n1 - 1) { // es (-1) o (-2) ???
			L(i) = A(p + i)
		}
		L(L.length - 1) = 999999
		for (i <- 0 to n2 - 1) { // es (-1) o (-2) ???
			// R(i) = A(r - q + i)
			R(i) = A(q + i + 1)
		}
		R(R.length - 1) = 999999

		var i = 0
		var j = 0

		for (k <- p to r) {
			if (L(i) < R(j)) {
				A(k) = L(i)
				i = i + 1
			}
			else {
				A(k) = R(j)
				j = j + 1
			}
		}
	}
}
