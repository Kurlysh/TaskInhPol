package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

abstract class Shape {
	private String name;
    abstract public double getArea();
    public Shape(String name) {
    	this.name = name;
    }
    public String getName() {
    	return name;
    }
}
class Circle extends Shape {
	private double radius;
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
    public double getArea() {
    	return Math.PI * radius;
    }
    public double getRadius() {
    	return radius;
    }
}
class Rectangle extends Shape {
	private double height;
	private double width;
	public Rectangle(String name, double height, double width) {
		super(name);
		this.height = height;
		this.width = width;
	}
    public double getArea() {
    	return height * width;
    }
    public double getHeight() {
    	return height;
    }
    public double getWidth() {
    	return width;
    }
}
public class MyUtils {
    public List<Shape> maxAreas(List<Shape> shapes) {
    	List<Shape> newShapes = shapes.stream().collect(Collectors.toList());
    	for (int i = 0; i < newShapes.size(); i++)
    		for (int j = 0; i < newShapes.size(); j++){
    			if(newShapes.get(i) != null) {
    				if(newShapes.get(i).getName().equals("Circle") && newShapes.get(j).getName().equals("Circle"))
					 	if(((Circle)newShapes.get(i)).getArea() > ((Circle)newShapes.get(j)).getArea())
					 		newShapes.remove(j);
					}
    				if(newShapes.get(i).getName().equals("Rectangle") && newShapes.get(j).getName().equals("Rectangle"))
    					if(((Circle)newShapes.get(i)).getArea() > ((Circle)newShapes.get(j)).getArea())
    						newShapes.remove(j);
				}
    	return newShapes;
    }
}

