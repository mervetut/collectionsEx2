package com.company;

import ibadts.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> values = new Collection<>();
        values.add(new Integer[]{8, 17, 5, 2, 1});

        int largest = 0;
        values.resetNext(); //trace from the beggining
        while (values.hasNext()) {
            int v = values.getNext();
            if (v > largest)
                largest = v;
        }
        values.resetNext();
        while (values.hasNext()) ;
        int v = values.getNext();
        if (v < largest / 2)
            System.out.println(v);
    }
}
