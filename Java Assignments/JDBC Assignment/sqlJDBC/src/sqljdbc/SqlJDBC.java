package sqljdbc;

import java.util.Scanner;
import java.sql.*;

public class SqlJDBC {     
    public static void main(String[] args) {
        System.out.println("Enter Option. \n 1) See All Data \n 2) Update Data");
        Scanner input = new Scanner(System.in);
        int userOption = input.nextInt();
        switch(userOption)
        {
            case 1:
                getAllData();
                break;
            case 2:
                updateData();
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
    }
    public static void getAllData()
    {
        try{
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tblstudent");
            while(rs.next()){
                System.out.println("ID Is : " + rs.getString(1));
                System.out.println("Name Is : " + rs.getString(2));
                System.out.println("Roll No Is : " + rs.getString(3));
                System.out.println("Course Is : " + rs.getString(4));
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public static void updateData(){
        try{
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "");
            String sql = "UPDATE tblstudent SET name = ?, roll_no = ?, course = ? WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter The ID You Want To Edit : ");
            String id = scan.nextLine();
            System.out.println("Enter Your Name : ");
            String name = scan.nextLine();
            System.out.println("Enter Your Roll No : ");
            String rno = scan.nextLine();
            System.out.println("Enter Your Course : ");
            String course = scan.nextLine();
            st.setString(1, name);
            st.setString(2, rno);
            st.setString(3, course);
            st.setString(4, id);
            st.executeUpdate();
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}