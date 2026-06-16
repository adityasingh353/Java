import java.util.HashMap;

public class largestsubarraywithsumzero {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1};
        int sum=0;
        int len=0;
        //main logic:sum(i+1,j)=sum(j,0)-sum(i,0)
        //(sum,index)
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(hm.containsKey(sum)){
                len=Math.max(len,i-hm.get(sum));
            }
            else {
                hm.put(sum,i);
            }

        }
        System.out.println("largest subarray with sum 0 is of length: "+len);
    }
}
