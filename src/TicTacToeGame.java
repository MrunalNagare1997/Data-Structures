import java.util.Scanner;
public class TicTacToeGame {
    Scanner sc= new Scanner(System.in);

    private char playGround[][];
    private int placesRemaining,player;
    private short markPlace;

    public TicTacToeGame()
    {
        placesRemaining=9;
        player=1;
        playGround=new char[][]{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        markPlace= 0;
    }

    public void printplayGround()
    {
        int count1 = 1;

        for(int i=0;i<3;i++) {
            int count2 = 1;

            for (int j = 0; j < 3; j++) {


                if (count2 == 3)
                    System.out.print(" " + playGround[i][j]);
                else {
                    System.out.print(" " + playGround[i][j] + "|");

                }
                count2++;

            }
            System.out.println();
            if (count1 == 3)
                System.out.println("\n");
            else{
                System.out.println("---------");

            }
            count1++;

        }
    }


    public boolean checkWinner()
    {


        //Diagonal check....
        if((playGround[0][0]==playGround[1][1]) && (playGround[1][1]==playGround[2][2]) && playGround[0][0]!=' ')
        {
            String status="1st condition true...";
            if(playGround[0][0]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }


        //Diagonal check.....
        else if(playGround[0][2]==playGround[1][1] && playGround[2][0]==playGround[1][1]&& playGround[0][2]!=' ') {
            String status = "2st condition true...";
            if (playGround[0][2] == 'X') {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            } else {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }
        //3
        else if(playGround[0][0]==playGround[0][1] && playGround[0][1]==playGround[0][2] && playGround[0][0]!=' ')
        {
            if(playGround[0][0]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }

        //4
        else if(playGround[1][0]==playGround[1][1] && playGround[1][2]==playGround[1][1]&& playGround[1][0]!=' ')
        {
            if(playGround[1][0]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }

        //5
        else if(playGround[2][0]==playGround[2][1] && playGround[2][2]==playGround[2][1] && playGround[2][0]!=' ')
        {
            if(playGround[2][0]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }


        //6
        else if(playGround[0][0]==playGround[1][0] && playGround[2][0]==playGround[1][0] && playGround[0][0]!=' ')
        {
            if(playGround[0][0]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }

        //7
        else if(playGround[0][1]==playGround[1][1] && playGround[2][1]==playGround[1][1] && playGround[0][1]!=' ')
        {
            if(playGround[0][1]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }

        //8
        else if(playGround[0][2]==playGround[1][2] && playGround[2][2]==playGround[1][2] && playGround[0][2]!=' ')
        {
            if(playGround[0][2]=='X')
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 1 Win***********");
                return true;
            }
            else
            {
                printplayGround();
                System.out.println("Game Over \n***********Player 2 Win***********");
                return true;
            }
        }

        else
            return false;


    }


    public void start()
    {


        printplayGround();

        if(player==1)
        {
            boolean marked = false;
            do {

                System.out.println("player 1's turn......\nPlease select the plavce to mark...");
                markPlace = sc.nextShort();


                switch (markPlace) {
                    case 1:
                        if (playGround[0][0] == ' ') {
                            playGround[0][0] = 'X';
                            marked = false;
                            placesRemaining--;
                            player = 2;
                            }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 2:
                        if (playGround[0][1] == ' ') {
                            playGround[0][1] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 3:
                        if (playGround[0][2] == ' ') {
                            playGround[0][2] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 4:
                        if (playGround[1][0] == ' ') {
                            playGround[1][0] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 5:
                        if (playGround[1][1] == ' ') {
                            playGround[1][1] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 6:
                        if (playGround[1][2] == ' ') {
                            playGround[1][2] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 7:
                        if (playGround[2][0] == ' ') {
                            playGround[2][0] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 8:
                        if (playGround[2][1] == ' ') {
                            playGround[2][1] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 9:
                        if (playGround[2][2] == ' ') {
                            playGround[2][2] = 'X';
                            marked=false;
                            placesRemaining--;
                            player=2;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    default:
                        System.out.println("Please select valid place to mark....");



                }
            }while (marked== true);

        }
        else
        {
            boolean marked = false;
            do {

                System.out.println("player 2's turn......\nPlease select the plavce to mark...");
                markPlace = sc.nextShort();


                switch (markPlace) {
                    case 1:
                        if (playGround[0][0] == ' ') {
                            playGround[0][0] = 'O';
                            marked = false;
                            placesRemaining--;
                            player = 1;
                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 2:
                        if (playGround[0][1] == ' ') {
                            playGround[0][1] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 3:
                        if (playGround[0][2] == ' ') {
                            playGround[0][2] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 4:
                        if (playGround[1][0] == ' ') {
                            playGround[1][0] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 5:
                        if (playGround[1][1] == ' ') {
                            playGround[1][1] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 6:
                        if (playGround[1][2] == ' ') {
                            playGround[1][2] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 7:
                        if (playGround[2][0] == ' ') {
                            playGround[2][0] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 8:
                        if (playGround[2][1] == ' ') {
                            playGround[2][1] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    case 9:
                        if (playGround[2][2] == ' ') {
                            playGround[2][2] = 'O';
                            marked=false;
                            placesRemaining--;
                            player=1;

                        }
                        else {
                            System.out.println("Place already marked...");
                            marked = true;
                        }
                        break;
                    default:
                        System.out.println("Please select valid place to mark....");



                }
            }while (marked== true);
        }

        if(placesRemaining!=0)
        {
            System.out.println(placesRemaining);
            boolean wins=false;

            //as minimum 5 places must be filled to declare a winner
            //until 5 positions are not marked winner check must not be run.
            if(placesRemaining <=4)
            wins = checkWinner();

            if(wins== true)
                return;
            else{
                start();
            }
        }
        else
        {
            printplayGround();
            System.out.println("Game over\nThanks for playing");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        char startGame='n';
        TicTacToeGame game1=new TicTacToeGame();
        //Instructions....
        System.out.println("*****************INSTRUCTIONS*******************\n" +
                "\n1. Use numbers to specify the place where you want to mark your mark"+
                "\n 1  2  3\n 4  5  6\n 7  8  9"+
                "\n\n2. First player will use the 'X' mark & second player will use 'O' "+
                "\n\n START ?\ny/n");
        startGame=sc.next().charAt(0);

        if(startGame=='y')
        game1.start();
        else
            System.exit(0);
    }
}

