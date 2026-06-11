import java.util.Arrays;
class Pair{
    int value;
    int index;

    public Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
public class sumoftwo {
    public static int[] Bruteforce(int[] arr,int target){
        //O(n^2) Time complexity
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    return new int[]{i, j};

                }

            }

        }
        return new int[]{-1,-1};

    }
    public static int[] TwopointerSum(int[] arr,int target){
        //O(n) Time complexity
        int i=0;
        int j=arr.length-1;
        Pair[] pairs=new Pair[arr.length];
        for (int k = 0; k <arr.length; k++) {
            pairs[k]=new Pair(k,arr[k]);
        }
        Arrays.sort(pairs,(a,b)->a.value-b.value);
        while (i<j){
            if(pairs[i].value+pairs[j].value==target){
                return new int[] {pairs[i].index,pairs[j].index};
            }if(pairs[i].value+pairs[j].value<target){
                i++;
            }if(pairs[i].value+pairs[j].value>target){
                j--;
            }


        }
        return new int[] {-1,-1};

    }

    public static void main(String[] args) {
        //nums = [2,7,11,15], target = 9

        int[] list={2,7,11,15,8,5};
        int[] result1=Bruteforce(list,9);
        //preserving index to get correct index of number after sorting

        int[] result2=TwopointerSum(list,7);
        System.out.println("the index are using bruteforce for target 9: "+ Arrays.toString(result1));
        System.out.println("the index are using two point approch for targer 7: "+ Arrays.toString(result2));

    }
}
