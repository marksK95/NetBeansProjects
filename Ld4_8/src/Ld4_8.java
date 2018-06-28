import java.util.Scanner;
import java.util.Stack;
 
class Node {
    int data;
    Node left, right;
 
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
 
public class Ld4_8 {
    public static Node root;
    private static Scanner sc;
    public Ld4_8() {
        Ld4_8.root = null;
    }
 
    private int countLeftNodes(Node node){
        int c = 0;
        if (node != null){
            c = 1 + countLeftNodes(node.left);
            countLeftNodes(node.right);
        }
 
        return c;
    }
   public int countHundred(Node root){
       if(root==null)
           return 0;
       int n = countHundred(root.left)+countHundred(root.right);
       if(root.data<=100&&root.data>=-100)
           return n+1;
       else
           return n;
   }
 
    public void IzvadePostorder() {
          if( root == null ) return;  
           
             Stack<Node> s = new Stack<Node>( );  
             Node current = root;  
           
             while( true ) {  
           
                 if( current != null ) {  
                     if( current.right != null )  
                      s.push( current.right );  
                     s.push( current );  
                     current = current.left;  
                     continue;  
               }  
           
                 if( s.isEmpty( ) )  
                  return;  
                 current = s.pop( );  
           
                 if( current.right != null && ! s.isEmpty( ) && current.right == s.peek( ) ) {  
                     s.pop( );  
                     s.push( current );  
                     current = current.right;  
                 } else {  
                     System.out.print( current.data + " " );  
                     current = null;  
                 }  
             }  
         }  
 
    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }
 
    public static void main(String arg[]) {
        Ld4_8 b = new Ld4_8();
        sc = new Scanner(System.in);
        System.out.println("BINĀRAIS MEKLĒŠANAS KOKS 8.variants");
        System.out.println("Marks Kabalskis RDBI0 151RDB520");
        boolean izveidots = false;
        boolean running = true;
        int choice = 0;
        int add;
        while (running) {
            if (!izveidots) {
                System.out.println("Izvedojiet koku, pievienojot pirmo elementu (sakni):");
                try {
                    add = sc.nextInt();
                    b.insert(add);
                    izveidots = true;
                } catch (Exception e) {
                    System.out.println("Kļūda: jāievada Integer tipa vērtība");
                    break;
                }
            }
            if (izveidots) {
                System.out.println("Izvēlieties darbību:");
                System.out.println("1) pievienot elementu;");
                System.out.println("2) izvadīt virsotnes(postorderāli);");
                System.out.println("3) cik kokā ir virsotnes, kurām ir viens kreisais bērns;");
                System.out.println("4) atrast to elementu skaitu, kuru vērtības pieder intervālam [-100; 100];");
                System.out.println("0) iziet no programmas");
 
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Kļūda: jāievada Integer tipa vērtība");
                }
                switch (choice) {
 
                case 1:
                    System.out.println("Vērtība, kuru vēlaties pievienot: ");
                    int vertiba = 0;
                    try {
                        vertiba = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Kļūda: jāievada Integer tipa vērtība");
                    }
                    b.insert(vertiba);
                    break;
 
                case 2:
                    System.out.println("Virsotnes:");
                    System.out.println();
                    b.IzvadePostorder();
                    System.out.println();
                    System.out.println();
                    break;
 
                case 3:
                    System.out.println();
                    System.out.println("Kreiso bērnu skaits: " + b.countLeftNodes(root));
                    System.out.println();
                    break;
 
                case 4:
                    System.out.println();
                    System.out.println("Intervāls [-100;100]: " + b.countHundred(root));
                    System.out.println();
                    break;
 
                case 0:
                    running = false;
                    System.out.println("Visu labu!");
                    break;
 
                default:
                    break;
                }
            }
        }
    }
}