package collections.list.Vector;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        for(int i=1;i<=30;i++){
            vector.add(i);
        }
        Iterator<Integer> vITr=vector.iterator();
        while (vITr.hasNext()){
            int i=vITr.next();
            if(i%2==0){
                System.out.println(i);
            }
            else
                vITr.remove();
        }
        System.out.println(vector);
        Stack<String > stack=new Stack<>();
    }
}
