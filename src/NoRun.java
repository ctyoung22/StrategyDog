public class NoRun implements IRun {
    public void run() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Not running";
    }
}
