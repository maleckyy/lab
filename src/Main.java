public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";


        System.out.printf("s");
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();

        Car car = new Car();
        Car dirtyOne = new Car();

        car.producer = "Volvo";
        car.model = "V40";
        car.registrationNumber = "ojniewiem";
        car.yearOfProduction = 2004;
        car.setValueOfCar(1000);
        //  car.plates = "gdxd";
        dirtyOne.setPlates("haha123");

        me.car = dirtyOne;

        me.car.setValueOfCar(1000);

        String buy=me.buyCar();

        System.out.printf(buy);



        System.out.println(dirtyOne.getPlates());

        Human wife = new Human();
        wife.firstName = "Koksana";
        wife.lastName = "Koksowska";
        wife.car = dirtyOne;

        String carInfo = car.toString();
        System.out.println(carInfo);

        String humanInfo = me.toHej();
        System.out.println(humanInfo);

    }




}
