public class Bot extends Player {
    
    @Override
    public void play(){
        System.out.println("Bot playing");
    }
    public void addMove(String move){
        System.out.println("Moving " + move);
    }
}
