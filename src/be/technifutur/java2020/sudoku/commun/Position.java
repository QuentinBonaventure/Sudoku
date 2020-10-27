package be.technifutur.java2020.sudoku.commun;

public class Position {

    private int line;
    private int column;

    public Position (int line , int column){
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;

    }

    @Override
    public String toString() {
        return "Position{" +
                "line=" + line +
                ", column=" + column +
                '}';
    }

    public int getColumn() {
        return column;

    }
}
