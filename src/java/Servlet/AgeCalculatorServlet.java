package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jane Hu
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/Styles/agecalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nextBirthDay;
        nextBirthDay = request.getParameter("age");

        // Request for age input
        if (nextBirthDay == null || nextBirthDay.isEmpty()) {

            request.setAttribute("MESSAGE", "Please enter your current age.");

            getServletContext().getRequestDispatcher("/Styles/agecalculator.jsp").forward(request, response);
            return;
        }

        for (char c : nextBirthDay.toCharArray()) {
            if (!Character.isDigit(c)) {

                request.setAttribute("MESSAGE", "Please enter a number.");

                getServletContext().getRequestDispatcher("/Styles/agecalculator.jsp").forward(request, response);
                return;
            }

        }

        request.setAttribute("MESSAGE", "Your age on your next brithday will be " + (Integer.parseInt(nextBirthDay) + 1));
        getServletContext().getRequestDispatcher("/Styles/agecalculator.jsp").forward(request, response);

    }
}
