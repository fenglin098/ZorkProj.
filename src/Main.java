import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room room = new Room();
        String[][] roomName = new String[4][5];
        Room room1 = new Room(new ArrayList<>(Arrays.asList("dead scorpion")),"  #1",new ArrayList<>(Arrays.asList("N")));
        Room room2 = new Room(new ArrayList<>(Arrays.asList("piano")),"  #2",new ArrayList<>(Arrays.asList("N","W","E")));
        Room room3 = new Room(new ArrayList<>(Arrays.asList("spiders")),"  #3",new ArrayList<>(Arrays.asList("E","N")));
        Room room4 = new Room(new ArrayList<>(Arrays.asList("bats")),"  #4",new ArrayList<>(Arrays.asList("N","W")));
        Room room5 = new Room(new ArrayList<>(Arrays.asList("dust","empty box")),"  #5",new ArrayList<>(Arrays.asList("S")));
        Room room6 = new Room(new ArrayList<>(Arrays.asList("3 walking skeletons")),"  #6",new ArrayList<>(Arrays.asList("E")));
        Room room7 = new Room(new ArrayList<>(Arrays.asList("treasure chest")),"  #7",new ArrayList<>(Arrays.asList("W","S")));
        Room room8 = new Room(new ArrayList<>(Arrays.asList("piles of gold")),"  #8",new ArrayList<>(Arrays.asList("W")));

//        System.out.print("You are in "+room1.getName()+". The room contains "+room1.getItems()+" . You can travel "+room1.getDirection());
//        System.out.println("Which direction would you like to travel to?");
//        String userInput = sc.next();
//        room.userDirection(userInput);
        roomName [1][1]=room1.getName();
        roomName [1][2]=room2.getName();
        roomName [2][2]=room6.getName();
        roomName [0][2]=room3.getName();
        roomName [2][1]=room5.getName();
        roomName [3][1]=room4.getName();
        roomName [3][2]=room7.getName();
        roomName [1][3]=room8.getName();

        for (int r=0; r<roomName.length; r++){
            for (int c=0; c<roomName[r].length; c++) {
                System.out.print(roomName[r][c]+"\t");
            }System.out.println();
        }




        }
}
