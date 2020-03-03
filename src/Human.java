public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;

    private Double salary = 3000.22;


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
}