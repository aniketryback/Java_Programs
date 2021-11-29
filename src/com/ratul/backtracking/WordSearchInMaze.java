package com.ratul.backtracking;

public class WordSearchInMaze {

    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E',}
        };
        String word = "ABFDEE";

        System.out.println(exists(board,word));
    }
    public static boolean exists(char[][] board, String word)
    {
        char first = word.charAt(0);
        for(int i = 0;i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
              if (board[i][j] == first)
              {
                  if(doesexists(i , j , 0, board, word, new int[board.length][board[0].length]))
                      return true;
              }
            }
        }
        return false;
    }
    public static boolean doesexists(int r, int c,int index, char[][] board, String word, int[][] visited) {

        if(visited[r][c] == 1)
            return false;

    if(board[r][c] == word.charAt(index))
    {
        visited[r][c] = 1;
        if(index == word.length() - 1)
            return true;
        int up = r - 1 < 0 ? 0 : r - 1;
        int down = r + 1 >= board.length ? board.length - 1 : r + 1;
        int left = c - 1 < 0 ? 0 : c - 1;
        int right = c + 1 >= board[0].length ? board.length - 1 : c + 1;

        if (doesexists(up, c, index + 1, board, word, visited)
                || doesexists(down, c, index + 1, board, word, visited)
                || doesexists(r, left, index + 1, board, word, visited)
                || doesexists(r, right, index + 1, board, word, visited))
            return true;
    }
        visited[r][c] =0;
        return false;
    }

}
