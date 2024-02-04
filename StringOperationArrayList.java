import java.util.*;

public class StringOperationArrayList {
    ArrayList<String> al = new ArrayList<String>();
    static Scanner obj = new Scanner(System.in);

    void getDetails() {
        System.out.println("Enter the Number of players:");
        int n = obj.nextInt();
        // add players to the ArrayList System.out.println("Enter the Player one by
        // one:"); for(int i=0;i<n;i++)
        al.add(obj.next());
        System.out.println(al);
    }

    void insert() {
        // insert Player at a specific index
        System.out.println("What is Position of new player is to be inserted:");
        int pos = obj.nextInt();
        System.out.println("Enter the new player name");
        String newPlayerName = obj.next();
        al.add(pos, newPlayerName);
        System.out.println(al);
    }

    void search() {
        // Search the player
        System.out.println("Enter the player to be searched:");
        String search = obj.next();
        String info = al.contains(search) ? "Yes, is found" : "No, is not Found";
        System.out.println("Does list contains Player? " + info);
    }

    void starts() {
        // List the player startswith
        System.out.println("List the player names startswith:");
        String s = obj.next();
        System.out.println("List of Player startswith:" + s);
        for (int i = 0; i < al.size(); i++)
            if (al.get(i).startsWith(s))
                System.out.println(al.get(i));
    }

    void appendAtEnd() {
        // Add Player at the End
        System.out.println("Add the Player name at the end of List:");
        al.add(obj.next());
        System.out.println(al);
    }

    public static void main(String arg[]) {
        StringOperationArrayList soa = new StringOperationArrayList();
        soa.getDetails();
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Append at the End");
            System.out.println("2.Insert at the Particular Index");
            System.out.println("3.Search");
            System.out.println("4.List all the Players startwith given letter");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    soa.appendAtEnd();
                    break;
                case 2:
                    soa.insert();
                    break;
                case 3:
                    soa.search();
                    break;
                case 4:
                    soa.starts();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter the valid choice try it once again:");
            }
            if (choice == 5)
                break;
        }
    }
}
