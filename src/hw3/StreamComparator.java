package hw3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Potock> {

    @Override
    public int compare(Potock o1, Potock o2) {

        return Integer.compare(o1.sizeListGroups(),o2.sizeListGroups());

    }
}
