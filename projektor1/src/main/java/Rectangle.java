public class Rectangle {
    private float lenght = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
    }

    public Rectangle(float lenght, float width){
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }
    public void setLenght(float lenght){
        this.lenght = lenght;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "lenght=" + lenght +
                ", width=" + width +
                ']';
    }

    public double getArea(){
        return lenght*width;
    }

    public double getPerimeter() {
        return 2 * lenght + 2 * width;
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(lenght,2) + Math.pow(width,2));
    }

    public String isSquare(){
        if(lenght == width){
            return "Ten prostokąt jest kwadratem";
        }
        else{
            return "Ten protokąt nie jest kwadratem";
        }
    }
}