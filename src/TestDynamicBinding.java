

class A{
    
    public String toString(){
        return "A";
    }
}


class B extends A{
    
    public String toString(){
        return "B";
    }
}

public class TestDynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        
        System.err.println(a);
        
        
    }
}
