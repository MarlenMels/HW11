public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("18406", "Pro Max");
        Phone samsung = new Phone();
        samsung.number = "34234";
        samsung.model = "Ultra";

        System.out.println("The phone number " + iPhone.number + " and model " + iPhone.model);
        System.out.println("The phone number " + samsung.number + " and model " + samsung.model);

        iPhone.recieveCall("Marlen", "87083111247");
        samsung.recieveCall("", "870831113");
    }
}
