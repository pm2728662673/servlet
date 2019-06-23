import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
//        String num2 = request.getParameter("num2");
        String f = request.getParameter("flag");
        int flag = Integer.parseInt(f);
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = 0;
        switch (flag) {
            case 1:result = n1 + n2;break;
            case 2:result = n1 - n2;break;
            case 3:result = n1 * n2;break;
            case 4:result = n1 / n2;break;
            default:
                break;
        }
        request.setAttribute("result",result);
        request.getRequestDispatcher("/").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
