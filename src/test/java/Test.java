
public class Test {
    public static void main(String[] args) {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        int[] a ={1,5,7,8,8,-8   };
        int result = a[0];
        for(int index=0;index<a.length-1;index++){
            if(result<a[index]){
                 result=a[index];
            }
        }
        System.out.println(result);
    }
}


