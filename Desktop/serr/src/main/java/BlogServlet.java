import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class BlogServlet extends HttpServlet {
    public void doPost( HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
    {
        int u=Integer.parseInt(req.getParameter("id"));
        PrintWriter pw=res.getWriter();
        //pw.write("Hello"+u);
        String b=req.getParameter("blogdata");


        HttpSession session=req.getSession ();
        String getuid=(String) session.getAttribute ( "email" );

        pw.println ( getuid );


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","ttn");
            Statement statement=con.createStatement ();

            statement.executeUpdate ( "INSERT INTO blogdata VALUES ("+u+",\'"+b+"\',(SELECT uid from user WHERE email=\'"+getuid+"\'))" );


            pw.write("Inserted successfully in the database");
        }
        catch (Exception ex){
            pw.write("unable to insert");
        }



    }
}
