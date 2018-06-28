/*Java Program to Implement Queue using Linked List*/
    import java.util.*;
     
    /*  Class Node  */
    class Node{
        protected int data;
        protected Node link;
 
        /*  Constructor  */
        public Node(){
            link = null;
            data = 0;
        }    
 
        /*  Constructor  */
        public Node(int d,Node n){
            data = d;
            link = n;
        }    
 
        /*  Function to set link to next Node  */
        public void setLink(Node n){
            link = n;
        }    
 
        /*  Function to set data to current Node  */
        public void setData(int d){
            data = d;
        }    
 
        /*  Function to get link to next node  */
        public Node getLink(){
            return link;
        }    
 
        /*  Function to get data from current Node  */
        public int getData(){
            return data;
        }
    }
 
    /*  Class linkedQueue  */
    class linkedQueue{
        protected Node front, rear;
        public int size;
     
        /* Constructor */
        public linkedQueue(){
            front = null;
            rear = null;
            size = 0;
        }    
 
        /*  Function to check if queue is empty */
        public boolean isEmpty(){
            return front == null;
        }    
 
        /*  Function to get the size of the queue */
        public int getSize(){
            return size;
        }    
 
        /*  Function to insert an element to the queue */
        public void insert(int data){
            Node nptr = new Node(data, null);
            if (rear == null){
                front = nptr;
                rear = nptr;
            }
            else{
                rear.setLink(nptr);
                rear = rear.getLink();
            }
            size++ ;
        }    
 
        /*  Function to remove front element from the queue */
        public int remove(){
            if (isEmpty() )
                throw new NoSuchElementException("Underflow Exception");
            Node ptr = front;
            front = ptr.getLink();        
            if (front == null)
                rear = null;
            size-- ;        
            return ptr.getData();
        }    
 
        /*  Function to check the front element of the queue */
        public int peek(){
            if (isEmpty() )
                throw new NoSuchElementException("Underflow Exception");
            return front.getData();
        }    
 
        /*  Function to display the status of the queue */
        public void display(){
            System.out.print("\nQueue = ");
            if (size == 0){
                System.out.print("Empty\n");
                return ;
            }
            Node ptr = front;
            while (ptr != rear.getLink() ){
                System.out.print(ptr.getData()+" ");
                ptr = ptr.getLink();
            }
            System.out.println();
           
        }
 public void getSk()
       
        {
          int sk=0;
          Node ptr = front;
         
                do
                {
                  if (ptr.getData()>-100 && ptr.getData()<100) {
                   sk++;
                  }
                  ptr = ptr.getLink();
                 
                }
                while (ptr != null);
                System.out.println(sk);
            }
    }
 
    /*  Class LinkedQueueImplement  */
    public class Ld3_8{    
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
 
            /* Creating object of class linkedQueue */  
            linkedQueue lq = new linkedQueue();            
 
            /* Perform Queue Operations */    
            System.out.println("Marks Kabalskis RDBI0 151RDB520");
            char ch;        
            do{
                System.out.println("Saistita forma attelotas rindas Operacijas");
                System.out.println("1. ievietot");
                System.out.println("2. iznemt");
                System.out.println("3. lielakais elements");
                System.out.println("4. parbaudit vai ir tukss");
                System.out.println("5. izmers");
                System.out.println("6. atrast to elementu skaitu, kuru vertibas pieder intervalam [-100; 100].");
                int choice = scan.nextInt();
               
                switch (choice){
                case 1 :
                    System.out.println("Ievadiet integer elementu");
                    lq.insert( scan.nextInt() );
                    break;                        
                case 2 :
                    try{
                        System.out.println("Iznemtais elements = "+ lq.remove());
                    }
                    catch (Exception e){
                        System.out.println("Error : " + e.getMessage());
                    }    
                    break;                        
                case 3 :
                    try{
                        System.out.println("Lielakais Elements = "+ lq.peek());
                    }
                    catch (Exception e){
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;                        
                case 4 :
                    System.out.println("Vai ir tukss = "+ lq.isEmpty());
                    break;
                case 5 :
                    System.out.println("Izmers = "+ lq.getSize());
                    break;
                case 6 :
                    System.out.println("elementu skaits = ");
                    lq.getSk();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
                }                
 
                /* display queue */        
                lq.display();
                System.out.println("\nVai velies turpinat? ( y vai n) \n");
                ch = scan.next().charAt(0);            
            } while (ch == 'Y'|| ch == 'y');
            scan.close();
        }
    }
