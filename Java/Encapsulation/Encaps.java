package Encapsulation;

public class Encaps {

    private int i;

    String name;


    public int getI(){
        return i;
    }
    public void setI(int i){
        this.i =i;
    }

    public String getName(){
        return name;
    }

    public void setName(String nek){
        name = nek;
    }



   
public static void main(String[] args) {
    Encaps x = new  Encaps();
    x.setI(3);
    x.setName("sindhu");
    System.out.println(x.getI());
    System.out.println(x.getName());
}

    
}
