class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {return s;}
        int index = 0;
        int numCols = s.length();
        char[][] mat = new char[numRows][numCols];

        int currentRow = 0;
        int currentCol = 0;
        while (index < s.length()) {
            if (currentRow == numRows) {
                currentRow -= 2;
                currentCol++;
                while((index < s.length()) && currentRow > 0) {
                    mat[currentRow][currentCol] = s.charAt(index);
                    currentCol++;
                    currentRow--;
                    index++;
                }
            } else {
                mat[currentRow][currentCol] = s.charAt(index);
                index++;
                currentRow++;
            }

        }
        StringBuilder ret = new StringBuilder();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[0].length; j++) {
                char curr = mat[i][j];
                if (curr != Character.UNASSIGNED) {
                    ret.append(curr);
                }
            }
        }

        return ret.toString();
    }
}