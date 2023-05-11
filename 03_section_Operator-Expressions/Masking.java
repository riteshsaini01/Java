public class Masking {
    public static void main(String[] args){

        byte a=9,b=12;
        //We have to store 9 and 12 in one variable c

        byte c;

        c=(byte)(a<<4);
        c=(byte)(c|b);

        System.out.println(c);
        //Now lets read first 4 bits of c
        System.out.println((c&0b11110000)>>4);
        //Lets read last four bits of c
        System.out.println((c&0b00001111));
    }
}
