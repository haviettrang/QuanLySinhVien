package unblocmemazeoriginal;

/**
 *
 * @author XtarX
 */
public interface SeachInterface {

    public void solve(boolean visualize);

    public void possibleMoves(Board board);

    public void addtoQueue(Board board);

    public boolean isGoal(int[][] board);
}
