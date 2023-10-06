package domain.model;

public class Rect extends Square{
    private int height=0;

    /*@Override es una notacion */
    @Override 
    public int getHeight(){
        return height;
    }

    @Override 
    public void setHeight(int newHeight){
        if (newHeight >=0)
        height = newHeight;
    }

    /*@Override
    public int getArea(){
        return getWidth()*getHeight();
    }

    @Override 
    public int getPerimeter(){
        return 2*(getWidth()+getHeight());
    }
    */

    public Rect(int newX, int newY, int newWidth, int newHeight){
        super(newX, newY, newWidth);
        setHeight(newHeight);
    }

    public Rect(int newWidth, int newHeight){
        this(0, 0, newWidth, newHeight);
    }
}
