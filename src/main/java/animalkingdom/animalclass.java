package animalkingdom;

public class animalclass {
    private String name,sound;

    public animalclass(String name,String sound) {
        this.name = name;
        this.sound = sound;
    }



    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    //getter method
    public String getName(){
        return this.name;
}
//setter method
public void setName(String name){
        this.name = name;
}
    @Override//tostring method
    public String toString() {
        return "animalclass{" +
                "name='" + name + '\'' +
                ", sound="+ sound + '\''+
                '}';
    }
public void makeNoise(animalclass animal){
        if(animal instanceof Dog ){
            System.out.println();

    }else{
    }
    }

}









