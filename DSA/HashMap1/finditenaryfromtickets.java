import java.util.HashMap;

public class finditenaryfromtickets {
    public static String starter(HashMap<String,String> States){
        HashMap<String,String> tofrom=new HashMap<>();
        for(String k:States.keySet()){
            tofrom.put(States.get(k),k);
        }
        for (String i:States.keySet()){
            if(!tofrom.containsKey(i)){
                return i;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<String,String> state_list=new HashMap<>();//fromto
        state_list.put("Chennai","Bengaluru");
        state_list.put("Mumbai","Delhi");
        state_list.put("Goa","Chennai");
        state_list.put("Delhi","Goa");
        String firststate=starter(state_list);
        System.out.print(firststate);;
        for (String i:state_list.keySet()){
            System.out.print("-->"+state_list.get(firststate));
            firststate=state_list.get(firststate);
        }

    }
}
