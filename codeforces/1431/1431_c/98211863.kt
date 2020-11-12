// Date: Thu, 12 Nov 2020 15:07:08 +0000
// Language: Kotlin 1.4
fun main() {
  val t = readLine()!!.toInt()
  for (t_ in 0..t - 1) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val p = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    for (i in n - 1 downTo 0) {
      var sum = 0
      for (j in i..Math.min(n - 1, i + (n - i) / k - 1))
        sum += p[j]
      ans = Math.max(ans, sum)
    }
    println(ans)
  }
}
