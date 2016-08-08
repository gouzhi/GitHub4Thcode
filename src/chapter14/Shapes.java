package chapter14;

import java.util.Arrays;
import java.util.List;

abstract class Shape{
	void draw(){System.out.println(this + ".draw()");}
	abstract public String toString();
}

class Circle extends Shape{
	public String toString() {return "Circle";}
}

class Square extends Shape{
	public String toString() {return "Square";}
}

class Triangle extends Shape{
	public String toString() {return "Triangle";}
}

class Rhomboid extends Shape{
	public String toString() {return "Rhomboid";}
}

public class Shapes {
	static void rotate(Shape s){
		if(s instanceof Circle){
			return;
		}
		System.out.println(s + "旋转");
	}
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(
				new Circle(),new Square(),new Triangle());
		for(Shape shape : shapeList){
			shape.draw();
			rotate(shape);
		}
		Shape sr = new Rhomboid();
		if(sr instanceof Rhomboid){
			System.out.println("是Rhomboid类型");
			Rhomboid r = (Rhomboid) sr;
		}else if(sr instanceof Circle){
			System.out.println("是Circle类型");
			Circle c = (Circle) sr;
		}
	}
}
