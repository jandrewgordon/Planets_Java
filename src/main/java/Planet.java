public class Planet {

    private String name;
    private int size;

    public Planet(String name, int size){
        this.name = name;
        this.size = 908973;

    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String explode() {
        String message = "Boom! "+this.name+" has exploded";
        return message;
    }






}
