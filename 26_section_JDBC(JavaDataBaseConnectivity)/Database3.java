import java.sql.*;
import java.util.Scanner;

public class Database3
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.db");

        //Statement stm=con.createStatement();

        // stm.executeUpdate("insert into dept values(60,'chem')");

        //stm.executeUpdate("delete from dept where deptno>=60");

        //stm.executeUpdate("update dept set dname='chem' where deptno=40");

        //insert using prepared statement
        Scanner sc=new Scanner(System.in);
        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");
        System.out.println("Enter Student Data");
        int r=sc.nextInt();
        String name=sc.next();
        String city=sc.next();
        int dno=sc.nextInt();

        stm.setInt(1,r);
        stm.setString(2,name);
        stm.setString(3,city);
        stm.setInt(4,dno);

        stm.executeUpdate();
        
        ResultSet rs=stm.executeQuery(null);

        while(rs.next())
        {
            System.out.print(rs.getInt("rollno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4));
          
        }
        stm.close();
        con.close();

    }
    
}
