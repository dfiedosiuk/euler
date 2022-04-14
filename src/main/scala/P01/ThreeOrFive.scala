package P01

object ThreeOrFive extends App {
  val upTo1000Sum = (1 until 1000).filter(n => n % 3 == 0 || n % 5 == 0).sum
  println(upTo1000Sum)
}
