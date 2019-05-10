public class Person {



    String output;
    private String name;
    private Brain brain;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Person(String name, Brain brain){
        this.name = name;
        this.brain = brain;
    }

    public String writeName(){
        return "My name is " + name;
    }

}
