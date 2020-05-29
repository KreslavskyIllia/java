public class Dog extends Animal {

    public Dog(String name){
        super(name);
        System.out.println(String.format("%s - собака", name));
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void jump() {
        super.jump();
    }

    @Override
    public void swim() {
        System.out.println(String.format("%s проплыл %s м.", name, swimDistance));
    }

    public void setRunDistance(int runDistance){
        if (runDistance <= 500){
            this.runDistance = runDistance;
        }else{
            System.out.println(String.format("Собака не пробежит %s м.", runDistance));
        }
    }

    public void setJumpHeight(double jumpHeight){
        if (jumpHeight <= 0.5){
            this.jumpHeight = jumpHeight;
        }else{
            System.out.println(String.format("Собака не может подпрыгнуть на %s м.", jumpHeight));
        }
    }

    public void setSwimDistance(int swimDistance){
        if (swimDistance <= 10){
            this.swimDistance = swimDistance;
        }else{
            System.out.println(String.format("Собака не проплывет %s м.", swimDistance));
        }
    }
}
