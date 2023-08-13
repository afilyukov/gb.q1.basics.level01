public class Dog extends Animal {
    private int max_run = 500;
    private float max_jump = 0.5f;
    private int max_swim = 10;

    public Dog(){
        super();
    }

    public Dog(int max_run, float max_jump, int max_swim) {
        this.max_run = max_run;
        this.max_jump = max_jump;
        this.max_swim = max_swim;
    }

    @Override
    public boolean run(int value) {
        return value<=max_run;
    }

    @Override
    public boolean swim(int value) {
        return value <= max_swim;
    }

    @Override
    public boolean jump(float value) {
        return value<=max_jump;
    }


}
