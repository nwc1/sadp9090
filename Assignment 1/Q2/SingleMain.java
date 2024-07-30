public class SingleMain{
 public static void main(String[] args){
  Singleton obj1=Singleton.getInstance();
   obj1.requestApi("register");
   obj1.start();

  Singleton obj2=Singleton.getInstance();
   obj2.requestApi("login");
   obj2.start();

  Singleton obj3=Singleton.getInstance();
   obj3.requestApi("home");
   obj3.start();
}
}
