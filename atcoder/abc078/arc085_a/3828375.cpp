// Date: Thu, 20 Dec 2018 12:27:49 +0000
// Language: C++14 (GCC 5.4.1)
#include <bits/stdc++.h>
#include <assert.h>

using namespace std;

int main()
{
  int n, m;
  cin >> n >> m;
  cout << (1800 * m + 100 * n) * pow(2, m) << endl;

  return 0;
}
