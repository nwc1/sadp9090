public class Singleton implements Runnable {
  private static Singleton instance =new Singleton();
  private String path;
  private Thread t;

  private Singleton(){}

 public static Singleton getInstance(){
   return instance;
}

 public void requestApi(String path)
{
  this.path=path;
}

public void start()
{
 
 System.out.println("path request "+path);
 if(t == null){
  t=new Thread(this,path);
 t.start();
}
}

@Override
 public void run(){
  System.out.println("running");
}
}
