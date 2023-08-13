public class Cat extends Animal{

    public Cat(){
        super(200f, 2f, 0);
    }

    public Cat(float maxRun, float maxSwim, float maxJump) {
        super(maxRun, maxSwim, maxJump);
    }

    @Override
    public boolean swim(float val) {
        System.out.println("Cats do not want to swim");
        return false;
    }
}
