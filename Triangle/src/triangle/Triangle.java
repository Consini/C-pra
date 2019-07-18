package triangle;
//import java.util.Date;
class SimpleGeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
 
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
 
    public SimpleGeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
 
    public String getColor(){
        return color;
    }
 
    public void setColor(String color){
        this.color = color;
    }
 
    public boolean isFilled(){
        return filled;
    }
 
    public void setFilled(boolean filled){
        this.filled = filled;
    }
 
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
 
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled; 
    }
}
 
class Triangle extends SimpleGeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
 
    public Triangle(){
        super();
        side1 = side2 = side3 = 1.0;
    }
 
    public Triangle(double side1, double side2, double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
 
    public double getSide1(){
        return side1;
    }
 
    public double getSide2(){
        return side2;
    }
 
    public double getSide3(){
        return side3;
    }
 
    public double getArea(){
        double p = (side1 + side2+ side3) / 2;
        return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
    }
 
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
 
    @Override
    public String toString(){
        return "created on " + super.getDateCreated() + "\ncolor: " + super.getColor() + "\nfilled: " + super.isFilled()
                + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
    }
    
    public static void main(String[] args) {    
Triangle triangle = new Triangle(8,1,2);
GeomertircObjact.setcolor("bull");
System.out.println("面积： " + triangle.getArea() +
        "周长： " + triangle.getPerimeter());
//System.out.println("三边： " + triangle.getside1()+" "+
//        triangle.getside2() + " "+ triangle.getside3());
//System.out.println("是否填充颜色 " + triangle.isFilled()
//        +" 颜色为： "+ triangle.getcolor());
//System.out.println("创建日期： " + triangle.getDataCreated());
    
    }    
}
