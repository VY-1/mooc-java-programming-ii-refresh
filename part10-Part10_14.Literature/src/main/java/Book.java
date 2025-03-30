public class Book{
    private String name;
    private int recAge;

    public Book(String name, int recAge){
        this.name = name;
        this.recAge = recAge;
    }

    public String getName(){
        return this.name;
    }

    public int getRecAge(){
        return this.recAge;
    }

    @Override
    public String toString(){
        return getName() + " (recommended for " + getRecAge() + " year-olds or older)";
    }

    
}
