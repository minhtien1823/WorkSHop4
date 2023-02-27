
package Part1;

import java.util.Objects;


public abstract class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public Rectangle(){       
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return width * length ;
    }
    @Override
    public double getPerimeter(){
        return 2*(width + length);
    }
    @Override
    public boolean equals(Object otherObj){
    
    if(this == otherObj){
        return true;
    }
    
    if(otherObj == null){
        return false;
    }
    
    if(!(this.getClass() == otherObj.getClass())){
        return false;
    }
    Rectangle other = (Rectangle)otherObj;
    return Objects.equals(this.width,other.width)
        && Objects.equals(this.length ,other.length) 
        && Objects.equals(super.filled,other.filled)
        && Objects.equals(super.color ,other.color);
    }
    
}
