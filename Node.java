//Guojun Yang
//001251603

public class Node
{
  private Node previous;
  private Node next;
  private String value;
  
  public void setPrevious(Node n)//set previous
  {
    previous = n;
  }
  
  public void setNext(Node m)//set next
  {
    next = m;
  }
  
  public void setValue(String z)//set value
  {
    value = z;
  }
  
  public Node getPrevious()//get previous
  {
    return previous;
  }
  
  public Node getNext()//get next
  {
    return next;
  }
  
  public String getValue()//get value
  {
    return value;
  }  
}//end Node