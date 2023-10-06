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
    public int getSide2 (){
        return SideSize2;
    }
    public void setSide2( int newSide2){ 
        if(newSide2 >= 0){
            SideSize2 = newSide2;
        }
    }
    public int getSide3 (){
        return SideSize3;
    }
    public void setSide3( int newSide3){ 
        if(newSide3 >= 0){
            SideSize3 = newSide3;
        }
    }

    @Override
    public int getArea(){
        return (getSide1()*getSide2())/2;
    }
    @Override
    public int getPerimeter(){
        return getSide1()+getSide2()+getSide3(); 
    }
    
}

