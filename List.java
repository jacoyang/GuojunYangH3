//Guojun Yang
//001251603

public class List
{
  private Node head;
  private Node tail;
  
  public Node find(String match)//find the String
  {
    Node current = head;
    while(current != null)
    {
      if(match.equals(current.getValue()))
        return current;
      else
        current = current.getNext();
    }
    return null;
  }//end find
  
  public void insert(String alpha)
  {
    Node guest = new Node();
    guest.setValue(alpha);
    if(head == null && tail == null)//add the first Node in the list
    {
      head = guest;
      tail = guest;
    }
    else
    {
      Node current = head;
      while(current != null)
      {
        if(alpha.compareTo(current.getValue()) < 0)//find the right place to insert
        {
          if(current.getPrevious() == null)
          {
            head = guest;
            current.setPrevious(guest);
            guest.setNext(current);//insert to the beginning
            return;
          }
          else
          {
            Node previous = current.getPrevious();
            previous.setNext(guest);
            guest.setPrevious(previous);
            guest.setNext(current);
            current.setPrevious(guest);//insert to the middle
            return;
          }
        }
        else
          current = current.getNext();
      }
      tail.setNext(guest); 
      guest.setPrevious(tail);
      tail = guest;//insert to the end 
    }
  }//end insert
  
  public void forward()//print the links in forward
  {
    Node current = head;
    System.out.print("head -> ");
    while(current != null)
    {
      System.out.print(current.getValue() + " -> ");
      current = current.getNext();
    }
    System.out.print("tail\n");
  }//end forward
  
  public void backward()//print the links in backward
  {
    Node current = tail;
    System.out.print("tail <- ");
    while(current != null)
    {
      System.out.print(current.getValue() + " <- ");
      current = current.getPrevious();
    }
    System.out.print("head\n");
  }//end backward
  
  public boolean delete(String match) // delete one of String
  {
    Node d = this.find(match);
    if(d == null)
      return false;
    Node previous = d.getPrevious();
    Node next = d.getNext();
    if(previous != null)
      previous.setNext(next);
    else
      head = next;
    if(next != null)
      next.setPrevious(previous);
    else
      tail = previous;
    d.setPrevious(null);
    d.setNext(null);
    return true;
  }//end delete
 
  
  public void destroy()
  {
    while(head != null)
    {
      this.delete(head.getValue());
    }//destroy all the String
  }
}//end list
        
      