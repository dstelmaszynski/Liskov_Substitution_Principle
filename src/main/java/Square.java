public class Square extends Rectangle {

    public Square(int side) {
       super (side, side);
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.height = width;
        this.width = width;
    }
}
