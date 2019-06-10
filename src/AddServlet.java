import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //We also have doGet and doPost methods to limit whther we want to execute only post or get resuest

        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i +j;

        PrintWriter printer = response.getWriter();

        printer.println("Response: " +  i + " + " + j + " = " + k);

        //System.out.println("Response: " +  i + " + " + j + " = " + k);
    }

}
