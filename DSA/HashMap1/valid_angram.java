import java.util.HashMap;

public class valid_angram {
    public static void main(String[] args) {
        String s="tulip";
        String p="uptli";
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i <p.length() ; i++) {
            char ch=p.charAt(i);
            if (hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)-1);
            }
            else {
                System.out.println("not an angram");
                return;
            }
            if (hm.get(ch)==0){
                hm.remove(ch);
            }

        }
        if (hm.isEmpty()){
            System.out.println("It's an Anagram");
        }

    }
}
