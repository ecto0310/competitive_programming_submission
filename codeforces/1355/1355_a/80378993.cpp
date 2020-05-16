// Date: Sat, 16 May 2020 14:40:07 +0000
// Language: GNU C++17
#include <bits/stdc++.h>
using namespace std;
using i64 = long long;
#define endl "\n"

int main()
{
  i64 t;
  cin >> t;
  for (i64 _ = 0; _ < t; _++)
  {
    i64 a, K;
    cin >> a >> K;
    i64 now = a, bef = -1;
    for (i64 i = 1; i < K && bef != now; i++)
    {
      i64 mi = 9, ma = 0, t = now;
      while (t)
      {
        mi = min(mi, t % 10);
        ma = max(ma, t % 10);
        t /= 10;
      }
      bef = now;
      now = now + mi * ma;
    }
    cout << now << endl;
  }
  return 0;
}
