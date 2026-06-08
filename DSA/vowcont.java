import java.util.Scanner;
public class vowcont{


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String str=sc.nextLine();
        int constant=0;
        int vowel=0;
        String vowels="aeiou";
        for (char c1:str.toCharArray()) {
            if("aeiou".indexOf(c1)!=-1){
                vowel++;
            }
            else {
                constant++;
            }

        }
        System.out.printf("Vowels:%d,Constants:%d\n",vowel,constant);




    }

}
