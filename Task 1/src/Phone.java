public class Phone {
    int number;
    String model;
    static String countryMadeOf = "China";

    public Phone(){

    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public void recieveCall(String nameCaller, int numberCaller){
        System.out.println("Звонит абонент по имени " + nameCaller + " номер " + numberCaller);
    }
}
