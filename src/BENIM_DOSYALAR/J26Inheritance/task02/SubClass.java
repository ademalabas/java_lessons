package BENIM_DOSYALAR.J26Inheritance.task02;
public class SubClass extends SuperClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.my_method();
    }
    int num =10;
public void my_method(){
    goster();// sub class call
    super.goster();// super class call
    System.out.println("Super  class num ;" +num);
    System.out.println("Super  class num ;" +super.num);
}
    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur.");
    }

  //  @Override
  //  public void goster() {
  //      System.out.println("Bu method Sub classsın görüntülenme methodudur.");
  //  }





}
