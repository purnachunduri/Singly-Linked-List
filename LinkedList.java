
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList<Purna>
{
  Node<Purna> slink;
  Node<Purna> link;
  Node<Purna> flink;
  Node<Purna> v;
  int listCount = 0;
  int total = 0;
  LinkedList() {
	listCount = 0;
	slink = null;
	link = null;
  }
	
  void add(Purna p) {
	if (listCount == 0) {
	  slink = new Node<Purna>(p, link);
	  flink = slink;
	  listCount++;
	} else {
	link = null;
	link = new Node<Purna>(p, link);
	slink.setNext(link);
	slink = link;
	}
	total++;
  }
	
  void addBefore(Purna p, Purna r) {
	Node<Purna> temp = null;
	v = flink;
	while(v != null) {
	  if(v.getData() == r) {
		temp = v;
		break;
	  }
	  v = v.getNext();
	}
	v = flink;
	while (v != null) {
      if (v.getNext() == temp) {
		Node<Purna> newOne = new Node<Purna>(p, temp);
		v.setNext(newOne);
		break;
	  }
	  v = v.getNext();
	}
	total++;
  }
	
  void addAfter(Purna p, Purna r){
	Node<Purna> temp = null;
	v = flink;
    while (v!=null) {
      if (v.getData() == r) {
	    temp=v.getNext();
	    Node<Purna> newOne = new Node<Purna>(p, temp);
	    v.setNext(newOne);
	    break;
	  }
	  v=v.getNext();
	}
	total++;
  }
	
  void remove(int i) {
	Node<Purna> temp = null;
	int listCount=0;
	v = flink;
	while (v != null) {
	  listCount++;
	  if (listCount-1 == i) {
		temp = v;
		break;
	  }
	  v=v.getNext();
	}
	v=flink;
	while (v!=null) {
	  if (v.getNext() == temp) {
		v.setNext(temp.getNext());
		temp = null;
		break;
	  }
	  v = v.getNext();
	}
	total--;
  }
	
  void remove(Purna k) {
	int listCount = 0;
	v = flink;
	while (v != null){
	  listCount++;
	  if(v.getData() == k) {
		remove(listCount - 1);
	  }
	  v = v.getNext();
	}
  }
	
  void pushFront(Purna p) {
	Node<Purna> temp = new Node<Purna>(p,flink);
	flink = temp;
	total++;
  }
	
  void pushBack(Purna p){
	Node<Purna> temp = new Node<Purna>(p,null);
	v = flink;
	while (v.getData() != null) {
	  if (v.getNext() == null) {
		v.setNext(temp);
		break;
	  }
	  v = v.getNext();
	}
	total++;
  }
	
  void popFront() {
	flink = flink.getNext();
    remove(0);
  }
	
  void popBack() {
	remove(total - 1);
  }
	
  void addList(Purna p, LinkedList nod) {
	Node<Purna> temp = null;
	v = flink;
	while (v != null) {
	  if (v.getData() == p) {
		temp=v.getNext();
		v.setNext(nod.getFlink());
		break;
	  }
	  v=v.getNext();
	}
	v=nod.getFlink();
	while (v != null) {
	  if (v.getNext() == null) {
		v.setNext(temp);
		break;
      }
	  v=v.getNext();
	}
  }
	
  void addList(int i, LinkedList nod) {
	Node<Purna> temp = null;
	v = flink;
	int test = 0;
	while (v != null) {
	  test++;
	  if (test - 1 == i) {
		temp=v.getNext();
		v.setNext(nod.getFlink());
		break;
	  }
	  v=v.getNext();
	}
	v=nod.getFlink();
	while (v != null) {
	  if (v.getNext() == null) {
		v.setNext(temp);
		break;
	  }
	  v = v.getNext();
	}
  }
	
  Node<Purna> getFlink() {
	return flink;
  }

  public void print() {
	v = flink;
	if (v == null) {
	  System.out.println("List Is Empty");
    } else {
	  while (v != null) {
	    System.out.println(v.getData());
	    v = v.getNext();
	  }
    }
  }

  public void makeEmpty() {
	flink = null;  
  }
  
}
