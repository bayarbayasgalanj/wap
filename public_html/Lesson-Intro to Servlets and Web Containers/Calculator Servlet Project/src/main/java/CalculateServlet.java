import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        String sum1 = request.getParameter("sum1");
        String sum2 = request.getParameter("sum2");
        String mul1 = request.getParameter("mul1");
        String mul2 = request.getParameter("mul2");

        JSONObject result = new JSONObject();

        try {
            if (sum1 != null && !sum1.isEmpty() && sum2 != null && !sum2.isEmpty()) {
                int sum = Integer.parseInt(sum1) + Integer.parseInt(sum2);
                result.put("sum", sum);
            }

            if (mul1 != null && !mul1.isEmpty() && mul2 != null && !mul2.isEmpty()) {
                int product = Integer.parseInt(mul1) * Integer.parseInt(mul2);
                result.put("product", product);
            }
        } catch (NumberFormatException e) {
            result.put("error", "Please enter valid numbers.");
        }

        out.print(result.toString());
    }
}
