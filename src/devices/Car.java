package devices;

public class Car {

    public String producer;
    public String model;
    public String registrationNumber;
    public Integer yearOfProduction;
    private String plates;
    private Integer valueOfCar;


    public String getPlates() {

        return plates;
    }


    public void setPlates(String plates)throws Exception {
        if (plates.length() > 8) {
            throw new Exception();

        } else {
            this.plates = plates;
        }
    }

    public Integer getValueOfCar() {
        return valueOfCar;
    }

    public void setValueOfCar(Integer valueOfCar) {
        this.valueOfCar = valueOfCar;
    }

    public String toString(){

        return this.producer+" "+this.model;
    }
}