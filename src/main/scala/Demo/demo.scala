package Demo
import scala.collection.immutable.StringOps
object demo {
  def main(args: Array[String]): Unit = {
    /* def singum (x: Int): Unit ={
       println(if (x>0) 1 else if (x==0) 0 else -1)
     }
     singum(-10)
     */
    /* var y: Int = 0;
    var  x: Unit = {};
    x = y = 12
    println(x)
    print(y)
    */
    /* var i: Int = 10
    while (i>=0) {
      println(i)
      i -= 1
    }*/
    /*var num = 10
    def countdown( n: Int) {
      var n1 =n
      while (n1 >= 0) {
      println (n1)
      n1 -= 1
      }
    }
    countdown(num)*/
   /* val str = "Hello"
    var mult: Long = 1
    for (i <- 0 until str.length) {
      println(str(i))
      mult *= str(i)
    }
    print(mult)*/
   /* val str = "Hello"
    var mult: Long = 1
    mult = str.map(_.toLong).product
    print(mult)*/
    val xy: Int = 10
    val ny: Int = 2
    println(power(xy,ny))
    def power(x: Int, n: Int): Long = {
      if (n == 1) x else if (n % 2 == 0) {
        power(x, n/2) * power(x, n/2)
      }
      else 0
    }
  }
}
