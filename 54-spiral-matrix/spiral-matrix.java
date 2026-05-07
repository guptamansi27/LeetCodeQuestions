class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        List<Integer> l= new ArrayList<>();

        while(startRow<=endRow && startCol<=endCol){
            //top boundary
            for(int j=startCol;j<=endCol;j++){
                l.add(matrix[startRow][j]);
            }
            //right boundary
            for(int i=startRow+1;i<=endRow;i++){
                l.add(matrix[i][endCol]);
            }
            //bottom boundary
            for(int j=endCol-1;j>=startCol;j--){
                 if(startRow==endRow) continue;
                l.add(matrix[endRow][j]);
            }
            //left boundary
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol) continue;
                l.add(matrix[i][startCol]);
            }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
        }
        return l;
    }
}