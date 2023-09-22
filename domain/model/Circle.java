package domain.model;

public class Circle extends Shape {
    private int radius=0;
    public int getRadius(){
        return radius;
    }
    public void setradius(int newradius){ 
        if(newradius >= 0){
            radius = newradius;
        }
    }
}
