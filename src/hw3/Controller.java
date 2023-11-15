package hw3;

import java.util.List;

public class Controller {

    private PotockServise potockServise;

    public Controller(PotockServise potockServise){
        this.potockServise= potockServise;

    }

    public void sortedPotocks(List<Potock> potocks){
        potockServise.sortPotocks(potocks);
    }
}
