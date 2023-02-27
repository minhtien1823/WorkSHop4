
package Part1;

import java.util.Objects;

public abstract class Cirlce extends Shape {
    
    private double radius;
    
    public Cirlce(){       
    }

    public Cirlce(double radius) {
        this.radius = radius;
    }

    public Cirlce(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14 * radius *radius;
    }
    @Override
    public double getPerimeter(){
        return 2* 3.14 * radius ;
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
    
    Cirlce other = (Cirlce)otherObj;
    return Objects.equals(this.radius,other.radius )
            && Objects.equals(super.color ,other.color) && Objects.equals(super.filled, other.filled);
    
    }
    @Override
    public String toString(){
    return  "[Shape: Circle" + ", radius " + this.radius 
            + ", color " + super.color + ", filled " + super.filled + ", area value "
            + getArea() + ", perimeter value " + getPerimeter();
    }
}
