public class ValidSoduku {


    public static void main(String[] args) {

        System.out.println(isValidSudoku(new char[][]{
                {'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','.','.','.','.','.','6','.'}
                ,{'.','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','.','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        } ));
    }

    public static boolean isValidSudoku(char[][] board) {
        return areSubBoxesValid(board) && areRowsValid(board) && areColumnsValid(board);
    }

    public static boolean areSubBoxesValid(char[][] board){
       for(int ki = 0 ; ki < 9 ; ki += 3)
       {
           for(int kj = 0; kj < 9 ; kj += 3)
           {
               int[] freqOfSubBoxElements = new int[10];
//               System.out.println(ki +"  " + kj);
               for(int i = ki; i<ki+3; i ++)
               {
//                   System.out.println(" i " + i);


                   for(int j = kj; j < kj+3; ++j){
                       System.out.println(" j " + j);
                       char c = board[i][j];
                       if(isValidDigit(c)){
                           int theDigit = charToInt(c);
                           if(freqOfSubBoxElements[theDigit] != 0) {
                               return false;
                           }else {
                               freqOfSubBoxElements[theDigit]++;
                           }
                       }
                   }
               }
           }
       }
        return true;
    }
    public static boolean areColumnsValid(char[][] board){
        for(int j = 0; j<9; ++j)
        {
            int[] freqOfColumnElements = new int[10];

            for(int i = 0; i < 9; ++i){
                char c = board[i][j];
                if(isValidDigit(c)){
                    int theDigit = charToInt(c);
                    if(freqOfColumnElements[theDigit] != 0) {
                        return false;
                    }else {
                        freqOfColumnElements[theDigit]++;
                    }
                }
            }
        }
        return true;
    }
    public static boolean areRowsValid(char[][] board){
        for(int i = 0; i<9; ++i)
        {
            int[] freqOfRowElements = new int[10];

            for(int j = 0; j < 9; ++j){
                char c = board[i][j];
                if(isValidDigit(c)){
                    int theDigit = charToInt(c);
                    if(freqOfRowElements[theDigit] != 0) {
                        return false;
                    }else {
                        freqOfRowElements[theDigit]++;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidDigit(char c){
        return c >= '0' && c <= '9';
    }
    public static int charToInt(char c){
        return c - '0';
    }
}
