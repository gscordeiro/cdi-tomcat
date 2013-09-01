package br.com.casadocodigo.livrocdi.servlets;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.casadocodigo.livrocdi.folhapagamento.CalculadoraSalarios;
import br.com.casadocodigo.livrocdi.folhapagamento.Funcionario;

@WebServlet("/calculadoraSalario")
public class CalculadoraSalarioServlet extends HttpServlet {

	private static final long serialVersionUID = -4976108838811315310L;
	
	@Inject
	private CalculadoraSalarios calculadoraSalarios;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Funcionario funcionario = new Funcionario(req.getParameter("funcionario"), Double.parseDouble(req.getParameter("salario")));
		
		double salario = calculadoraSalarios.calculaSalario(funcionario);
		
		req.setAttribute("salarioCalculado", salario);
		req.setAttribute("funcionario", funcionario);
		
		req.getRequestDispatcher("/resultado.jsp").forward(req, resp);
	}
}
