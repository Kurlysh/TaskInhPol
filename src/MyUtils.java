import java.util.ArrayList;
import java.util.List;

class Rectang extends Square{
	double height;

	public Rectang(double width, double height) {
		super(width);
		this.height = height;
	}
	
	public double getPerimeter() {
		return width * 2 + height * 2;
	}
}
class Square {
	double width;

	public Square(double width) {
		this.width = width;
	}
	
	public double getPerimeter() {
		return 4 * width;
	}

}
public class MyUtils {
	
    public double sumPerimeter(List<?> firures) {
    	List<?> newFig = new ArrayList<>(firures);
    	double sum = 0;
    		for (int i = 0; i < newFig.size(); i++) {
    			if(newFig.get(i) != null) {
    				if (newFig.get(i).toString().contains("Square"));
    					sum = sum + ((Square) newFig.get(i)).getPerimeter();
    				if (newFig.get(i).toString().contains("Rectang"));
    					sum = sum + ((Rectang) newFig.get(i)).getPerimeter();
    			}
    		}
        return sum;
    }
}
