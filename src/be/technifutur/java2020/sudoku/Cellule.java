package be.technifutur.java2020.sudoku;

import be.technifutur.java2020.sudoku.commun.Possibilities;

public class Cellule {

    private Possibilities line;
    private Possibilities column;
    private Possibilities square;
    private char valeur;
    private boolean modif;

    public void addLine(Possibilities p){

    }

    public void addColumn(Possibilities p){

    }

    public void addSquare(Possibilities p){

    }

    public void remove(Possibilities p){

    }

    public void isValid(){

    }

    public void isEmpty(){

    }

    public void setValue(char c){
        this.valeur = c;
    }

    public char getValue(){
        return this.valeur;
    }

}
