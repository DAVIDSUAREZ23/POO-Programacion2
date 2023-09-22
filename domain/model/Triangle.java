package domain.model;

public class Triangle extends Shape {
    private int SideSize1 = 0;
    private int SideSize2 = 0; 
    private int SideSize3 = 0;

    public int getSide1 (){
        return SideSize1;
    }
    public void setSide1( int newSide1){ 
        if(newSide1 >= 0){
            SideSize1 = newSide1;
        }
    
}    
}

