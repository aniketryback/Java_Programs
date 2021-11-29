package com.ratul.backtracking;

public class NQueens {
    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));


    }

    public static int queens(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for(int col = 0; col < board.length; col++)
        {
            if(isSafe(board, row, col )) {
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;

    }

    public static boolean isSafe(boolean[][] board, int row, int col)
    {
        // checking vertical
        for(int i = 0; i < row; i++)
        {
            if(board[i][col])
                return false;
        }

        //checking left diagonal
        int maxLeft = Math.min(row, col);
        for(int dl = 1; dl <= maxLeft; dl++)
            if(board[row - dl][col - dl])
                return false;

        // checking right diagonal

        int maxRight = Math.min(row, board.length - 1 - col);
        for(int dr = 1; dr <= maxRight; dr++)
            if(board[row - dr][col + dr])
                return false;

        return true;


    }


    public static void display(boolean[][] board)
    {
        for(boolean[] row : board)
        {
            for(boolean element : row)
            {
                if(element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println() ;
        }

    }

}
