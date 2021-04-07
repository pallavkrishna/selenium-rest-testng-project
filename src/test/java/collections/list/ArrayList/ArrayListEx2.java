package collections.list.ArrayList;

import java.util.ArrayList;

import java.util.ListIterator;

public class ArrayListEx2 {

    public static void main(String[] args) {
        ArrayList<Number> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(null);
        arrayList.add(1.5);
        arrayList.add(3.5f);
        arrayList.add(10);
        ArrayList<Number> arrayList1=new ArrayList<>(arrayList);
        ArrayList<Number> arrayList2=new ArrayList<>(arrayList);
        ArrayList<Number> arrayList3=new ArrayList<>(arrayList);

        System.out.print("Element of arrayList 1");
        System.out.println(arrayList1);
        arrayList1.clear();
        System.out.println("Element of arrayList 1 after clear");
        System.out.println(arrayList1);
        System.out.println("arrayList1 size "+arrayList1.size());

        System.out.println("Element of arrayList 2");
        System.out.println(arrayList2);
        arrayList2.removeAll(arrayList);
        System.out.print("Element of arrayList 2 after removeAll");
        System.out.println("arrayList2 size "+arrayList2.size());
        System.out.println();

        System.out.println("Element of arrayList 3");
        System.out.println(arrayList3);
        arrayList3.add(45);
        arrayList3.retainAll(arrayList);
        System.out.print("Element of arrayList 3 after retainAll");
        System.out.println("arrayList3 size "+arrayList2.size());
        System.out.println();
        //ListIterator

        //System.out.println(arrayList);
        //arrayList.clear();

       /* System.out.println(arrayList);

        arrayList1.add(10.5);
        arrayList1.add(11.5);
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);
        arrayList1.retainAll(arrayList);
        System.out.println(arrayList1);*/
    }
}
