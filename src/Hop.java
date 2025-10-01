public class Hop implements IRun{
    public void run() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "Hopping";
    }
}
