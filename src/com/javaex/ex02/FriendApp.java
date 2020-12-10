package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	Friend f1 = new Friend();
    	Friend f2 = new Friend();
    	Friend f3 = new Friend();
    	
    	fList.add(f1);
    	fList.add(f2);
    	fList.add(f3);
    	
    	
    	for(int i=0; i<fList.size(); i++) {
    		String friend = sc.nextLine();
    		String[] fArray = friend.split(" ");
    		
    		fList.get(i).setName(fArray[0]);
    		fList.get(i).setHp(fArray[1]);
    		fList.get(i).setSchool(fArray[2]);
    	
    	}
    	
    	for(int i=0; i<fList.size(); i++) {
    	fList.get(i).draw();
    	}
    	sc.close();
    	
    	
    }

}
