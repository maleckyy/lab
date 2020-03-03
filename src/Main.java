public class Main {

    public static void main(String[] args) {

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
        car.plates = "gdxd";
        dirtyOne.plates = "haha";

        me.car = dirtyOne;


        System.out.println(dirtyOne.plates);


    }
}
