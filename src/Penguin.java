public class Penguin extends Animal implements Walk,Swim,Eat {
    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    public Penguin(){
        super("Penguin");
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public double getSwimSpeed() {
        return Math.round(swimSpeed * 1000.0) / 1000.0; // Rounds to 3 decimal places
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = Math.round(swimSpeed);
    }

    public double getWalkSpeed() {
        return Math.round(walkSpeed * 1000.0) / 1000.0; // Rounds to 3 decimal places
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = Math.round(walkSpeed);
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + (int) getWalkSpeed() + " mph");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed " + (int)getSwimSpeed() + " nautical miles per hour");
    }


}


