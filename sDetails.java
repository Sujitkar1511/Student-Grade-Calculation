import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Em
{
	private  String StudentId;
	private String Studentname;
	private int Roll;
	public void Input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("	..........................................");
		System.out.print("\u001B[38;5;198m"+"		      Enter the Student Name:");
		Studentname=sc.nextLine();
		System.out.print("\u001B[38;5;93m"+"	   	      Enter the Student Id:");
		StudentId=sc.nextLine();
		System.out.print( "\u001B[31m"+"	             Enter the Student Roll No:");
		Roll=sc.nextInt();
		System.out.println("	..........................................");
	}
	public void Displaydetails()
	{
		System.out.println("	     .................................");
		System.out.println("\u001B[38;2;0;153;68m"+"\n		    Student Name:"+Studentname+"\n   	 	    Student Id:"+StudentId+"\n   		    Student Roll:"+Roll+"\u001B[0m");
		System.out.println("	     .................................");
	}
}
class Subjectlist extends Em
{
	protected double Ben,Eng,Math,Phy,Che,Bio;
	public void Inputsub()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("\u001B[32m"+"\n            .........Subject Number.........");
		//Bengali
		System.out.print("\u001B[38;5;201m"+"\n		Enter the Bangali Number:");
		Ben=in.nextDouble();
		System.out.print("		Enter the Englis Number:");
		Eng=in.nextDouble();
		System.out.print("		Enter the Math Number:");
		Math=in.nextDouble();
		System.out.print("		Enter the physics Number:");
		Phy=in.nextDouble();
		System.out.print("	...........................................");
	}
	public void Marksshow()
	{
		System.out.println("\u001B[31m"+"\n		.......Subject Marks.......");
		System.out.println("\u001B[38;5;208m"+"  		 Bengali:"+Ben+" "+"  English:"+Eng+"\u001B[38;5;198m"+"\n"+"    	 	Mathamatic:"+Math+"  Physics:"+Phy+"\u001B[32m"+"\n  		 Chemistry:"+Che+"   Biology:"+Bio);	
		System.out.println("	     ..................................");
	}
	
}
class Marks extends Subjectlist
{
	private double Avg,Total;
	private String Gread;
	public int f=0;
	public void Calculation()
	{
		
		Total=(Ben+Eng+Math+Phy+Che+Bio);
		Avg=(Total/6.0);
		if(Avg>90 && Avg<=100)
		{
			Gread="AA";
		}
		else if(Avg>80 && Avg<=90)
		{
			Gread="A+";
		}
		else if(Avg>70 && Avg<=80)
		{
			Gread="A";
		}
		else if(Avg>60 && Avg<=70)
		{
			Gread="B+";
		}
		else if(Avg>50 && Avg<=60)
		{
			Gread="B";
		}
		else if(Avg>40 && Avg<=50)
		{
			Gread="C+";
		}
		else if(Avg>25 && Avg<=40)
		{
			Gread="C";
		}
		else
		{
			f=1;
			Gread="D";
		
		}
		
	}
	public void Result()
	{
		
		System.out.println("\u001B[31m"+"  		Total Marks:"+Total+"\n 		Avarage:"+Avg+"%"+"\n   	 	 Gread:"+Gread);
	}
}
public class sDetails {
	public static void main(String[] args) 
	{
	    List<Marks>list=new ArrayList<Marks>();
	    List<Integer>list1=new ArrayList<Integer>();
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("\u001B[31m"+"		.......How many students?......"); 
	    System.out.print("\u001B[34m"+"		 → ");
	    n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	     Marks m1=new Marks();
	     System.out.println("\n        ..........................................");
		  System.out.println("\u001B[38;5;208m"+"	   	      No."+(i+1)+" Student Enter Your Details");
		 // m1.Input();
		 m1.Inputsub();
		  m1.Calculation();
		  list1.add(m1.f);
		  list.add(m1);
	    }
	    System.out.println("\n    		.....Student Details..... ");
	    for(int i=0;i<n;i++)
	    {
	    	Marks m2=new Marks();
	    	if(list1.get(i)==0)
	    	{
	    	 m2=list.get(i);
	    	 System.out.println("		  No."+(i+1)+" Student Details");
	    	 m2.Displaydetails();
	    	 m2.Marksshow();
	    	 m2.Result();
	    	}
	    	else
	    	{
	    		System.out.println("\n	    	  No."+(i+1)+" Student Details");
	    		System.out.println("     		  Better Luck Next Time");
	    		System.out.println("      	  	       Thank You");
	    		
	    	}
	    }
		 
	}
	

}
