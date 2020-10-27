package be.technifutur.java2020.sudoku.commun;


import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Area {

    private Possibilities possibilities;
    private AreaType type;
    private Set<Position> positionSet;

    public Area(int size , AreaType type, Position first){
       this.possibilities = new Possibilities(size);
       this.type = type;
       this.positionSet = new LinkedHashSet<>();

       switch (type){
           case LINE:
               initLine(first, size);
               break;

           case COLUMN:
               initColumn(first, size);
               break;

           case SQUARE:
               initSquare(first, size);
               break;
       }

    }
    private  void initSquare(Position first,int size){
for (int i=0;i<Math.sqrt(size);i++){
    for(int j =0; j<Math.sqrt(size);i++){
        this.positionSet.add(new Position(first.getLine()+i, first.getColumn()+j ));
            }
         }

    }

    private void initLine(Position first, int size){
        for(int i =0; i<size;i++){
            this.positionSet.add(new Position (first.getLine(), first.getColumn()+i));
        }
    }
    private void initColumn(Position first, int size){

    }

    public Set<Position> getPositionSet(){
        return Collections.unmodifiableSet(positionSet) ;
    }

    public AreaType getType() {
        return type;
    }

// methdoes ajoutées avec code generate method pour la class possibilites
    public boolean add(int i) {
        return possibilities.add(i);
    }

    public boolean remove(int i) {
        return possibilities.remove(i);
    }

    public boolean contains(int i) {
        return possibilities.contains(i);
    }

    public int size() {
        return possibilities.size();
    }

    public static void main(String[] args) {
        Area area = new Area(9,AreaType.LINE, new Position(5,1));
        for(Position p : area.positionSet){
            System.out.println(p);
        }
    }
}
// je dois pouvoir créer 27 object 9 col 9 ligne 9 carré