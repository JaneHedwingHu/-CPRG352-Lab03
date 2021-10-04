package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first;
        String second;
        String action;
        boolean flag = false;
        String checkNums;
        first = request.getParameter("first");
        second = request.getParameter("second");
        checkNums = first + second;
        action = request.getParameter("action");
        request.setAttribute("FIRST", first);
        request.setAttribute("SECOND", second);

        // Check for valid input
        if (first.isEmpty() && second.isEmpty()) {
            request.setAttribute("MESSAGE", "---");
            getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        if (first == null || first.isEmpty() || second == null || second.isEmpty()) {
            flag = true;
        } else {
            for (char c : checkNums.toCharArray()) {
                if (!Character.isDigit(c)) {
                    flag = true;
                }

            }

        }
        if (flag) {

            request.setAttribute("MESSAGE", "Invalid input");
            getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        if (action.equals("+")) {
            request.setAttribute("MESSAGE", Integer.toString((Integer.parseInt(first) + Integer.parseInt(second))));
            getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);

        }
        if (action.equals("-")) {
            request.setAttribute("MESSAGE", Integer.toString((Integer.parseInt(first) - Integer.parseInt(second))));
            getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);

        }
        if (action.equals("*")) {
            request.setAttribute("MESSAGE", Integer.toString((Integer.parseInt(first) * Integer.parseInt(second))));

            getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);

        }
        if (action.equals("%")) {
            request.setAttribute("MESSAGE", Integer.toString((Integer.parseInt(first) % Integer.parseInt(second))));
            getServletContext().getRequestDispatcher("/Styles/arithmeticcalculator.jsp").forward(request, response);

        }

    }

}
