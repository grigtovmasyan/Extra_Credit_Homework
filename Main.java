public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Rex",true);
        Car car = new Car("BMW", 4);
        Plane plane = new Plane("Boeing 747",420);

        System.out.println(Factorial(4)); // 24
    }
    public static int Factorial(int n){
        if(n == 1)
            return 1;
        return n * Factorial(n-1);
    }
}
