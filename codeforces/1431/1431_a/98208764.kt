// Date: Thu, 12 Nov 2020 14:39:13 +0000
// Language: Kotlin 1.4
fun main() {
  val t = readLine()!!.toInt()
  for (t_ in 0..t - 1) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    var ans = 0L
    for (i in a) {
      var cnt = 0
      for (j in a)
        if (i <= j)
          cnt++
      ans = Math.max(ans, i*cnt)
    }
    println(ans)
}
}
