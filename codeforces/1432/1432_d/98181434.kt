// Date: Thu, 12 Nov 2020 08:16:55 +0000
// Language: Kotlin 1.4
fun main() {
  val t = readLine()!!.toInt()
  for (_t in 0..t - 1) {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0..n - 1) {
      print("abcdefghijklmnopqrstuvwxyz"[i % b])
    }
    print("\n")
  }
}
