package test23;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[]args) {
		//Student s = new Student("정꾸기",21);
		//데이터 타입사용가능이므로 ArrayList도 사용가능
		ArrayList<Student> sList = new ArrayList<Student>();
		for(int i = 1;i<=5;i++) {
			String name = "테스트"+i;
			int grade = (int)(Math.random()*10)+1;
			sList.add(new Student(name,grade));
			
		
		}

		for(int i = 0;i<sList.size();i++) {
			for(int j = i+1; j<sList.size();j++) {
				if(sList.get(i).grade<sList.get(j).grade) {
					Student s = sList.get(i);
					sList.set(i, sList.get(j));
					sList.set(j,s);
				}
			}
		}
		for(Student st : sList) {
			System.out.println(st.name+","+st.grade);
		}
		
		/*//Student만 가질 수 있는 Array List임
		sList.add(s);
		sList.add(s);
		sList.add(s);//
		System.out.println(sList.size());
	
		//s.name ="꾸꾸";값을 바꾼것이라 다 바뀌어서 출력!!
		s= new Student("강민우",3);*/
		for(Student st : sList) {//세개가 모두 같은 것을 바라보 고 있기때문에 바꾸면 다바뀜 
			System.out.println(st.name+","+st.grade);
		}					//에스를 바꾼 것이 기 떄문에 쩡꾸기
		
		
	
	}
}
