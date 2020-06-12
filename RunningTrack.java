public class RunningTrack extends Obstacle{
    private int length;

    public RunningTrack(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        System.out.println(String.format("%s бежит по беговой дорожке %s: %s м.", participant.getName(), getName(), length));
        if (getLength() <= participant.getRunDistance()){
            System.out.println("Успешно пробежал");
            return true;
        } else {
            System.out.println("Не добежал до конца");
            return false;
        }
    }
}

