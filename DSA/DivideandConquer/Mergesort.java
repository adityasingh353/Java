import java.util.Arrays;

public class Mergesort {
    static public void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si +(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    static public void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=ei){
            temp[k++]=arr[j++];
        }
        for (i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int list[]={2,3,4,5,1,9};
        int start=0;
        int end=list.length-1;
        mergeSort(list,start,end);
        System.out.println(Arrays.toString(list));}
}

