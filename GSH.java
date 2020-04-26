package cvc;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class GSH {
    public static void main(String[] args) throws Exception{
  	  try {
  		  
  		String changhenge;
          Scanner sc = new Scanner(System.in);
          PrintStream ps = new PrintStream("C:\\ZXY\\cDDDc.txt");

  	    System.out.print("请输入古诗词："); 
          changhenge = sc.nextLine(); 

  	    char[] chs = new char[800]; 
  	    chs= changhenge.toCharArray(); 
  	
  	    int i=1;
  	    char[] char_chang=changhenge.toCharArray();
  	    for(char aaa:char_chang) {
             System.out.print(aaa);
             ps.print(aaa);
  		  if(i%7==0&&i%14!=0){
                System.out.println("，");
                ps.println("，");
              }
  		  if(i%14==0){
                System.out.println("。");
                ps.println("。");
              }
  		  i++;
        }  
        ps.close();
  	  
  	 Scanner ccc=new Scanner(System.in); 
	     System.out.println("要查询的字："); 
        String s=ccc.next(); 
	     char ddd=s.charAt(0);
	     int a=0;
	     for(int b=0;b<changhenge.length();b++) {
	        if(ddd==chs[b]) {
	         a=a+1;
	        }
	       }
	       System.out.println("该字出现次数："+a);   
  	  } 
  	  catch (Exception e) {
	        e.printStackTrace();
        }
        
       } 

}
