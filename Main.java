public class Main {

    public static void main(String[] args) {
	    doTask();
    }
    static void doTask(){
        Participant[] participants = new Participant[4];
        participants[0] = new Human("Спортсмен", 300, 2);
        participants[1] = new Human("Обычный человек", 100, 1);
        participants[2] = new Robot("Бот", 1000, 5);
        participants[3] = new Cat("Барсик", 200, 3);

        Obstacle[] obstacles = new Obstacle[4];
        obstacles[0] = new RunningTrack("1", 200);
        obstacles[1] = new RunningTrack("2", 150);
        obstacles[2] = new Wall("1", 1);
        obstacles[3] = new Wall("2", 3);

        for (int i = 0; i < participants.length; i++){
            for (int j = 0; j < obstacles.length; j++){
                if (obstacles[j].overcome(participants[i])){
                    System.out.println("Ура! Получилось!");
                } else {
                    System.out.println(String.format("Ой-ой! Не получилось! %s выбывает", participants[i].getName()));
                    break;
                }
            }
        }
    }
}
