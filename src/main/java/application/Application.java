package application;

public class Application {
    public static void main(String[] args) {
        Dog corgi = new Dog("black", 3);
        Integer corgiAge = corgi.getAge();
        String corgiColor = corgi.getColor();
        System.out.println("corgi with color: " + corgiColor + ", and " + corgiAge + " years old");
    }
}
