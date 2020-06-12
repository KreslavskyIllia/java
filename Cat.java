public class Cat implements Participant{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(String.format("Кот %s бежит.", getName()));
    }

    @Override
    public void jump() {
        System.out.println(String.format("Кот %s прыгает", getName()));
    }
}
