package Interface;

public interface RegularPolygon {

    int getNumSides();

    int getSideLength();

    static int total(int a , int b, int c){
        int v =a+b+c;
        System.out.println("total"+v);
        return v;


    }

    default int  getPerimeter(int k , int length){
        int p = k*length;
        System.out.println("perimeter value"+p);
        return p;

    }

    default double getInteriorAngle(int k){
        double q = (k-2)*3.14/k;
        System.out.println("interior angle"+k);
        return q;
    }
    
}

class EquilateralTriangle implements RegularPolygon{

   public int getNumSides(){
        return 3;
    }

    public int getSideLength(){

        
        int y = 8;
        return y;
    }
}

class Square implements RegularPolygon{

    public int getNumSides(){
        return 4;
    }

    public int getSideLength(){
        int z=10;
        return z;
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.getPerimeter(2, 3);
        s.getInteriorAngle(2);
        RegularPolygon.total(1,2,3);
    }
}