/****

Given two positive integers N and M. The task is to check whether N is a Special-M-visor or not.
Special-M-visor: A number is called Special-m-visor if it has exactly M even divisors for a given N.
Input
User Task:
Since this is a functional problem, you don’t have to worry about the input, you just have to complete the function checkSpecial_M_Visor(). Where you will get N and M as a parameter.

Constraints:
1 <= N <= 10^6
0 <= M <= 10^6
Output
Return "Yes" without quotes if the number N is a Special- M- visor else return "No"


****/

const char* checkSpecial_M_Visor(int N,int M){
    int count = 0;
    while (N  % 2 == 0){
        N /= 2;
        count++;
    }
    if (count % 2 == 0 && count == M) return "Yes";
    else return "No";
}