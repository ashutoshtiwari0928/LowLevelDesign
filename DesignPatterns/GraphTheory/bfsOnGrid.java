package DesignPatterns.GraphTheory;

import java.util.LinkedList;
import java.util.Queue;

public class bfsOnGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1},
                {1,0,0},
                {0,0,0}
        };
        bfs(grid,0,0);
    }
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static void bfs(int[][] grid,int startx,int starty){
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        visited[startx][starty]=true;
        q.add(new int[]{startx, starty, 0});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0],y=curr[1],dist=curr[2];
            System.out.println(STR."Visiting (\{x},\{y}) at distance \{dist}");
            for(int i=0;i<4;i++){
                int nx = x+dx[i],ny=y+dy[i];
                if(nx<0 || ny<0 || nx>=n || ny>=m || visited[nx][ny] || grid[nx][ny]!=0)
                    continue;
                visited[nx][ny]=true;
                q.add(new int[]{nx,ny,dist+1});
            }
        }
    }
}
