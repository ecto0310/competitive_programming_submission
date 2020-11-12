// Date: Thu, 12 Nov 2020 07:58:09 +0000
// Language: Kotlin 1.4
fun main() {
  val n = readLine()!!.toInt()
  for (i in 0..n - 1) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println(a + b)
  }
}
