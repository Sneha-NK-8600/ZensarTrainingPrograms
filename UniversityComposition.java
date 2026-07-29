package JavaCompotions;

import java.util.*;

class Courses
{
	String cName;
	int credits;
	
	Courses(String cName,int credits)	
	{
		this.cName=cName;
		this.credits=credits;
	}
	
	void showCourses()
	{
		System.out.println("COURSES : "+cName+" | "+" CREDITS : "+credits);
	}
}

class Professors
{
	List<Courses> courses;
	
	String pName;
	
	Professors(String pName)
	{
		this.pName=pName;
		courses=new ArrayList();
		
	}
	
	void addCourse(Courses c)
	{
		courses.add(c);
	}
	
	void showProfessor()
	{
		System.out.println("PROFESSOR : "+pName);
		for(Courses crs:courses)
		{
			crs.showCourses();
		}
	}
}

class Department
{
	List<Professors> prof;
	
	String dName;
	
	Department(String dName)
	{
		this.dName=dName;
		prof=new ArrayList();
	}
	
	void addProfessor(Professors p)
	{
		prof.add(p);
	}
	
	void showDepartment() 
	{
		System.out.println("DEPARTMENT : "+dName);
		for(Professors pro:prof)
		{
			pro.showProfessor();
		}
	}
}

class University
{
	
	List<Department> dept;
	
	String uName;
	
	University(String uName)
	{
		this.uName=uName;
		dept=new ArrayList();
	}
	
	void addDepartment(Department d)
	{
		dept.add(d);
	}
	
	void showUniversity()
	{
		System.out.println("UNIVERSITY : "+uName);
	for(Department dd:dept)
	{
		dd.showDepartment();
	}
  }
}

public class UniversityComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		// Create the  objects of courses class
		
		Courses java=new Courses("Java Programming",4);
		Courses dbms=new Courses("Database System",3);
		Courses ai=new Courses("Artificial Intelligence",5);
		Courses ml=new Courses("Machine Learning",4);
		Courses ds=new Courses("Data Science",3);
		Courses phy=new Courses("Physics",2);
		Courses chem=new Courses("Chemistry",2);
		
		
		// create the objects of Professors class and assign courses
		
		Professors prof1=new Professors("Dr. Sharma");
		prof1.addCourse(java);
		prof1.addCourse(ds);
		Professors prof2=new Professors("Dr. Mehta");
		prof2.addCourse(chem);
		prof2.addCourse(ai);
		prof2.addCourse(dbms);
		Professors prof3=new Professors("Dr. Gupta");
		prof3.addCourse(ml);
		prof3.addCourse(phy);
		
		//create the objects of Department class and assign the professors
		
		Department cs=new Department("Computer Science");
		cs.addProfessor(prof1);
		cs.addProfessor(prof3);
		Department aids=new Department("Artificial Intelligence & Data Science");
		aids.addProfessor(prof2);
		Department entc=new Department("Electronics and Telecommunication");
		aids.addProfessor(prof1);
		entc.addProfessor(new Professors("Dr. Verma"));
		
		//create the objects of University class and assign the Departments
		
		University sppu=new University("Pune University");
		sppu.addDepartment(cs);
		sppu.addDepartment(entc);
		University shivaji=new University("Shivaji University");
		shivaji.addDepartment(aids);
		University solapur=new University("Solapur University");
		solapur.addDepartment(cs);
		
		sppu.showUniversity();
		
		
	}

}
