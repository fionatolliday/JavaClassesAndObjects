public class Application {

    public static void main(String[] args){
        Person personOne = new Person("Constructor is running", "Fiona");

        System.out.println("Hello World");
        System.out.println(personOne.output);
        System.out.println(personOne.writeName());
        String firstAndLastName = personOne.getName() + " Tolliday";
        personOne.setName(firstAndLastName);
        System.out.println(personOne.writeName());
    }


}
