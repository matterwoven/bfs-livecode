public class Search {
    public static void main(String[] args){
        Set<int[]> visited = new HashSet<>();
        int[] a = new int[]{5, 8};
        int[] b = new int[]{2, 1};
        int[] c = new int[]{5, 8};

        visited.add(a);

        System.out.println(visited.contains(a));
        System.out.println(visited.contains(b));
        System.out.println(visited.contains(c));
    }
     /**
     * Finds the location of the nearest reachable cheese from the rat's position.
     * Returns a 2-element int array: [row, col] of the closest 'c'. If there are multiple
     * cheeses that are tied for the same shortest distance to reach, return
     * any one of them.
     * 
     * 'R' - the rat's starting position (exactly one)
     * 'o' - open space the rat can walk on
     * 'w' - wall the rat cannot pass through
     * 'c' - cheese that the rat wants to reach
     * 
     * If no rat is found, throws EscapedRatException.
     * If more than one rat is found, throws CrowdedMazeException.
     * If no cheese is reachable, throws HungryRatException
     *
     * oooocwco
     * woowwcwo
     * ooooRwoo
     * oowwwooo
     * oooocooo
     *
     * The method will return [0,4] as the nearest cheese.
     *
     * @param maze 2D char array representing the maze
     * @return int[] location of the closest cheese in row, column format
     * @throws EscapedRatException if there is no rat in the maze
     * @throws CrowdedMazeException if there is more than one rat in the maze
     * @throws HungryRatException if there is no reachable cheese
     */
    public static int[] nearestCheese(char[][] maze) throws EscapedRatException, CrowdedMazeException, HungryRatException {
        int[] current = ratLocation(maze);


        return null;
    }

    public static int[] ratLocation(char[][] maze) {
        int[] location = null;
        for(int r = 0; r < maze.length; r++) {
            for(int c = 0; c < maze[r].length; c++) {
                if(maze[r][c] == 'R') {
                    if(location == null) location = new int[]{r, c};
                    else throw new CrowdedMazeExpection();
                }
            }
        }
        if(location == null) throw new EscapedRatException();

        return location;
    }
}