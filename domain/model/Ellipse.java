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

    public Ellipse(int newX, int newY, int newRadius, int newRadius2){
        super(newX, newY, newRadius);
        setradius(newRadius2);
    }

    public Ellipse(int newRadius, int newRadius2){
        this(0, 0, newRadius, newRadius2);
    }
}
