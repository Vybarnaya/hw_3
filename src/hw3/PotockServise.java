package hw3;

import java.util.List;

public class PotockServise {

    public void sortPotocks(List <Potock> potocks){
        StreamComparator sortingPotocks = new StreamComparator();
        potocks.sort(sortingPotocks);
    }
}
