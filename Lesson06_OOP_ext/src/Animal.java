public abstract class Animal {
    protected float maxRun;
    protected float maxSwim;
    protected float maxJump;

    public Animal(float maxRun, float maxJump, float maxSwim){
        this.maxJump = maxRun;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public boolean run(float value){
        return value<=maxRun;
    };

    public boolean swim(float value){
        return value<=maxSwim;
    };
    public boolean jump(float value){
        return value<=maxJump;
    };
}
