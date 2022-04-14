package P02

object Fibonacci extends App {

  val firstFibonacci = List(1, 2)

  def evenFibonacciSum(ns: List[Int], upTo: Int): List[Int] = {
    val lastTwo = ns.takeRight(2)
    if (lastTwo.sum < upTo) {
      evenFibonacciSum(ns :+ lastTwo.sum, upTo)
    }else{
      ns.filter(n => n%2 == 0)
    }
  }

  val upTo4MilSum = evenFibonacciSum(firstFibonacci, 4000000).sum
  println(upTo4MilSum)

}
