public class Player {
    private String name;   
    private int score;
    private int qRight;  
    private int qWrong; 
    private boolean result;
   public void player(String n, int s, int r, int w){
       String name = n;
       int score = s;
       int qRight = r;
       int qWrong = w;
   }
   public void player(String n, int s){ //overloading constructor
       String name = n;
       int score = s;
   }
   public int getScore(){
       return score;
   }
   public int addScore(){
       score += 1;
       return score;
   }
   public int subtractScore(){
       score -= 1;
       return score;
   }
   public int doubleScore(){
    score *= 2;
    return score;
   }
   public int halfScore(){
    score /= 2;
    return score;
   }
   public int getQright(){
       return qRight;
   }
   public int getQwrong(){
       return qWrong;
   }
   public int addQright(){
       ++qRight;
       return qRight;
   }
   public int addQwrong(){
       ++qWrong;
       return qWrong;
   }
   public boolean result(){
       final int scoreToBeat = 5;
       return (score >= scoreToBeat);
   }
   public static void congrats(){
    System.out.println("Congratulations, you finished the game!");
    }
   //overloading method
   public int subtract(int x, int y){
    return x - y;
   }
   public double subtract(double x, double y){
    return x - y;
   }
   public String toString(){
    return "\nNew Player Created";
   }
}