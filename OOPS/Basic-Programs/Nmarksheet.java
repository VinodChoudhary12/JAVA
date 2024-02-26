import java.util.Scanner;
class Test
 {
    public static void main(String args[])
    {
		  Scanner sc=new Scanner(System.in);
		  Student stu[]=new Student[10];
		  
		  
		  System.out.println("Enter how many student data you want to store :");
		  int n=sc.nextInt();
		  int i;
		for(i=0;i<n;i++)
		{
			stu[i]=new Student();
			stu[i].input(stu,i,n);
			
		}
		for(i=0;i<n;i++) 
		{
		   stu[i].display(i,stu,sc);
		}
			System.out.println("YOUR CHOICE ARE :");
		    System.out.println("press 1.search by Marksheet for roll no :");
			System.out.println("press 2.Print by all marksheet          :");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				for(i=0;i<n;i++)
				stu[i].print(i,stu,sc);
						break;
			}
    }
 }	
class Student
{
   private String name,course,father,mother,branch,college;
   private int year,rollno,phy,chemistry,maths,hindi,english,semester;
   public void setData() 
     {
       this.father = father;
       this.name = name;
       this.course = course;
       this.year = year;
       this.rollno = rollno;
       this.branch = branch;
       this.college = college;
       this.phy = phy;
       this.chemistry = chemistry;
       this.maths = maths;
       this.hindi = hindi;
       this.english = english;
     }
	public void roll(int i,Student stu[],Scanner sc)
	{
		boolean z;
		do
		{
			System.out.println("Enter Roll number");
			rollno=sc.nextInt();
			sc.nextLine();
			z = false; //continue....
			for(int j=0; j<i; j++)
			{	
				if(rollno==stu[j].rollno)
				{
					System.out.println("roll number alredy added\n");
					z=true;
				}
			}
		}
		while(z);
	}
    public void input(Student stu[],int i,int n)
    {
		Scanner sc=new Scanner(System.in);
        this.roll(i,stu,sc);	
			System.out.println("Enter Your Course =");
      	this.course =sc.nextLine();  	
		
			System.out.println("Enter Your Sem =");
	    this.semester =sc.nextInt();
			System.out.println("Enter Your year =");
		this.year =sc.nextInt();
			System.out.println("Enter Your Name =");
		this.name =sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Your Father Name =");
		this.father =sc.nextLine();
			System.out.println("Enter Your Mother Name =");
		this.mother =sc.nextLine();
			System.out.println("Enter Your Branch Name =");
		this.branch =sc.nextLine();
			System.out.println("Enter Your Collage name =");
		this.college =sc.nextLine();
		do
		{	
			System.out.println("Enter physics number:   ");
			phy = sc.nextInt(); 
			if(phy<0||phy>100)	
			{
				System.out.println("Invalid mark Of physics..!!\nPleas re enter mark..");
			}
		}while(phy<0||phy>100);
			
	    do{
			System.out.println("Enter chemistry number:   "); 
			chemistry = sc.nextInt();
			if(chemistry<0||chemistry>100)	
			{
				System.out.println("Invalid mark Of chemistry..!!\nPleas re enter mark..");
			}
		}
		while(chemistry<0||chemistry>100);
		
		do
		{
			System.out.println("Enter math number:   ");
			maths = sc.nextInt();
		if(maths<0||maths>100)	
			{
				System.out.println("Invalid mark Of math..!!\nPleas re enter mark..");
			}	
		}while(maths<0||maths>100);
		do{	 
			System.out.println("Enter hindi number:   ");
			hindi = sc.nextInt();
		if(hindi<0||hindi>100)	
			{
				System.out.println("Invalid mark Of Hindi..!!\nPleas re enter mark..");
			}	
		}while (hindi<0||hindi>100);
		
		do{	
			System.out.println("Enter english number:   ");
			english = sc.nextInt();
		if(english<0||english>100)	
			{
				System.out.println("Invalid mark Of English..!!\nPleas re enter mark..");
			}			
		}
		while(english<0||english>100);
		this.setData();
		
	
    }
	public void print(int i,Student stu[],Scanner sc)
	{
		    System.out.println("Enter Roll number");
			rollno=sc.nextInt();
			sc.nextLine();
			for(int j=0; j<=stu.length; j++)
			{	
				if(j==i&&rollno==stu[j].rollno)
				{
					System.out.println(" "+this.display(i,stu,sc));
				}
			}
	}		
    public int display(int i,Student stu[],Scanner sc)
	{
		System.out.println("|-------------------------------------------------------------------------|");
				
				System.out.println("|\t\t\t\t"+college);
				System.out.println("|\tRoll  : "+rollno+"\t\t\t\t\tCourse : "+course+"      ");
				System.out.println("|\tName  : "+this.name+"\t\t\t\t\tBranch : "+branch+"  ");	
				System.out.println("|\tFName : "+father+"\t\t\t\t\tSem  : "+semester+"      ");
				System.out.println("|\tMName : "+mother+"\t\t\t\t\tYear : "+year+"     ");
				System.out.println("|");
				System.out.println("|\tSubCode      SubName       MaxMarks      MinMarks      ObtMark    ");
				System.out.println("|\tBSC101       physics        100            33            "+phy+"       ");
				System.out.println("|\tBSC102       chemestr       100            33            "+chemistry+"       ");
				System.out.println("|\tBSC103       Mathes         100            33            "+maths+"       ");
				System.out.println("|\tBSC104       Hindi          100            33            "+hindi+"       ");
				System.out.println("|\tBSC105       English        100            33            "+english+"       ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
				System.out.println("|\t\t\t\t\t\t\t\t\t  ");
			/*------------------------------------------------------------*/	
			
			if(phy<33&&maths<33&&chemistry<33&&hindi<33&&english<33)
			{ 
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");  /*continue.....*/
				System.out.println("|\tFail in all Subject");
			}

			else if((phy<33&&chemistry<33&&maths<33&&hindi<33)||(phy<33&&maths<33&&hindi<33&&english<33)||(phy<33&&hindi<33&&english<33&&chemistry<33)||(phy<33&&english<33&&chemistry<33&&maths<33)||(chemistry<33&&maths<33&&hindi<33&&english<33))
			{    
	
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL"); 
					

				if(phy<33&&chemistry<33&&maths<33&&hindi<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\thindi");
				
				else if(phy<33&&maths<33&&hindi<33&&english<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
				
				else if(phy<33&&hindi<33&&english<33&&chemistry<33)
					System.out.println("\tFail in four Subject:\n\tphysics\n\tchemistry\n\thindi\n\tEnglish");
				
				else if(phy<33&&english<33&&chemistry<33&&maths<33)
					System.out.println("|\tFail in four Subject:\n\tphysics\n\tchemistry\n\tmath\n\tEnglish");
				
				else if(chemistry<33&&maths<33&&hindi<33&&english<33)
					System.out.println("|\tFail in four Subject:\n\tchemistry\n\tmath\n\thindi\n\tEnglish");
			}

			else if((phy<33&&maths<33&&chemistry<33)||(phy<33&&chemistry<33&&hindi<33)||(phy<33&&maths<33&&hindi<33)||(chemistry<33&&maths<33&&hindi<33)||(phy<33&&chemistry<33&&english<33)||
			(maths<33&&hindi<33&&english<33)||(chemistry<33&&hindi<33&&english<33)||(phy<33&&hindi<33&&english<33)||(english<33 &&maths<33&&chemistry<33)||(phy<33&&maths<33&&english<33))
			{     
				System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
				
				if(phy<33&&maths<33&&chemistry<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tchemistry ");
				
				else if(phy<33&&chemistry<33&&hindi<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\thindi");
					
				else if(phy<33&&maths<33&&hindi<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\thindi ");
					
				else if(chemistry<33&&maths<33&&hindi<33)
						System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\tmath\n|\thindi ");	
						
				else if(phy<33&&chemistry<33&&english<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tchemistry\n|\tenglish ");	
				
				else if(maths<33&&hindi<33&&english<33)
						System.out.println("|\tFail in three Subject:\n|\tmath\n|\thindi\n|\tenglish ");	
				
				else if(chemistry<33&&hindi<33&&english<33)
						System.out.println("|\tFail in three Subject:\n|\tchemistry\n|\thindi\n|\tenglish ");
				
				else if(phy<33&&hindi<33&&english<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\thindi\n|\tenglish ");
				
				else if(english<33 &&maths<33&&chemistry<33)
						System.out.println("|\tFail in three Subject:\n|\tmath\n|\tchemistry\n|\tenglish  ");
					
				else if(phy<33&&maths<33&&english<33)
						System.out.println("|\tFail in three Subject:\n|\tphysics\n|\tmath\n|\tenglish  ");	
				
			}

			else if((phy<33&&maths<33)||(phy<33&&chemistry<33)||(phy<33&&hindi<33)||(phy<33&&english<33)||
			(maths<33&&chemistry<33)||(maths<33&&hindi<33)||(maths<33&&english<33)||(chemistry<33&&hindi<33)||(chemistry<33&&english<33)||(hindi<33&& english<33))
			{
				 System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
				 
				if(phy<33&&maths<33)
					System.out.println("|\tFail in two subject:\n|\tphysics\n|\tmath");
				
				else if(phy<33&&chemistry<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tchemistry");
				
				else if(phy<33&&hindi<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\thindi");
				 
				else if(phy<33&english<33)	
					 System.out.println("|\tFail in two subject:\n|\tphysics\n|\tEnglish");
				 
				else if(maths<33&chemistry<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\tchemistry");
				 
				else if(maths<33&hindi<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\thindi");
				 
				else if(maths<33&english<33)	
					 System.out.println("|\tFail in two subject:\n|\tmath\n|\tenglish");
				 
				else if(chemistry<33&hindi<33)	
					 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tHindi");
				 
				else if(chemistry<33&english<33)	
					 System.out.println("|\tFail in two subject:\n|\tchemistry\n|\tenglish");
				 
				else if(hindi<33&english<33)	
					 System.out.println("|\tFail in two subject:\n|\tHindi\n|\tenglish");
			}


			else if(phy<33||maths<33||chemistry<33||hindi<33|english<33)
			{      System.out.println("|\t\t\t\t\t\tStatus: | SUPPLY");
				if(phy<33)
					System.out.println("|\tFail in one subject\n|\tphysics");
				else if(maths<33)
					System.out.println("|\tFail in one subject\n|\\tmath");
				else if(chemistry<33)
					System.out.println("|\tFail in one subject\n|\tchemistry");
				else if(hindi<33)
					System.out.println("|\tFail in one subject\n|\thindi");
				else if(english<33)
					System.out.println("|\tFail in one subject\n|\tEnglish");
				
			} /*COMPLETE*/

			/*ELSE BLOCK-----   COUNT TOTAL PERSENTAGE*/
			else
			{
			int total = phy+chemistry+maths+hindi+english;
					double per=total/5.0;
					if(phy>=33&&chemistry>=33&&maths>=33&&hindi>=33&&english>33)
					{
						System.out.println("|\t\t\t\t\t\tStatus: | PASS");
					}
					else
					{
						System.out.println("|\t\t\t\t\t\tStatus: | FAIL");
					}  
					System.out.println("|\tTotal mark is:  "+total+"\t\t\t\t\t\t  ");		
					System.out.println("|\tPersentage is:  "+per+"\t\t");
					if(per>=60)
					{
						System.out.println("|\tpass in first Division\t\t\t\t\t\t  ");
					}
					else if(per>=45)
					{
						System.out.println("|\tpass in Second Division\t\t\t\t\t\t  ");
					}
					else if(per>=33)
					{
						System.out.println("|\tpass in Third Division\t\t\t\t\t\t  ");	
					}	
					else
					{
					System.out.println("|\t---- FAIL ----");
					}					
					
					}/*COMPLETE*/

			System.out.println("|-------------------------------------------------------------------------|");
		   		  
        return rollno;
	}
}    
   
