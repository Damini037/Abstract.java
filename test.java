abstract class Shape{
	protected double side;
	protected double area;
	protected double perimeter;
	
	public Shape(double side){
		this.side = side;
		}
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	
	public void display(){
		System.out.println("Side: "+side);
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+perimeter);
		
		}
}
class Triangle extends Shape{
	private double height;
	
	public Triangle(double side,double height){
		super(side);
		this.height = height;
		}
	public void calculateArea(){
		area = 0.5*side*height;
		}
    public void calculatePerimeter(){
		perimeter=3*side;
		}		
		
}

class Rectangle extends Shape{
	private double length;
	
	public Rectangle(double side,double length){
		super(side);
		this.length = length;
		}
	public void calculateArea(){
		area = side*length;
		}
    public void calculatePerimeter(){
		perimeter=2*(side+length);
		}		
		
}

class Circle extends Shape{
    public Circle(double side){
    super(side);
 }
	public void calculateArea(){
		area = Math.PI*side*side;
		}
    public void calculatePerimeter(){
		perimeter=2*Math.PI*side;
		}		
		
}
class Cube extends Shape{
	public Cube(double side){
		super(side);
		}
	public void calculateArea(){
		area = 6*side*side;
		}
    public void calculatePerimeter(){
		perimeter=12*side;
		}		
		
}

class Square extends Shape{
	public Square(double side){
		super(side);
		}
	public void calculateArea(){
		area =side*side;
		}
    public void calculatePerimeter(){
		perimeter=4*side;
		}		
		
}

public class Test{
	public static void main(String[] args){
		Shape[] shapes =new Shape[5];
		shapes[0]=new Triangle(5,7);
		shapes[1]=new Rectangle(4,8);
		shapes[2]=new Circle(6);
		shapes[3]=new Cube(3);
		shapes[4]=new Square(2.5);
		
		for(Shape shape : shapes){
			shape.calculateArea();
			shape.calculatePerimeter();
			shape.display();
			System.out.println();
			
			}
		}
}

