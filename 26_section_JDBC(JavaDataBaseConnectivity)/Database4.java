import java.sql.*;

class Database4 {
    public static void main(String args[]) throws Exception {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.db");

        Statement stm = con.createStatement();

        //stm.executeUpdate("create table TEMP(a integer,b float)");

        stm.executeUpdate("drop table TEMP");

      
        stm.close();
        con.close();
    }
}