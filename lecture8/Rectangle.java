package lecture8;

public class Rectangle {

    // Access modifier
    // public: anybody can access
    // private: only accessible within the class definition
    private int width;
    private int height;
    private int calculatedArea;

    // Constructor
    // parameter list: int width, int height
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.calculatedArea = -1;
    }

    // Overloaded constructor
    Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    public int area() {
        if (calculatedArea == -1) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            calculatedArea = width * height;
        }
        return calculatedArea;
    }

    public int perimeter() {
        return (width + height) * 2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        this.calculatedArea = -1;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        this.calculatedArea = -1;
    }

    public String toString() {
        return "Rectangle (" + width + ", " + height  + ") area=" + area();
    }
}
