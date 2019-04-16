
public class Day2{
    public static void main(String[] args){
        People pp = new People();
        pp.setName("seirM");
        System.out.println("name is" +" " + pp.getName());
        pp.setHeight(1.88);
        System.out.println("height is"+" " + pp.getHeight());
        pp.setSex("man");
        System.out.println("sex" +" " + pp.getSex());
        pp.setAge(19);
        System.out.println("age is" +" " + pp.getAge());
        System.out.println("action is" +" " + pp.action("hello"));
        System.out.println("add is" +" " + pp.add(888, 666));
        System.out.print("rename is" + " " + pp.rename("job") );

    }
}
 class People{
     private double height;
     private String name;
     private int    age;
     private String sex;
     public double getHeight(){
         return height;
     }
     public void setHeight(double height){
         this.height = height;
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public int getAge(){
         return age;
     }
     public void setAge(int age){
         this.age = age;
     }
     public String getSex(){
         return sex;
     }
     public void setSex(String sex){
         this.sex = sex;
     }
     public String action(String action){
         return action;
     }
     public int add(int a,int b){
         return a+b;
     }
     public String rename(String name){
         return name;
     }

 }
