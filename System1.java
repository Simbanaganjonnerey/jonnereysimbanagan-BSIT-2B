import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class System1 {

    /**
     * @param args the command line arguments
     */
    static boolean menu = true;
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        while(menu == true) {
            
            System.out.println(" ");
            System.out.println("INVENTORY SYSTEM!");
            System.out.println(" 1: ENTER");
            System.out.println(" 2: EXIT");
            System.out.println("  ");
            int choice = s.nextInt();
        
            switch(choice) {
                case 1:
                        ArrayList<Item> item = new ArrayList<Item>();
                        
                        System.out.print("How many items you want to enter: ");
                        int n = s.nextInt();
                        for(int i = 0; i < n; i++) {
                            boolean modify = true;
                            while(modify == true) {
                                System.out.println(" ");
                                System.out.println("WANT TO MODIFY?");
                                System.out.println(" 1: AVAILABLE");
                                System.out.println(" 2: UNAVAILABLE");
                                System.out.println(" 3: READ ALL ITEMS");
                                System.out.println(" 4: UPDATE");
                                System.out.println(" 5: VIEW INPUT ITEMS");
                                System.out.println(" 6: MAKE SOFTCOPY");
                                System.out.println(" 7: EXIT");
                            int select = s.nextInt();
                            
                            if(select == 1) {
                                System.out.println("SELECT OPTION!");
                                System.out.println(" 1: Input");
                                System.out.println(" 2: Output");
                                int io = s.nextInt();
                                if(io == 1) {
                                    System.out.println("\nITEM/S " +(1+i));
                                    String name1;
            
                                    System.out.print("Please enter the item: ");
                                    name1 = s.nextLine();
            
                                    String name = s.nextLine();
                                    System.out.print("Condition: ");
                                    String con = s. nextLine();
                                    String avail = "Available";
                                    item.add(new Input(name, con, avail)) ;
                                    System.out.println("\n YOU ENTERED ITEM " + (1+i));
                                    System.out.println(" Item name: " + name) ;
                                    System.out.println(" Condition: " + con);
                                }
                                if(io == 2) {
                                    System.out.println("\nITEM/S " +(1+i));
                                    String name1;
            
                                    System.out.print("Please enter the item: ");
                                    name1 = s.nextLine();
            
                                    String name = s.nextLine();
                                    System.out.print("Condition: ");
                                    String con = s. nextLine();
                                    String avail = "Available";
                                    item.add(new Output(name, con, avail)) ;
                                    System.out.println("\n YOU ENTERED ITEM " + (1+i));
                                    System.out.println(" Item name: " + name) ;
                                    System.out.println(" Condition: " + con);
                                }
                                
                        }
                            if(select == 2) {
                                System.out.println("SELECT OPTION!");
                                System.out.println(" 1: Input");
                                System.out.println(" 2: Output");
                                int io = s.nextInt();
                                if(io == 1) {
                                    System.out.println("\nITEM/S " +(1+i));
                                    String name1;
            
                                    System.out.print("Please enter the item: ");
                                    name1 = s.nextLine();
            
                                    String name = s.nextLine();
                                    System.out.print("Condition: ");
                                    String con = s. nextLine();
                                    String avail = "Unavailable";
                                    item.add(new Output(name, con, avail)) ;
                                    System.out.println("\n YOU ENTERED ITEM " + (1+i));
                                    System.out.println(" Item name: " + name) ;
                                    System.out.println(" Condition: " + con);
                                }
                                if(io == 2) {
                                    System.out.println("\nITEM/S " +(1+i));
                                    String name1;
            
                                    System.out.print("Please enter the item: ");
                                    name1 = s.nextLine();
            
                                    String name = s.nextLine();
                                    System.out.print("Condition: ");
                                    String con = s. nextLine();
                                    String avail = "Unavailable";
                                    item.add(new Output(name, con, avail)) ;
                                    System.out.println("\n YOU ENTERED ITEM " + (1+i));
                                    System.out.println(" Item name: " + name) ;
                                    System.out.println(" Condition: " + con);
                                }
                            }
                            if(select == 3) {
                                System.out.println("\n");
                                System.out.println("\n ALL ITEM LIST IN ARRAY");
                                for (int a = 0; a < item.size(); a++) {
                                item.get(a).showInfo();
                                }
                            }
                            if(select == 4) {
                                System.out.println("SELECT OPTION!");
                                System.out.println(" 1: Input");
                                System.out.println(" 2: Output");
                                int io = s.nextInt();
                                if(io == 1) {
                                    System.out.println("\nITEM/S " +(1+i));
                                    String name1;
            
                                    System.out.print("Please enter the item: ");
                                    name1 = s.nextLine();
            
                                    String name = s.nextLine();
                                    System.out.print("Condition: ");
                                    String con = s. nextLine();
                                    System.out.print("Availability: ");
                                    String avail = s.next();
                                    System.out.print("In what array: ");
                                    int array = s.nextInt();
                                    item.set(array, new Input(name, con, avail)) ;
                                    System.out.println("\n YOU ENTERED ITEM " + (1+i));
                                    System.out.println(" Item name: " + name) ;
                                    System.out.println(" Condition: " + con);
                                    System.out.println(" Availability : " + avail);
                                }
                                if(io == 2) {
                                    System.out.println("\nITEM/S " +(1+i));
                                    String name1;
            
                                    System.out.print("Please enter the item: ");
                                    name1 = s.nextLine();
            
                                    String name = s.nextLine();
                                    System.out.print("Condition: ");
                                    String con = s. nextLine();
                                    System.out.print("Availability: ");
                                    String avail = s.next();
                                    System.out.print("In what array: ");
                                    int array = s.nextInt();
                                    item.set(array, new Output(name, con, avail)) ;
                                    System.out.println("\n YOU ENTERED ITEM " + (1+i));
                                    System.out.println(" Item name: " + name) ;
                                    System.out.println(" Condition: " + con);
                                    System.out.println(" Availability : " + avail);
                                }
                            }
                            if(select == 5) {
                                System.out.println("Input/Output");
                                int io = s.nextInt();
                                if(io == 1) {
                                    for(int o = 0; o < item.size(); o++) {
                                        item.get(o).getInput();
                                    }
                                }
                                if(io == 2) {
                                    for(int o = 0; o < item.size(); o++) {
                                        item.get(o).getOutput();
                                    }
                                }
                                
                            }
                            if(select == 6) {
                                System.out.print("Directory pathname: ");
                                String p = s.next();
                                try {
                                File file = new File(p);
        
                                if(!file.exists()) {
				file.createNewFile();	
                                
                                }
		
                                PrintWriter pw = new PrintWriter(file);
                                pw.println("this is my file content");
                                pw.println(item);
                                pw.close();
                                System.out.println("Done making softcopy");
                                } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                                }
                            }
                            if(select == 7) {
                                System.exit(0);
                            }
                        }
            }

            case 2:
            System.exit(0);
            }
        }
    }
}
