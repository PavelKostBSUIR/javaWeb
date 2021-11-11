package by.bsuir.kostukevich.task_4;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Set set = new Set(10);
        set.printSet();
        System.out.println("Indexes of simple numbers:");
        System.out.println(ActionsWithSet.findSimpleNumbers(set));
    }
}
