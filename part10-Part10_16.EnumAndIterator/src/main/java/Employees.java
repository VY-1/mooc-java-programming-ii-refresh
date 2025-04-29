import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> employees;
    
    public Employees(){
        this.employees = new ArrayList<>();

    }

    public void add(Person personToAdd){
    
        this.employees.add(personToAdd);
    
    }

    public void add(List<Person> peopleToAdd){
        for(Person person: peopleToAdd){
            add(person);
        }
    }
    //print using iterator
    public void print(){
        Iterator<Person> iterator = this.employees.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }
    public void print(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation().equals(education)){
                System.out.println(nextPerson);
            }
            
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
