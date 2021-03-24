package com.kh.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuOrderServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException{
		//0. encoding 선언
		request.setCharacterEncoding("utf-8");
		
		//1.사용자 입력값 변수에 담기
		String main = request.getParameter("main_menu");
		String side = request.getParameter("side_menu");
		String drink = request.getParameter("drink_menu");
		
		//출력식으로 확인
		   	System.out.println("main= "+main );
	        System.out.println("side= "+side );
	        System.out.println("drink= "+drink );
		
		
		//2.전체 결제금액 계산
		int sum = 0;
		switch(main) {
		case "한우버거" : sum += 5000;break;
		case "밥버거" : sum += 4500;break;
		case "치즈버거" : sum += 4000;break;
		}
		switch(side) {
		case "감자튀김" : sum += 1500;break;
		case "어니언링" : sum += 1700;break;
		}
		switch(drink) {
		case "콜라" :
		case "사이다" : sum += 1000;break; //switch fall-through
		case "커피" : sum += 1500;break;
		case "밀크쉐이크" : sum += 2500;break;
		}
		
		//forward
		request.setAttribute("sum", sum);
		request.setAttribute("main", main);
		request.setAttribute("side", side);
		request.setAttribute("drink", drink);
		
		//html 작성을 jsp에 위임 처리 RequestDispatcher
		RequestDispatcher reqDispatcher
			= request.getRequestDispatcher("/menu/menuOrder.jsp");
		reqDispatcher.forward(request, response);
		
	}

}
