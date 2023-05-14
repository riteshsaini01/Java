public class String1 {
    public static void main(String[] args){

        //  Creating string

        String str1="Java Program";
        String str2=new String("JAVA");
        
        char c[]={'h','e','l','l','o'};
        String str3=new String(c);

        byte b[]={65,66,67,68};
        String str4=new String(b,2,2);

        System.out.println(str3);  
        System.out.println(str4);
    }
}
