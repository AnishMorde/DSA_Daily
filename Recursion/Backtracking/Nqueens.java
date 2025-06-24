package Recursion.Backtracking;



public class Nqueens {
    public static void main(String[] args) {
        int n =4;
        boolean board [][] = new boolean[n][n];
        System.out.println( queens( board , 0));

    }

    public static int queens(boolean board[][] , int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count =0;

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board , row , col)){
                board[row][col] = true;
                count+=queens(board , row+1);
                board[row][col] = false;
            }

        }

        return count;

    }

    // Rename dislpay() to display()
     static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] ? "Q " : "X ");
            }
            System.out.println();
        }
    }


    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
             if(board[i][col]){
                 return false;
             }
        }

        int left = Math.min(row , col);

        for(int i=1;i<=left;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }


        int right = Math.min(row , board.length-col-1);

        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;


    }
}
