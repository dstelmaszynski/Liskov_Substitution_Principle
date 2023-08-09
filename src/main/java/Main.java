public class Main {
    public static void main (String[] args){

        Rectangle rectangle = new Square(5);
        System.out.println("result, (expected 5*5 = 25): " + rectangle.area());

        rectangle.setHeight(10);
        System.out.println("result, (expected 10*10 = 100): " + rectangle.area());

        rectangle.setHeight(7);
        rectangle.setWidth(2);
        System.out.println("result, (expected 7*2 = ?): " + rectangle.area());

    }
}
