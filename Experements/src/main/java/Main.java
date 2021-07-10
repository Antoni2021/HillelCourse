import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        if (count < 3){
            count++;
//            main(null);
        } else {
            return;
        }
        System.out.println("count = 3");

        LinkedList<Integer> son = new LinkedList<>();
        son.add(5);
        son.add(1);
        son.add(10);
        System.out.println(son);
        String[] str = new String[]{"Abra", "Strong", "Fuu"};
        String st = "Strong";
        String[] str1 = new String[]{"Abra", st, "Fuu"};
        ArrayList<String> s1 = new ArrayList<>(Arrays.asList(str));
        ArrayList s2 = new ArrayList<>(Arrays.asList(str1));
        System.out.println(s1.equals(s2));
        System.out.println(s2);




    }


}
