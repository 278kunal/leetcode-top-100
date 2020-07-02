class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        if(rows==0)
            return ;
        int cols=matrix[0].length;
        //transpose
        for(int i=0;i<rows;i++)
            for(int j=i+1;j<cols;j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        
    //reverse columns
    int low=0,high=cols-1;
    while(low<high){
    for(int i=0;i<rows;i++){
        int temp=matrix[i][low];
        matrix[i][low]=matrix[i][high];
        matrix[i][high]=temp;
        }
        low++;
        high--;
        }
    }
}