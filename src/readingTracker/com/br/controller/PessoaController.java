package readingTracker.com.br.controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PessoaController", urlPatterns = {"/pessoa"})
public class PessoaController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

    }


}
