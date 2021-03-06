package be.technifutur.java2020.sudoku.sudokuetoile;

import be.technifutur.java2020.sudoku.commun.AbstractSudokuModele;

public class SudokuEtoileModele extends AbstractSudokuModele {

    protected SudokuEtoileModele(){
        super(21,21);
    }

    public boolean isValid(char value){                                 //Vérifie si la valeur entrée est valide
        boolean valid = false;

        if(Character.isDigit(value)) {
            int val = Character.getNumericValue(value);
            valid = val >= 1 && val <= 9;
        }
        return valid;
    }

    public boolean isPositionValid (int l, int c){                      //Vérifie si la position entrée est valide
        return l>=0 && l<21 && c>=0 && c<21;
    }

}