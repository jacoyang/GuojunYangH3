//Guojun Yang
//001251603

public class Test
{
  public static void main(String[] args)
  {
    List list = new List();//insert string
    list.insert("a");
    list.insert("b");
    list.insert("c");
    list.forward();
    list.backward();
    list.delete("a");
    list.forward();
    list.delete("a");
    list.backward();
    list.destroy();
    list.forward();
    list.backward();
  }//end main
}//end test