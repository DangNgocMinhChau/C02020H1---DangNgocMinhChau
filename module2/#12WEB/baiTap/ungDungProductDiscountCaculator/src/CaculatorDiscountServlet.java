import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorDiscountServlet", urlPatterns = "/display-discount")
public class CaculatorDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String productDescription = request.getParameter("productDescription");
                float price  = Float.parseFloat(request.getParameter("price"));
                float discount = Float.parseFloat(request.getParameter("discount"));

                float discountAmount = (float) (price * discount * 0.1);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description " + productDescription + "</h1>"+ "</br>");
        writer.println("<h1> List Price: " + price + "</h1>" + "</br>");
        writer.println("<h1> Discount Percent : " + discount + "</h1>"+ "</br>");
        writer.println("<h1> Discount Amount: : " + discountAmount + "</h1>"+ "</br>");
        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
