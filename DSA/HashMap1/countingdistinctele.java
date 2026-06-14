import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class countingdistinctele {
    public static void main(String[] args) {

        int[] arr={4,3,2,5,6,7,3,4,2,1};
        //Brute Force approch
        List<Integer> ls=new ArrayList<>();
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if(ls.contains(arr[i])){
                continue;
            }
            else {
                num++;
                ls.add(arr[i]);
            }

        }
        System.out.println("total no of unique element using brute force:"+num);
        //
        //using hashset
        HashSet<Integer> hs= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);

        }
        System.out.println("Total unique item:"+hs.size());

    }
}
