
class XYZ{
    public String toString(){
        return "A";
    }
}


class ABC extends XYZ{


}

public class TestBinding {
    public static void main(String[] args) {
        ABC a = new ABC();
        
        //System.out.println(a.toString("A"));
    }
    
}
