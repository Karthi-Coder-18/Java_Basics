package arrays_in_java;

public class Rectangle {

    int length; // These variables are members of the current class and also called as field variables.
    int breadth;

    static int data;
    public float getArea() {

        float area = length * breadth;
        return area;
    }

    void rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public float findPerimeter() {

        int p = 2 * (length + breadth);
        return p;
    }

    public int getLength() {
        return length;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        Rectangle.data = data;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
