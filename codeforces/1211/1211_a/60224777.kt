// Date: Sat, 07 Sep 2019 14:51:45 +0000
// Language: Kotlin 1.4
fun main(args: Array<String>)
{
  val n = readLine()!!.toInt()
  val r = readLine()!!.split(" ").map(String::toInt)
  val b = r.distinct().sorted()
  if(3<=b.size)
  {
    for(i in 0..n-1)
      if(b[0]==r[i])
      {
        print(i+1)
        break
      }
    print(" ")
    for(i in 0..n-1)
      if(b[1]==r[i])
      {
        print(i+1)
        break
      }
    print(" ")
    for(i in 0..n-1)
      if(b[2]==r[i])
      {
        print(i+1)
        break
      }
    print("\n")
  }
  else
  {
    println("-1 -1 -1")
  }
}
