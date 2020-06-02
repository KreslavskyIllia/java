public class Main {

    public static void main(String[] args) {

	    Cat []catArr = new Cat[4];
	    catArr[0] = new Cat ("Barsik", 10);
	    catArr[1] = new Cat ("Murzik", 15);
	    catArr[2] = new Cat ("Gav", 5);
	    catArr[3] = new Cat ("Murka", 7);

	    Plate plate = new Plate(30);
	    plate.info();
	    for(int i = 0; i < catArr.length; i++){
	    	catArr[i].eat(plate);
			plate.info();
		}

	    plate.addFood(20);
	    plate.info();
	    catArr[3].eat(plate);
	    plate.info();
    }
}
