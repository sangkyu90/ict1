package test15;


import test16.Student;

public class Rabbit {
   
   public String rabbitName;
   public int rank;
   
   public Rabbit(String rabbitName, int rank) {
      this.rabbitName = rabbitName;
      this.rank = rank;
      
   }
   
   public static void sort(Rabbit[] r) {
      for (int i = 0; i < r.length; i++) {

         for (int j = i + 1; j < r.length; j++) {
            if(r[i].rank<r[j].rank) {
               Rabbit rt = r[i];
               r[i] = r[j];
               r[j] = rt;
            }
         }
      }
   }
   
   
   public static void printArr(Rabbit[] r) {
      for(int i = 0; i<r.length;i++) {
         System.out.println(r[i]);
         
      }
            
   }
 

   
   public static void main(String[]args) {
      Rabbit[]r = new Rabbit[10];//Rabbit 배열>>배열을 보내려면 매개변수가 배열이여야함
                           //Rabbit[] r//위에서 담은 것을 솔팅함
      //방만들고 메모리 생성은 안헀으므로 메모리 생성,초기화를 해야함
      
      
      
      
      
      for(int i = 0; i<r.length;i++) {
      
      int rank = (int)(Math.random()*10);
         r[i]= new Rabbit(i+"번째 토끼",rank);//메모리 생성
      }
      sort(r);
      for(int i = 0; i<r.length;i++) {
         System.out.println(r[i].rabbitName);
         System.out.println(r[i].rank);
      }
      
      
               
      
      
      //System.out.println(r[i].rank);
      
      //오름차순 , 내림차순정렬
      //메소드로 만들어서 호출 출력
      
   }
}

