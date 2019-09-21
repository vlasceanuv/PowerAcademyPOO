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

Answers:
1. 
public int max(int[] vec) {
  int maxNum = vec[0];
  
  //This for-each loop is used to verify all the items from the array. The array has an unknown size
  for(int item : vec) {
    if (item > maxNum) {
      maxNum = item;
    }
  }
  return maxNum;
}

2.
public int[] merge(int[] v1, int[] v2) {  
  //int vLength = (v1.length > v2.length)?v1.length:v2.length;
  int[] v =  new int(v1.length + v2.length);
  
  int pos = 0;
  
  for(int i=0; i<v1.length; i++) {
    pos = posBigger(v1[i], v2);
    for(int j=0; j<pos; j++) {
         v[v.length+j] = v1[i+j];
    }
  }
}

public int posBigger(int elem, int[] v) {
  int maxPos = 0; 
   
  for(int item : v) {
    if (item > maxPos) {
          maxPos = index;  
    }
  }
  return maxPos;
}

3.
public boolean duplicates(int[] v1) {
 
  for(int i=0; i<v1.length; i++) {
    for(int j=i+1; j<v1.lenthth; j++) {
      if (v1[i] == v[j]) {
        return true;
      }
    }
  }
  
  return false;
}
