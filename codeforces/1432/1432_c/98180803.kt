// Date: Thu, 12 Nov 2020 08:07:33 +0000
// Language: Kotlin 1.4
fun main() {
  val t = readLine()!!.toInt()
  for (_t in 0..t - 1) {
  val q = readLine()!!.toInt()
  val a = readLine()!!.split(" ").map(String::toInt)
  var sum = 0
  for (i in 0..q - 1) {
    sum += a[i]
  }
  println((sum + q - 1) / q)
}
}
