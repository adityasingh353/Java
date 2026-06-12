import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class hashmap {
    static int[] count(int[] arr){
        int size=arr.length;
        int constraint=size/3;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            int num=arr[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }
            else {
                hm.put(num,1);
            }
            
        }
        ArrayList<Integer>result=new ArrayList<>();
        for(int k:hm.keySet()){
            if(hm.get(k)>constraint){
                result.add(k);
            }
        }
        int[ ] ls=new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ls[i]=result.get(i);


        }
        return ls;





    }
    public static void main(String[] args) {
        int[] arr={1,3,2,3,5,1,3,1,5,3,1};
        int[] result1=count(arr);

        System.out.println("The number with more element than "+ arr.length/3 +"is:"+ Arrays.toString(result1));



    }
}
