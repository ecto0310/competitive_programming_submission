// Date: Sun, 08 May 2022 12:06:36 +0000
// Language: C++ (GCC 9.2.1)
#include <bits/stdc++.h>

using namespace std;
using i64 = long long;
#define endl '\n'

int main()
{
    i64 N, A, B;
    cin >> N >> A >> B;
    for (int i = 0; i < A * N; i++)
    {
        for (int j = 0; j < B * N; j++)
        {
            if (i / A % 2 == j / B % 2)
            {
                cout << ".";
            }
            else
            {
                cout << "#";
            }
        }
        cout << endl;
    }
    return 0;
}
