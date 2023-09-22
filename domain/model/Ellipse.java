package domain.model;

public class Ellipse extends Circle{
    private int radius2=0;

    public int getRadius(){
        return radius2;
    }
    public void setradius(int newradius){ 
        if(newradius >= 0){
            radius2 = newradius;
        }
        
    }
}
