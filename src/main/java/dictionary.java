import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServletz", value = "/translate")
public class dictionary extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello","xin chao");
        dic.put("bye","tam biet");
        dic.put("go","di");
        dic.put("fun","vui");
        dic.put("sad","buon");
        dic.put("phone","dien thoai");

        String search = request.getParameter("txtSearch");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dic.get(search);
        if(result!=null){
            writer.println("Vietnamese : "+search);
            writer.println("English : "+result);
        }
        else {
            writer.println("Not found");
        }
        writer.println("</html>");
    }
}
