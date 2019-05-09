public class Person {

    String output;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Person(String output, String name){
        this.output = output;
        this.name = name;
    }

    public String writeName(){
        return "My name is " + name;
    }

}
