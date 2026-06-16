import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class iteratoruse {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Delhi");
        hs.add("UP");
        hs.add("Rajasthan");
        Iterator it=hs.iterator();
        /*while (it.hasNext()){
            System.out.println(it.next());//we will getunordered result
        }*/
        for(String s:hs){
            System.out.println(s);
        }
    }
}
