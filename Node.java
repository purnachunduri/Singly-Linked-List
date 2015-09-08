
/**
 * Write a description of class Node here.
 * @author (Purna.chunduri)
 * @version (ver 1.0)
 */
public class Node<Purna> {
  // instance variables - replace the example below with your own
  private Node next;
  private Purna value;
  /**
   * Constructor for objects of class Node
   */
  public Node() {
    // initialise instance variables
    next = null;
    value = (Purna) new Object();
  }
   
  public Node(Purna data) {
    this.next = null;
    this.value = data;
  }            
      
  public Node(Purna data, Node next) {
    this.next = next;
    this.value = data;
  }
      
  public Purna getData() {  
    return value;  
  }  
       
  public void setData(Purna data) {
    value = data;
  }
       
  public Node getNext(){
    return next;
  }
        
  public void setNext(Node next) {
    this.next = next;
  }
  
  public String toString() {
    String ant = "" + value;
    return ant;
  }
  
}
