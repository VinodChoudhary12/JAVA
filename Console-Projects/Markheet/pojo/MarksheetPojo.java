package pojo;
import java.util.Scanner;

 public class MarksheetPojo
{
	private String name,course,father,mother,branch,college;
	private int year,rollno,phy,chemistry,maths,hindi,english,semester,total;
	private double percentage;
	public void setTotal(int total)
	{
		this.total=phy+chemistry+maths+hindi+english;
	}
	public void setPercentage(double persentage)
	{
		this.percentage=this.getTotal()/5;
	}
	public  void setName(String name)
    {
		this.name=name;
    }
	public  void setFather(String father)
    {
		this.father=father;
    }
	public  void setMother(String mother)
    {
		this.mother=mother;
    }
	public  void setCourse(String course)
    {
		this.course=course;
    }
	public  void setBranch(String branch)
    {
		this.branch=branch;
    }  
	public  void setCollege(String college)
    {
		this.college=college;
    }  
	public  void setYear(int year)
    {
		this.year=year;
    }  
	public  void setRollno(int rollno)
    {
		this.rollno=rollno;
    }  
	public  void setPhy(int phy)
    {
		this.phy=phy;
    }
	public  void setChemistry(int chemistry)
    {
		this.chemistry=chemistry;
    }  
	public  void setMaths(int maths)
    {
		this.maths=maths;
    }
	public  void setEnglish(int english)
    {
		this.english=english;
    }
	public  void setHindi(int hindi)
    {
		this.hindi=hindi;
    }
	public  void setSemester(int semester)
    {
		this.semester=semester;
    }
	public String getName()
    {
		return this.name;
    }
    public  String getFather()
    {
      return this.father;
    }
	public  String  getMother()
    {
      return this.mother;
    }
	public  String getCourse()
    {
     return this.course;
    }
	public  String getBranch()
    {
      return this.branch;
    }  
	public  String getCollege()
    {
      return this.college;
    }  
	public  int getYear()
    {
      return this.year;
    }  
	public  int getRollno()
    {
      return this.rollno;
    }  
	public  int getPhy()
    {
       return this.phy;
    }
	public int getChemistry()
    {
      return this.chemistry;
    }  
	public int getMaths()
    {
      return this.maths;
    }
	public int getEnglish()
    {
      return this.english;
    }
	public int getHindi()
    {
      return this.hindi;
    }
	public int getSemester()
    {
      return this.semester;
    }  
	public int getTotal()
	{
		return this.total;
	}
	public double getPercentage()
	{
		return this.percentage;
	}
}