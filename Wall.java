public class Wall extends Obstacle{
    private int height;

    public Wall(String name, int height){
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        System.out.println(String.format("%s прыгает через стену %s высотой %s м.", participant.getName(), getName(), height));
        if (getHeight() <= participant.getJumpHeight()){
            System.out.println("Успешно перепрыгнул");
            return true;
        } else {
            System.out.println("Не смог перепрыгнуть");
            return false;
        }
    }

}
