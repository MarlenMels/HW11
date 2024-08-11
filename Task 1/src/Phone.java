public class Phone {
    String number;
    String model;
    static String countryMadeOf = "China";

    public Phone(){

    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public void recieveCall(String nameCaller, String numberCaller){
        System.out.println("Звонит абонент по имени " + nameCaller + " номер " + numberCaller);
    }
}
