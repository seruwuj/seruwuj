import java.util.Scanner;

public class SecondChallenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]names = new String[10];

        for(int i=0;i<10;i++){
            System.out.println("Enter name "+ (i+1)+":");
            names[i]=input.nextLine();
        }
        System.out.println("The names entered are:");
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("CONGRATULATIONS!!WELCOME TO MY JAVA CLASS!");
    }
}