class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        if(rows==0)
            return ;
        int cols=matrix[0].length;
        int rowFlags[]=new int[rows];
        int colFlags[]=new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0){
                    rowFlags[i]=Integer.MIN_VALUE;
                    colFlags[j]=Integer.MIN_VALUE;
                }   
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                if(rowFlags[i]==Integer.MIN_VALUE || colFlags[j]==Integer.MIN_VALUE){
                    matrix[i][j]=0;
                }   
            }
        }
    }
}