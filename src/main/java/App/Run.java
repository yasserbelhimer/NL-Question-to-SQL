package App;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Run", urlPatterns = { "queryResult" }, loadOnStartup = 1)
public class Run extends HttpServlet {
    public Run(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String query = request.getParameter("query");
        ArrayList<String> myResults = new ArrayList<>();
        myResults = MySql.getResult(query);
        String head  = myResults.get(0);
        myResults.remove(0);
        request.setAttribute("Head",head);
        request.setAttribute("Results",myResults);

        request.getRequestDispatcher("queryResult.jsp").forward(request, response);
    }
}