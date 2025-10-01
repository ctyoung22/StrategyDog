public class Woof implements IBark{
    public void bark() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Woof!";
    }
}
