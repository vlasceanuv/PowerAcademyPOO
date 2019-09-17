# PowerAcademyPOO
PowerAcademyPOO

1.Write a function : ```public int max(int[] vec)```  . It receives a vector of numbers and returs the highest number.
#include <iostream>
#include<vector>

using namespace std;

public int max(int[] vec){
    int max=vec[0];
    for(int i=0;i<vec.size;i++)
    {
        if(v[i]>max)
        {
            max = v[i];
        }
    }
    return max;
}
2.Write a function : ```public int[] merge(int[] v1, int[] v2)``` . It received 2 vectors of numbers sorted in acsending order and should return a vector with all numbers from v1 and v2 sorted in ascending order
#include <iostream>
#include<vector>
#include<algorithm>
  
  using namespace std;

public  int[] merge(int[] v1,int[] v2)
{
    vector<int>vec;
    int k=0;
    for(int i=0;i<v1.size()+v2.size();i++){
        if(i<v1.size()){
            vec[i]=v1[i];
        }
        else
            vec[i]=v2[k];
        k++;
    sort(vec.begin(),vec.end());

    return vec;
}
3.Write a function : ```public boolean duplicates(int[]v1)``` . It receives a vector of numbers and returns true if there are duplicates in the vector( at least 2 numbers with the same vale) or false if the list does not contains duplicates.
#include <iostream>
#include<vector>
#include<set>
using namespace std;

public boolean duplicates(int[] v1);
{
set<int> s;
for(int i = 0;i<v1.size();i++)
{
s.insert(v1[i]);
}
if(v1.size()==s.size()){
return false;
}
else return true;
}
