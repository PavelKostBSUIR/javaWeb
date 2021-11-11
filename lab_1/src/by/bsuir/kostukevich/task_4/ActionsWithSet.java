package by.bsuir.kostukevich.task_4;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ActionsWithSet {

    public static List<Integer> findSimpleNumbers(Set set) {
        int[] arraySet = set.getArray();
        List<Integer> listOfIndexes = new ArrayList<>();
        for (int i = 0; i < set.getArray().length; i++) {
            boolean isSimple = true;
            if (arraySet[i] == 0 || arraySet[i] == 1) {
                continue;
            } else if (arraySet[i] == 2) {
                System.out.print(arraySet[i] + " ");
            } else {

                for (int j = 2; j < arraySet[i] - 1; j++) {
                    if (arraySet[i] % j == 0) {
                        isSimple = false;
                        break;
                    }
                }

            }
            if (isSimple) {
                listOfIndexes.add(i);
            }
        }
        return listOfIndexes;
    }
}
