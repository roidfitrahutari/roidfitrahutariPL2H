package Exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
