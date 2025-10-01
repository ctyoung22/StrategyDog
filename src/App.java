public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Greyhound(new Woof(), new Dash());
        Dog d2 = new Chihuahua(new Yip(), new NoRun());
        Dog d3 = new Dachshund(new Yip(), new Hop());

        d1.bark();
        d1.run();

        d2.bark();
        d2.run();

        d3.bark();
        d3.run();
    }
}
