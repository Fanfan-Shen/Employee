package com.liren.sf.test;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		System.out.println("��ӭ����Ա������ϵͳ");
		
		boolean flag=true;
		
		while(flag){
		
		System.out.println("¼��Ա���밴1");
		
		System.out.println("ɾ��Ա���밴2");
		
		System.out.println("����Ա���밴3");
		
		System.out.println("����Ա���밴4");
		
		int userslect=s.nextInt();
		
		switch(userslect){
		
		case 1:     

			boolean falg1=true;
			
			while(falg1){
			
		   System.out.println("�������µ�Ա����");
		     
		   int employeeno=s.nextInt();
		   
		   int index = IndexOfEmployeePosition(list,employeeno);
		   
		   if(index==-1){
		   		
			System.out.println("������Ա������");
			
			String employeename=s.next();
			
			Employee employee=new Employee(employeeno,employeename);
			
		     list.add(employee);
		   }
		 
		   else{
			   
			   System.out.println("�������Ա�����Ѵ���");
			   
		   }
		   
		   
		   
		   System.out.println("�Ƿ����¼�룿�˳���0�����������");
		   
		   int input=s.nextInt();
		   
		   if(input==0){
			   
			   falg1=false;
		   }
		   
			      
			}
			
			break;
			
		case 2:         
			
			System.out.println("��������Ҫɾ����Ա����");
			
			int employeeno2=s.nextInt();
			
			 int index2 = IndexOfEmployeePosition(list,employeeno2);
			
			if(index2!=-1){
				
				list.remove(index2);
				
			}
			else{
				
				System.out.println("�Բ���������ĵ�Ա���Ų�����");
				
			}
			     break;
		
		case 3:          
			
			System.out.println("����������µ�Ա����");
			
			int employee3=s.nextInt();
			
			int index3=IndexOfEmployeePosition(list,employee3);
			
			if(index3!=-1){
				
				Employee updateemployee = list.get(index3);
				
				System.out.println("�������µ�Ա������");
				
				String newname=s.next();
				
				updateemployee.setEmployeename(newname);
				
			}
			else{
				
				System.out.println("�Ա����������Ա���Ų�����");
				
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
		
		System.out.println("�Ƿ��˳�ϵͳ���˳���0�����������");
		
		int userinput=s.nextInt();
		
		if(userinput==0){
			
			flag=false;
			
		}
		
			
		}
		
		
	
			
			
	}
		
		
			    	
		
		

   //�ظ����ֵĴ��루IndexOfEmployeePosition�����������жμ�������û���û������employeeno��
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

