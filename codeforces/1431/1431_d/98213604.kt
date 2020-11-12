// Date: Thu, 12 Nov 2020 15:24:55 +0000
// Language: Kotlin 1.4
fun main() {
  val t = readLine()!!.toInt()
  for (t_ in 0..t - 1) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var use = Array<Boolean>(n) { false }
    var cnt = 0
    for (i in 0..n - 1) {
      var miind = 0
      var mi = 1000
      var maind = 0
      var ma = -1
      for (j in 0..n - 1)
        if (!use[j]) {
          if (a[j] <mi) {
            mi = a[j]
            miind = j
          }
          if (ma <a[j]) {
            ma = a[j]
            maind = j
          }
        }
      if (mi <= cnt) {
        print(miind + 1)
        print(" ")
        use[miind] = true
        cnt = 0
      } else {
        print(maind + 1)
        print(" ")
        use[maind] = true
      }
      cnt++
    }
    print("\n")
  }
}
