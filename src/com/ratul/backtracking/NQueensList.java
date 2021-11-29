package com.ratul.backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueensList {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list = solveNQueens(4);
        System.out.println(list);
    }


        public static List<List<String>> solveNQueens(int n) {

            boolean[][] board = new boolean[n][n];
            List<List<String>> res = new ArrayList<>();
            queens(board, 0, res);
            return res;

        }

        public static void queens(boolean[][] board, int row, List<List<String>> res)
        {

            if(row == board.length) {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++)
                        System.out.print((board[i][j]+" "));
                    System.out.println();
                }
                System.out.println();

                populate(board,res);
                return;

            }

            for(int col = 0; col < board.length; col++)
            {
                if(isSafe(board,row,col)){
                    board[row][col] = true;
                     queens(board, row + 1, res);
                    board[row][col] = false;
                }

            }

        }


        public static  boolean isSafe(boolean[][] board, int row, int col)
        {
            for(int i = 0; i < row; i++)
            {
                if(board[i][col])
                    return false;
            }

            int maxLeft = Math.min(row,col);
            for(int dl = 1;dl <= maxLeft; dl++)
            {
                if(board[row - dl][col - dl])
                    return false;
            }

            int maxRight = Math.min(row,board.length - 1 - col);
            for(int dr = 1;dr <= maxRight; dr++)
            {
                if(board[row - dr][col + dr])
                    return false;
            }

            return true;


        }


        public static void populate(boolean[][] board, List<List<String>> list)
        {

            List<String> temp = new ArrayList<>() ;
            for(boolean[] row : board)
            {
                StringBuilder sb = new StringBuilder();
                for(boolean element : row)
                {
                    if(element)
                        sb.append("Q");
                    else
                        sb.append(".");
                }
                temp.add(sb.toString());
            }
            list.add(temp);
        }


    }

