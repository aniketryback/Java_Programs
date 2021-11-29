package com.ratul.backtracking;

import java.util.Arrays;

public class MazeAllPathsPrint {

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = new int[board.length][board[0].length];

        mazeAllPathsPrint("",board, 0, 0, path, 1);
    }

    public static void mazeAllPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int steps)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            for(int[] arr : path)
                System.out.println(Arrays.toString(arr));
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;
        if(r < maze.length - 1)
            mazeAllPathsPrint(p + 'D',maze, r + 1, c, path, steps + 1);
        if(c < maze[0].length - 1)
            mazeAllPathsPrint(p + 'R',maze,  r, c + 1, path, steps + 1);
        if(r > 0)
            mazeAllPathsPrint(p+'U', maze, r - 1, c, path, steps + 1);
        if(c > 0)
            mazeAllPathsPrint(p+'L', maze, r , c - 1, path, steps + 1);

        maze[r][c] = true;
        path[r][c] = 0;

    }


}
