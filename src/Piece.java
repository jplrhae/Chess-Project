import java.util.Arrays;
import java.util.HashMap;

public class Piece {
    private char id;
    private char team;
    private HashMap<String, Integer> moveset;

    public Piece() {}

    public Piece(char id, char team) {
        this.setId(id);
        this.setTeam(team);
        this.setMoveset();
    }

    public String getPieceName() {
        switch (id) {
            case 'R':
                return "Rook";
            case 'H':
                return "Knight";
            case 'B':
                return "Bishop";
            case 'Q':
                return "Queen";
            case 'K':
                return "King";
            case 'P':
                return "Pawn";
            default :
                return "Name not found";
        }
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        if (Arrays.asList('R', 'H', 'B', 'Q', 'K', 'P').contains(id)) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid value for chess piece ID.");
        }
    }

    public char getTeam() {
        return team;
    }

    public void setTeam(char team) {
        if (team == 'B' || team == 'W') {
            this.team = team;
        } else {
            throw new IllegalArgumentException("Invalid value for chess piece team.");
        }
    }

    public HashMap<String, Integer> getMoveset() {
        return moveset;
    }

    // Retrieves max number of movements vertically, horizontally and diagonally
    public void setMoveset() {
        final String VERTICAL = "VERTICAL";
        final String HORIZONTAL = "HORIZONTAL";
        final String DIAGONAL = "DIAGONAL";

        switch (id) {
            case 'R':
                this.moveset.put(VERTICAL, 7);
                this.moveset.put(HORIZONTAL, 7);
                this.moveset.put(DIAGONAL, 0);
                break;
            case 'H':
                this.moveset.put(VERTICAL, 2);
                this.moveset.put(HORIZONTAL, 2);
                this.moveset.put(DIAGONAL, 0);
                break;
            case 'B':
                this.moveset.put(VERTICAL, 0);
                this.moveset.put(HORIZONTAL, 0);
                this.moveset.put(DIAGONAL, 7);
                break;
            case 'Q':
                this.moveset.put(VERTICAL, 7);
                this.moveset.put(HORIZONTAL, 7);
                this.moveset.put(DIAGONAL, 7);
                break;
            case 'K':
                this.moveset.put(VERTICAL, 1);
                this.moveset.put(HORIZONTAL, 1);
                this.moveset.put(DIAGONAL, 1);
                break;
            case 'P':
                this.moveset.put(VERTICAL, 2);
                this.moveset.put(HORIZONTAL, 0);
                this.moveset.put(DIAGONAL, 0);
                break;
            default:
                this.moveset.put(VERTICAL, 0);
                this.moveset.put(HORIZONTAL, 0);
                this.moveset.put(DIAGONAL, 0);
                break;
        }
    }
}
