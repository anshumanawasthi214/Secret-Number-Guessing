import java.util.*;

class Game{
    int Random_number;//This will be randomly Generated number
    int NoOfGuesses=5;//This will be the number of Guesses
    int Inputnumber;//This will be the number inputed by User
    int lb=0;//This is the lower Bound 
    int ub=100;//This is the upper Bound
    Game(){
        Random rand= new Random();
        this.Random_number=rand.nextInt(ub);
    }
    int takeuserInput(){
        System.out.format("Pick a number between %d and %d ! You will get %d turns.",lb,ub,NoOfGuesses);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        Inputnumber=sc.nextInt();
        System.out.println("Player guesses: "+Inputnumber);
        return Inputnumber;
    }
    boolean isCorrectNumber(){
        NoOfGuesses--;
        if(NoOfGuesses==0){
            System.out.println("Sorry out of chances......");
            System.out.println("Better luck next time......");
            return true;
        }
        else if(Inputnumber==Random_number){
            System.out.println("YOU WIN! The secret number was "+Random_number);
            return true;
        }
        else if(Inputnumber<Random_number){
            System.out.println("Sorry this is too low.......");
           
            lb=Inputnumber+1;
        }
        else if(Inputnumber>Random_number){
            System.out.println("Sorry this is too high.......");
           
            ub=Inputnumber-1;
        }
        return false;
    }
}

public class SecretGame {
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeuserInput();
            b=g.isCorrectNumber();
        }
    }
}
