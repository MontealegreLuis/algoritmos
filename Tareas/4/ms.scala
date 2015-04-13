//Tarea 4
//Por:Rayen Ari Ramos Rocha
//    201126031




//Ordena la lista de menor a mayor con el algoritmo MERGESORT recursivo.


import scala.annotation.tailrec
import scala.util.Random

object ms{

  def msort[T <% Ordered[T]](xs: List[T]): List[T] = {

    @tailrec
    def merge(res: List[T], xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (_, Nil) => res.reverse ::: xs
      case (Nil, _) => res.reverse ::: ys
      case (x :: xs1, y :: ys1) =>
        if (x < y) merge(x :: res, xs1, ys)
        else merge(y :: res, xs, ys1)
    }

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(Nil, msort(ys), msort(zs))
    }
  }

  def main(args: Array[String]) {
    val num = Seq.fill(100)(Random.nextInt(200)).toList //lista 1 al 200 aleatoria
    println("La lista ordenada es:")
    println(msort(num))
  }
}