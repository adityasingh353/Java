

import java.util.Scanner;

import java.util.Scanner;
public class palindrome {
    public static void
    main(String[] args) {
        int a=1;
        Scanner sc=new Scanner(System.in);
        String word =sc.next();

        int word_length=word.length();
        char[] arr=word.toCharArray();
        for (int i = 0; i <word_length; i++) {
            if(arr[i]==arr[word_length-1-i]){
                continue;

            }
            else{
                a=-1;
                break;
            }

        }
        if(a!=-1){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
