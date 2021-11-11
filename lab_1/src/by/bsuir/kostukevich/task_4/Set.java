package by.bsuir.kostukevich.task_4;

import by.bsuir.kostukevich.input.RandomArray;

public class Set {
    private int size;
    private int[] array;

    public Set(int size) {
        this.size = size;
        array = new int[size];
        initArray();
    }

    private void initArray() {
        RandomArray.initIntArray(array);
    }

    public void printSet() {
        System.out.print("Elements of array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
