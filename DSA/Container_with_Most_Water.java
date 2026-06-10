import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Container_with_Most_Water {
    public static void main(String[] args) {
        List<Integer> heights=new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        int s=0;
        int e=heights.size()-1;
        int maxwater=0;
        while (s<e){
            int width=e-s;
            int height=Math.min(heights.get(s),heights.get(e));
            int currwater=width*height;
            maxwater=Math.max(currwater,maxwater);
            int chosenind=heights.get(s)<heights.get(e)?s++:e--;
        }
        System.out.println(maxwater);
    }
}
