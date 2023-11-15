package hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potock implements Iterable<Groups>{

    private List<Groups> potock;

    public Potock() {
        potock = new ArrayList<>();
    }


    public void addListGroups(Groups group){
        potock.add(group);
    }

    public int sizeListGroups(){
        return  potock.size();
    }

    @Override
    public Iterator <Groups>iterator() {
        return potock.iterator();
    }
}
