import java.util.Scanner;

public class Test {
    private static ActorsAndActresses actorsAndActresses=new ActorsAndActresses();
    private static Scanner scanner=new Scanner(System.in);
    public static void print_menu(){
        String menu="1.Show the list. \n" +
                "2.Add actor/actress.\n" +
                "3.Edit actor/actress.\n" +
                "4.Remove actor/actress. \n" +
                "5.Search actor/actress.\n" +
                "6.Quit";
        System.out.println(menu);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the actor/actress app!");
        System.out.println("---------------------------------");
        print_menu();
        int operation;
        boolean quit=false;
        while (!quit){
            operation=scanner.nextInt();
            scanner.nextLine();
            if (operation==1){
                actorsAndActresses.print_actors();
            }
            else if (operation==2){
                System.out.println("Please enter new actor/actress' name :");
                String name=scanner.nextLine();
                actorsAndActresses.add_actor(name);
            }
            else if (operation==3){
                System.out.println("Please enter the position of the actor/actress' position which you would like to edit :");
                int position=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter the new name :");
                String name=scanner.nextLine();
                actorsAndActresses.edit_actor(position,name);
            }
            else if (operation==4){
                System.out.println("Please enter the position of the actor/actress' position which you would like to remove :");
                int position=scanner.nextInt();
                actorsAndActresses.remove_Actor(position);
            }
            else if (operation==5){
                System.out.println("Please enter actor/actress' name which you would like to search :");
                String name=scanner.nextLine();
                actorsAndActresses.search_Actor(name);
            }
            else if (operation==6){
                System.out.println("Bye bye!");
                quit=true;
            }
            else {
                System.out.println("Wrong choice! Quiting from the app!");
                quit=true;
            }
        }

    }
}
