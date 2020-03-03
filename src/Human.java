import devices.Car;
import devices.Phone;

public class Human extends Animal {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;

    private Double salary = 3000.22;

    public Human() {
        super(species:"homo sapiens");
    }


    public void riseSalary() {
        this.salary = 1.2;

    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String buyCar() {
        if (this.salary > car.getValueOfCar()) {
            return "tak masz to";

        } else {
            return "nie";
        }
    }
    public String toHej(){

        return this.firstName+" "+this.lastName;
    }


}

