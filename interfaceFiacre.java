/**
 * interfaceFiacre
 */
public interface interfaceFiacre {

    public void saymyName();
    public void saymyAge();
}
 /**
  * I
  */
 public class d implements interfaceFiacre{
    public void saymyAge(){
        System.out.print("twenty five");

    }
 
    public void saymyName(){
        System.out.println("jolnes");
    }
 }
  class C extends d implements interfaceFiacre{
    public void saymyClass(){
        System.out.println("Level two");
    }
  }