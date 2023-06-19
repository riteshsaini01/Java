import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class TreeMap_HashMap 
{

    public static void main(String args[])
    {
        HashMap<Integer,String> tm=new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        

        tm.put(4,"E");
        tm.put(5,"F");
        
        System.out.println(tm);


        /* 
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        tm.put(4,"E");
        tm.put(6,"G");

        Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());

        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm.get(3));

        System.out.println(tm);
        */
    }

    
}
