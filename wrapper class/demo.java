import java.util.*;

public class demo {
    String name;
    int id;
    String course;

    public demo(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args) {
        /*Integer i=Integer.valueOf("123");
        System.out.println(i);
        List<Integer>nums=new ArrayList<>();
        nums.add(10);
        nums.add(23);
        nums.add(29);
        nums.add(2);
        System.out.println(nums);
        System.out.println(nums.get(2));*/
        //List practice
        /*List<demo> list=new ArrayList<>();
        demo d1=new demo("aditya",9,"math");
        demo d2=new demo("anubhav",9,"hindi");
        demo d3 =new demo("dhr",9,"cse");
        list.add(d3);
        list.add(d2);
        list.add(d3);
        System.out.println(list);*/
        //Linked List
        /*LinkedList<String> lst=new LinkedList<>();
        lst.add("aditya");
        lst.add("the");
        lst.add("great");
        System.out.println(lst.getFirst());
        System.out.println(lst.getLast())*/;
        //vector
        /*Vector<Integer> vector=new Vector<>();
        for (int i = 0; i <3; i++) {
            vector.add(i);

        }
        Enumeration<Integer> e=vector.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }*/
        //
        List<Integer>ls=new ArrayList<>();
        for (int i = 0; i <=2; i++) {
            ls.add(i);
        }
        System.out.println(ls);
        Iterator<Integer> it=ls.iterator();
        while (it.hasNext()){
            int data= it.next();
            if(data==1){
                it.remove();

            }
            else {
                System.out.println(data);
            }
        }



    }
}
