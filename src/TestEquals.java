

class X{
    int data;

   
    public boolean equals(Object obj){
      if (obj instanceof X){
        if (this.data ==  ((X)obj).data){
            return true;
        }else{
            return false;
        }
      }else{
         return false; 
      }
    }
}

public class TestEquals {
       public static void main(String[] args) {
        X x1 = new X();
        X x2 = new X();
        
       // Student std = new Student();
        
        x1.data = 100;
        x2.data = 200;
        System.out.println(x1.equals(x2));
        //System.out.println(x1.equals(std));
    }
}
