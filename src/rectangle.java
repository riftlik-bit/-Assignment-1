public class Rectangle {

    private double width;
    private double height;
    private int id;
    private static int idGen = 1;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
        id = idGen++;
    }

    public Rectangle(double width, double height) {
        this(); // call default constructor
        setWidth(width);
        setHeight(height);
    }

   
    public double getWidth() {
        return width;
    }
 
    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

   
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.height = height;
    }

   
    public double area() {
        return width * height;
    }

  
    public double perimeter() {
        return 2 * (width + height);
    }

 
   
    public String toString() {
        return "Rectangle ID: " + id +
               ", width = " + width +
               ", height = " + height;
    }
}
