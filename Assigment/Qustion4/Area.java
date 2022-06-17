package Day10.Assigment.Qustion4;

public class Area extends Shape{
    @Override
    public int rectangleArea(int length, int breadth) {
        int area=length*breadth;
        return area;
    }

    @Override
    public int squareArea(int side) {
        int are=side*side;
        return are;
    }

    @Override
    public double circleArea(int radius) {
        double area=Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        Shape area=new Area();
        int rectangleArea=area.rectangleArea(7,5);
        System.out.println("rectangleArea: "+rectangleArea);
        int squareArea=area.squareArea(12);
        System.out.println("int squareArea: "+squareArea);
        double circleArea=area.circleArea(12);
        System.out.println("circleArea: "+circleArea);
    }
}
