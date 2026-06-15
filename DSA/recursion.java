public class recursion {
    int tot_sum=0;
    static int sum(int num){
        if (num==0) {
            return 0;
        }
        return num+sum(num-1);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int power(int n,int pow){
        if(pow==1){
            return n;
        }
        return n*power(n,pow-1);
    }
//printing number 1st way
    static void Print_Numbers(int current,int num){
        if(current>num){
            return;
        }
        System.out.println(current);
        Print_Numbers(current+1,num);
    }
    //printing number 2nd way
    static void Print_num2(int num){
        if(num==1){
            System.out.println(1);
            return;
        }
        Print_num2(num-1);
        System.out.println(num);
    }
    static int count_dig(int num){
        if(num==0){
            return 0;
        }
        return 1+count_dig(num/10);
    }



    public static void main(String[] args) {
        //System.out.println(sum(5));
        //System.out.println(fact(3));
        //System.out.println(power(2,3));
        //Print_Numbers(1,5);
        //Print_num2(5);
        System.out.println(count_dig(1565));

    }
}