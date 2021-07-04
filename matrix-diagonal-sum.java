class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0,j=n-1;
        for(int i=0;i<n;i++)
        {
            sum = sum + mat[i][i] + mat[i][j]; 
            j--;
        }
        if(n%2!=0)
        {
            n++;
            int index = (n/2)-1;
            sum = sum - mat[index][index];
        }
        return sum;
    }
}
