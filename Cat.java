public class Cat extends Animal {

    public Cat(String name){
        super(name);
        System.out.println(String.format("%s - кот", name));
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
        System.out.println(String.format("%s не умеет плавать", name));
    }

    public void setRunDistance(int runDistance){
        if (runDistance <= 200){
            this.runDistance = runDistance;
        }else{
            System.out.println(String.format("Кот не пробежит %s м.", runDistance));
        }
    }

    public void setJumpHeight(double jumpHeight){
        if (jumpHeight <= 2){
            this.jumpHeight = jumpHeight;
        }else{
            System.out.println(String.format("Кот не может подпрыгнуть на %s м.", jumpHeight));
        }
    }
}
