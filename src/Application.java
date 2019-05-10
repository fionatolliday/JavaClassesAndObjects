public class Application {

    public static void main(String[] args){
        System.out.println("Hello World");
        Person personOne = new Person("Fiona", new Brain());

        String firstAndLastName = personOne.getName() + " Tolliday";
        personOne.setName(firstAndLastName);
        System.out.println(personOne.writeName());

    }


}
