# PowerAcademyPOO
PowerAcademyPOO

1.Write a function : ```public int max(int[] vec)```  . It receives a vector of numbers and returs the highest number.

#include <iostream>
#include <vector>
using namespace std;


   int Max(int vec[], int n) 
{ 
    
    if (n == 1) 
        return vec[0]; 
    return max(vec[n-1], Max(vec, n-1)); 
    
} 
  

int main() 
{ 
    int vec[] = {1, 2, 3, 4, 5}; 
    int n = sizeof(vec)/sizeof(vec[0]); 
    cout <<  Max(vec, n); 
    return 0; 

} 

2.Write a function : ```public int[] merge(int[] v1, int[] v2)``` . It received 2 vectors of numbers sorted in acsending order and should return a vector with all numbers from v1 and v2 sorted in ascending order

3.Write a function : ```public boolean duplicates(int[]v1)``` . It receives a vector of numbers and returns true if there are duplicates in the vector( at least 2 numbers with the same vale) or false if the list does not contains duplicates.
