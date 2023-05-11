public class Bitwise {
    public static void main(String[] args){

        //int x=10,y=6,z;
        //z=x&y;
        //z=x|y;
        //z=x^y;
        //System.out.println(z);

        //int x=0b1000;
        //int y;
        //y=x<<1;
        //System.out.println(y);

        int x=-0b1010;
        int y;
        y=x>>>1;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y))  ;
        
        int z=0b1010;
        int a=~z;
        System.out.println(a);
    }
}
