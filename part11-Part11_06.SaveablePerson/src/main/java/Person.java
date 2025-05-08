public class Person implements Saveable{
    private String name;
    private String address;

    public void save(){
        System.out.println("Save");
    }
    public void delete(){
        System.out.println("delete");
    }
    public void load(String address){
        System.out.println("Loading " + address);
    }
}
