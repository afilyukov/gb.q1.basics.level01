public class Cat extends Animal{
    private int max_run = 200;
    private float max_jump = 2.0f;
    private int max_swim = -1;

    public Cat(){
        super();
    }

    public Cat(int max_run, float max_jump, int max_swim) {
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
        return false;
    }

    @Override
    public boolean jump(float value) {
        return value<=max_jump;
    }
}
