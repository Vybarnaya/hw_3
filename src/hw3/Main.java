package hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Groups group1 = new Groups("U-123");
        Groups group2 = new Groups("N-456");
        Groups group3 = new Groups("M-852");
        Groups group4 = new Groups("Y-973");
        Groups group5 = new Groups("M-452");
        Groups group6 = new Groups("U-856");

        Potock potock1 = new Potock();
        Potock potock2 = new Potock();

        potock1.addListGroups(group1);
        potock1.addListGroups(group2);
        potock1.addListGroups(group4);
        potock1.addListGroups(group6);
        potock2.addListGroups(group3);
        potock2.addListGroups(group5);

        List<Potock> potocks = new ArrayList<>();

        potocks.add(potock1);
        potocks.add(potock2);

        System.out.println("Отсортированный список потоков по количеству групп:");

        PotockServise potockServise = new PotockServise();
        potockServise.sortPotocks(potocks);

        Controller controller = new Controller(potockServise);
        controller.sortedPotocks(potocks);

        for (Potock item : potocks) {
            System.out.println("Поток ("+ item.sizeListGroups() + " группы) :");
            for (Groups group : item) {
                System.out.println(group.getNumberGroup());
            }
        }

    }
}
