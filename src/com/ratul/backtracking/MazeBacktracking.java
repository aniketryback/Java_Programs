package com.ratul.backtracking;

public class MazeBacktracking {

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        mazeAllPaths("",board, 0, 0);
    }

    public static void mazeAllPaths(String p, boolean[][] maze, int r, int c)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1)
            mazeAllPaths(p + 'D',maze, r + 1, c);
        if(c < maze[0].length - 1)
            mazeAllPaths(p + 'R',maze,  r, c + 1);
        if(r > 0)
            mazeAllPaths(p+'U', maze, r - 1, c);
        if(c > 0)
            mazeAllPaths(p+'U', maze, r , c - 1);

        maze[r][c] = true;

    }


}
