package a;

import java.util.ArrayList;


public class test {
	public static void main(String[]args) {
	 ArrayList<Student> sList = new ArrayList<Student>();
	 
	 for(int i = 0; i<=5;i++) {
		 String name = "test"+i;	
		 int grade = (int)(Math.random()*10)+1;
		 sList.add(new Student(name, grade));
	 }
	 
	 for(int i = 0; i<sList.size();i++) {
		 for(int j = i+1; j<sList.size();j++) {
			 if(sList.get(i).grade<sList.get(j).grade) {
				 Student s = sList.get(i);
				 sList.set(i,sList.get(j));
				 sList.set(j, s);
			 }
		 }
	 }
	 for(Student st : sList) {
		 System.out.println(st.name+","+st.grade);
	 }
	}
}


