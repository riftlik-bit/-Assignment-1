public class Rectangle {

    // Fields
    private double width;
    private double height;
    private int id;
    private static int idGen = 1;

    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
        this.id = idGen++;
    }
    public Rectangle(double width,double height){
        this();
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }


    public void setHeight(double height) {
        if(height < 0.0) {
            throw new IllegalArgumentException("height < 0");
        }
        else {
            this.height = height;}
    }


    public void setWidth(double width) {
        if(width < 0.0) {
            throw new IllegalArgumentException("height < 0");
        }
        else {
            this.width = width;}
    }
    public double area() {
        return width*height;
    }
    public double perimeter() {
        return 2*(width+height);
    }


    public String toString() {
        return "id= " + id + " " +  width+"*"+height;
    }
}