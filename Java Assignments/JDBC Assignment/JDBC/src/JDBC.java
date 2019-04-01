import javax.swing.*;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) { 
       JDBCGUI form = new JDBCGUI();
       form.setVisible(true); 
       form.setTitle("School Management System");
       ImageIcon frameIcon = new ImageIcon("F:\\Java Practice\\JDBC Assignment\\JDBC\\Icon.png");
       form.setIconImage(frameIcon.getImage());
    }
}
