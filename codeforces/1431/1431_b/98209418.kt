// Date: Thu, 12 Nov 2020 14:44:17 +0000
// Language: Kotlin 1.4
fun main() {
  val t = readLine()!!.toInt()
  for (t_ in 0..t - 1) {
    val s = readLine()!!
    var ans = 0
    var cnt = 0
    for (i in s) {
      if (i == 'w') {
        ans++
        ans += Math.max(0, cnt / 2)
        cnt = 0
      } else {
        cnt++
      }
    }
    ans += Math.max(0, cnt / 2)
    println(ans)
  }
}
