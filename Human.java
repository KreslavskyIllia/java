public class Human implements Participant{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s бежит", getName()));
    }

    @Override
    public void jump() {
        System.out.println(String.format("%s прыгает", getName()));
    }
}
