import java.util.ArrayList;

//Generics is  not good practice, because it will not complain regarding
//varibale type, kogda sohranayew v Arraylist, on mojet sohranit kak double tak i String
//poetomu vsegda nujno zadavat Object type

public class Generics {

    public static ArrayList<Integer> arrayList =  new ArrayList<Integer>();

    public static void main(String[] args) {
        arrayList.add(34);
        arrayList.add(31);
        arrayList.add(89);

        for(
            Object i : arrayList
                ){
            System.out.println(i);
        }

    }
}
