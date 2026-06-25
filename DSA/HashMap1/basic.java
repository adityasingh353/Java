package HashMap1;

import java.util.HashMap;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer> ls=new HashMap<>();
        ls.put("Sonu",12);
        ls.put("Monu",1);
        ls.put("Pappu",16);
        System.out.println(ls);
        Set<String> key=ls.keySet();
        System.out.println(key);
        for (String k:key){
            System.out.println("key:"+k+"  value:"+ls.get(k));
        }
    }
}
