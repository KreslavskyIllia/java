public abstract class Animal {

    protected String name;
    protected int runDistance;
    protected double jumpHeight;
    protected int swimDistance;

    public Animal(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(String.format("%s пробежал %s м.", name, runDistance));
    }

    public void jump(){
        System.out.println(String.format("%s подпрыгнул на %s м.", name, jumpHeight));
    }

    public abstract void swim();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
