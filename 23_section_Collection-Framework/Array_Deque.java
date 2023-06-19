import java.util.ArrayDeque;

public class Array_Deque
{   
    public static void main(String[] args) 
    {
         ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10); //Add last
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         dq.pollFirst();
         
         dq.offerFirst(1); //Add first
         dq.offerFirst(2);
         dq.offerFirst(3);
         dq.offerFirst(4);

         dq.offerLast(21); ;
         
         dq.forEach((x)->System.out.println(x));
         
    }    
}