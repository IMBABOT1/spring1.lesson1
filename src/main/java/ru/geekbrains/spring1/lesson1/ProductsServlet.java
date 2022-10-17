package ru.geekbrains.spring1.lesson1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductsServlet extends HttpServlet {

    private List<Product> products;

    @Override
    public void init() throws ServletException {
        products = new ArrayList<>();
        products.add(new Product(1l, "first", 10));
        products.add(new Product(2l, "first", 10));
        products.add(new Product(3l, "first", 10));
        products.add(new Product(4l, "first", 10));
        products.add(new Product(5l, "first", 10));
        products.add(new Product(6l, "first", 10));
        products.add(new Product(7l, "first", 10));
        products.add(new Product(8l, "first", 10));
        products.add(new Product(9l, "first", 10));
        products.add(new Product(10l, "first", 10));
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < products.size(); i++) {
            resp.getWriter().printf("<h1>Product" + products.get(i) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}
