/**
 * 抽象类
 * 抽象：模糊、不具体
 */
/**
 * 雇员示例
 * 需求：公司中程序员有姓名、工号、薪水、工作内容
 * 项目经理除了姓名、工号、薪水、还有奖金、工作内容，
 * 对给出的需求进行数据建模
 */

 // 描述雇员
 abstract class Employee{
     private String name;
     private String id;
     private double pay;
     Employee(String name, String id, double pay){
         this.name=name;
         this.id=id;
         this.pay=pay;
     }
     public abstract void work();
 }
 // 描述程序员
 class Programer extends Employee{
     Programer(String name,String id,double pay){
         // super()
         super(name,id,pay);
     }
     public void work(){
         System.out.println("code......");
     }
 }
 // 描述经理
 class Manager extends Employee{
     private int bonus;
    Manager(String name,String id,double pay,int bonus){
         // super()
         super(name,id,pay);
         this.bonus=bonus;
     }
     public void work(){
         System.out.println("manager");
     }
 }

class AbstractTest {
    public static void main(String[] args){
       
    }
}
