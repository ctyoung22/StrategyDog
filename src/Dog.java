public abstract class Dog {
    IBark barkBehavior;
    IRun runBehavior;

    public Dog(IBark barkBehavior, IRun runBehavior) {
        this.barkBehavior = barkBehavior;
        this.runBehavior = runBehavior;
    }

    public void bark() {
        barkBehavior.bark();
    }

    public void run() {
        runBehavior.run();
    }

    public void setBark(IBark newBark) {
        this.barkBehavior = newBark;
    }

    public void setRun(IRun newRun) {
        this.runBehavior = newRun;
    }
}
