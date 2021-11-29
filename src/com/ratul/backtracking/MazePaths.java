package Backtracking;

import java.util.ArrayList;

public class MazePaths {
    public static void main(String[] args) {
      //System.out.println(mazepaths("",3,3));
        //System.out.println(mazepathsDiagonal("",3,3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazepathswithObstacles("",board, 0, 0);
    }
    public static ArrayList<String> mazepaths(String p, int r, int c)
    {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1)
            ans.addAll(mazepaths(p + 'D',r - 1, c));
        if(c > 1)
            ans.addAll(mazepaths(p + 'R', r, c - 1));

        return ans;
    }

    public static ArrayList<String> mazepathsDiagonal(String p, int r, int c)
    {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1)
            ans.addAll(mazepathsDiagonal(p + 'D',r - 1, c));
        if(r > 1 && c > 1)
            ans.addAll(mazepathsDiagonal(p + 'd', r - 1, c - 1));
        if(c > 1)
            ans.addAll(mazepathsDiagonal(p + 'R', r, c - 1));

        return ans;
    }

    public static void mazepathswithObstacles(String p, boolean[][] maze, int r, int c)
    {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        if(r < maze.length - 1)
            mazepathswithObstacles(p + 'D',maze, r + 1, c);
        if(c < maze[0].length - 1)
            mazepathswithObstacles(p + 'R',maze,  r, c + 1);
    }

}
