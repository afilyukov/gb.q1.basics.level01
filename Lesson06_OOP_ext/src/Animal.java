public abstract class Animal {
    private int max_run = 0;
    private float max_jump = 0.0f;
    private int max_swim = 0;

    public Animal(){
    }

    public Animal(int max_run, float max_jump, int max_swim){
        this.max_jump = max_jump;
        this.max_run = max_run;
        this.max_swim = max_swim;
    }
    public abstract boolean run(int value);

    public abstract boolean swim(int value);

    public abstract boolean jump(float value);
}
