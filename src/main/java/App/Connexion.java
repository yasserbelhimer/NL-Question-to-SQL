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
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

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
        String type     = request.getParameter("type");
        server+=":"+port+"/"+datawarehouse;
        if(MySql.loadDatabase(server, username, password))
        {
            
            HttpSession session = request.getSession(true);
            if(type.equals("ITDesigner")){
                session.setAttribute("connected_ITDesigner",username);
                request.setAttribute("Connect","1");
            }
            else{
                session.setAttribute("connected_user",username);
                request.setAttribute("Connect","2");
            }
            
        }
        else
            request.setAttribute("Connect","0");

        request.getRequestDispatcher("connect.jsp").forward(request, response);
    }
}