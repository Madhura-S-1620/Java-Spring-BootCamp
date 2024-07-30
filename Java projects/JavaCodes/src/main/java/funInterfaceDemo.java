//package funInterfaceDemo;

@FunctionalInterface
public interface funInterfaceDemo {
    int area(int x,int y);
    default double perimeter(double side){

        return side;
    }
}