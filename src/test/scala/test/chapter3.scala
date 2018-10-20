package test

import scala.collection.mutable.ArrayBuffer

object chapter3 {
  def main(args: Array[String]): Unit = {
    /*var a = new ArrayBuffer[Int]()
    var low = scala.io.StdIn.readInt()
    var high = scala.io.StdIn.readInt()
    fill(low,high)
    def fill(m: Int, n: Int) {
      for (i <- m to n) {
        a +=i
        println(i)
        println(a(i))
      }
    }*/
    var a = Array(1, 2, 3, 4, 5)
    /*for (i <- 0 until a.length) {
      var t = a(i)
      a(a.length-i-1) = t
      a(i) = a(a.length-i-1)
      println(a(i))
    }*/
    var result = for (i <- a yield
  }
}
