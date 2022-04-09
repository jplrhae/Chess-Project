import java.util.Arrays;
import java.util.HashMap;

public class Board {
    private Piece board[][];

    public Board() {
        this.board = new Piece[][] {{new Piece('R', 'B'), new Piece('H', 'B'), new Piece('B', 'B'), new Piece('Q', 'B'), new Piece('K', 'B'), new Piece('B', 'B'), new Piece('H', 'B'), new Piece('R', 'B')},
                                    {new Piece('P', 'B'), new Piece('P', 'B'), new Piece('P', 'B'), new Piece('P', 'B'), new Piece('P', 'B'), new Piece('P', 'B'), new Piece('P', 'B'), new Piece('P', 'B')},
                                    {new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece()},
                                    {new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece()},
                                    {new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece()},
                                    {new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece(), new Piece()},
                                    {new Piece('P', 'W'), new Piece('P', 'W'), new Piece('P', 'W'), new Piece('P', 'W'), new Piece('P', 'W'), new Piece('P', 'W'), new Piece('P', 'W'), new Piece('P', 'W')},
                                    {new Piece('R', 'W'), new Piece('H', 'W'), new Piece('B', 'W'), new Piece('Q', 'W'), new Piece('K', 'W'), new Piece('B', 'W'), new Piece('H', 'B'), new Piece('R', 'B')}};
    }

    public void printBoard() {
        System.out.println(Arrays.deepToString(this.board));
    }

    public boolean hasPieceInPosition(int[] position) {
        return board[position[0]][position[1]].getId() != 0;
    }

    //TODO: implement piece movement - requires finished canPerformMove() method
    public void movePiece(int[] startPosition, int[] endPosition) {
        Piece activePiece = board[startPosition[0]][startPosition[1]];

    }

    //TODO: implement movement validation for every different piece
    public boolean canPerformMove(Piece activePiece, int[] startPosition, int[] endPosition) {
        HashMap<String, Integer> pieceMoveset = activePiece.getMoveset();
        if (activePiece.getId() == 'R') {

        }
        return false;
    }

}
