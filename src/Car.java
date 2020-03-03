public class Car {

    String producer;
    String model;
    String registrationNumber;
    Integer yearOfProduction;
    private String plates;


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
}