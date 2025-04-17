import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    System.out.println("PLEASE ENTER FULL NAME:");
    String in = scanner.nextLine();

    System.out.println("PLEASE ENTER THE DATE YOU WILL BE COMING (MM/DD/YYYY):");
    String date = scanner.nextLine();

    System.out.println("HOW MANY TICKETS WOULD YOU LIKE?:");
    int tickets = Integer.parseInt(scanner.nextLine());


    if (tickets > 1) {
        System.out.println(tickets + " " + "Tickets reserved for" + " " + date + " " + "Under," + " " + in + "\nEnjoy,");
    } else {
        System.out.println(tickets + " " + "Ticket reserved for" + " " + date + " " + "Under," + " " + in + "\nEnjoy,");
    }



    }
}