package App;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Connexion", urlPatterns = { "connect" }, loadOnStartup = 1)
public class Connexion extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String disconnect = request.getParameter("disconnect");
        if(disconnect.equals("disconnect")){
            HttpSession session =request.getSession();
            session.invalidate();
            MySql.disconnect();
            request.setAttribute("Connect","1");
        }
        else{
            request.setAttribute("Connect","0");
        }
        request.getRequestDispatcher("connect.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String server = request.getParameter("server");
        String port = request.getParameter("port");
        String datawarehouse = request.getParameter("datawarehouse");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        server+=":"+port+"/"+datawarehouse;
        if(MySql.loadDatabase(server, username, password))
        {
            request.setAttribute("Connect","1");
            HttpSession session = request.getSession(true);
            session.setAttribute("connected_user",username);
        }
        else
            request.setAttribute("Connect","0");

        request.getRequestDispatcher("connect.jsp").forward(request, response);
    }
}