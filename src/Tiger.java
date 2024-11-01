public class Tiger extends Animal implements Eat, Walk {

    private int numberOfStripes;
    private int speed;
    private int SoundLevelOfRoar;

    public Tiger() {
        super("Tiger");
    }

    public int getNumberOfStripes() { // Corrected method name
        return this.numberOfStripes;
    }

    public void setNumberOfStripes(int stripes) { // Corrected method name
        this.numberOfStripes = stripes;
    }

    public int getSoundLevel() {
        return SoundLevelOfRoar;
    }

    public void setSoundLevel(int soundLevel) {
        this.SoundLevelOfRoar = soundLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void eatingFood() {
        super.eatingFood();
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed " + speed );
    }

}
