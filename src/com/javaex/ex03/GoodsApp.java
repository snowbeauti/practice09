package com.javaex.ex03;

import java.util.Scanner;

public class GoodsApp {

    public static void main (String[] args) {
    	
    	System.out.println("상품을 입력해주세요(종료q)");
    	Scanner sc = new Scanner(System.in);
    	
    	
    	while(true) {
  
    		String str = sc.nextLine();
    		String[] sArray = str.split(",");
    		

    		
    		if(str.equals("q")) {
    		break;
    		}
        	
        	
    	}
    	System.out.println("[입력완료]");
    	
    	
    	sc.close();
    	
    }

}
