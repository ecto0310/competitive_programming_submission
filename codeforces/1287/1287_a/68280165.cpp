// Date: Sun, 05 Jan 2020 17:02:18 +0000
// Language: GNU C++17
#include <bits/stdc++.h>
using namespace std;
using i64 = long long;

int main()
{
  i64 t;
  cin >> t;
  for (i64 _ = 0; _ < t; _++)
  {
    i64 k;
    string s;
    cin >> k >> s;
    i64 ans = 0, cnt = 0;
    for (i64 i = k - 1; 0 <= i; i--)
      if (s[i] == 'P')
        cnt++;
      else
      {
        ans = max(ans, cnt);
        cnt = 0;
      }
    cout << ans << "\n";
  }
  return 0;
}
