package com.liren.sf.test;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		System.out.println("欢迎来到员工管理系统");
		
		boolean flag=true;
		
		while(flag){
		
		System.out.println("录入员工请按1");
		
		System.out.println("删除员工请按2");
		
		System.out.println("更新员工请按3");
		
		System.out.println("查找员工请按4");
		
		int userslect=s.nextInt();
		
		switch(userslect){
		
		case 1:     

			boolean falg1=true;
			
			while(falg1){
			
		   System.out.println("请输入新的员工号");
		     
		   int employeeno=s.nextInt();
		   
		   int index = IndexOfEmployeePosition(list,employeeno);
		   
		   if(index==-1){
		   		
			System.out.println("请输入员工姓名");
			
			String employeename=s.next();
			
			Employee employee=new Employee(employeeno,employeename);
			
		     list.add(employee);
		   }
		 
		   else{
			   
			   System.out.println("您输入的员工号已存在");
			   
		   }
		   
		   
		   
		   System.out.println("是否继续录入？退出按0，任意键继续");
		   
		   int input=s.nextInt();
		   
		   if(input==0){
			   
			   falg1=false;
		   }
		   
			      
			}
			
			break;
			
		case 2:         
			
			System.out.println("请输入您要删除的员工号");
			
			int employeeno2=s.nextInt();
			
			 int index2 = IndexOfEmployeePosition(list,employeeno2);
			
			if(index2!=-1){
				
				list.remove(index2);
				
			}
			else{
				
				System.out.println("对不起，您输入的的员工号不存在");
				
			}
			     break;
		
		case 3:          
			
			System.out.println("输入您想更新的员工号");
			
			int employee3=s.nextInt();
			
			int index3=IndexOfEmployeePosition(list,employee3);
			
			if(index3!=-1){
				
				Employee updateemployee = list.get(index3);
				
				System.out.println("请输入新的员工姓名");
				
				String newname=s.next();
				
				updateemployee.setEmployeename(newname);
				
			}
			else{
				
				System.out.println("对比起，您输入的员工号不存在");
				
			}
			
			
			     break;
		
		case 4:               
			
			
			for(Employee e:list ){
				
				System.out.println("--------------");
				
				System.out.println(e.getEmployeeno()+":"+e.getEmployeename());
				
				System.out.println("-------------");
				
				
				
				
			}
			
			
			
			     break;
			     
	}
		
		System.out.println("是否退出系统？退出按0，任意键继续");
		
		int userinput=s.nextInt();
		
		if(userinput==0){
			
			flag=false;
			
		}
		
			
		}
		
		
	
			
			
	}
		
		
			    	
		
		

   //重复部分的代码（IndexOfEmployeePosition方法，用来判段集合里有没有用户输入的employeeno）
	public static int IndexOfEmployeePosition(ArrayList<Employee> list, int employeeno) {
		// TODO Auto-generated method stub
		  
        int index=-1;
         
        for(int i=0;i<list.size();i++){
     	   
     	Employee employee=list.get(i);
     	   
     	if(employee.getEmployeeno()==employeeno){
     		
     		index =i;
     		
     		break;
     	}
     	   
	}
        
        return index;
	
	}	
	
}

