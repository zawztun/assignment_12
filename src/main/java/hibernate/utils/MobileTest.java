package hibernate.utils;
import hibernate.dao.MobilePhoneDAO;
import hibernate.entity.MobilePhone;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

public class MobileTest {

    MobilePhoneDAO dao;
    Scanner sc = new Scanner(System.in);
    public MobileTest(ApplicationContext ContextfromMain){
        this.dao = (MobilePhoneDAO) ContextfromMain.getBean("mbpDao");
    }

    public  MobilePhone newMobile(){
        System.out.println("Enter id");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter Price");
        Float price = sc.nextFloat();
        System.out.println("Enter Color");
        String color = sc.next();
        MobilePhone mo  = new MobilePhone(id,name,price,color);
        return mo;
    }

    public  void  createMobile(){
        MobilePhone m = newMobile();
        dao.saveMobile(m);
        System.out.println("Added new Mobile" + m.getMfName());

    }
    public  void updateMobile(){
        MobilePhone m = newMobile();
        dao.updateMobile(m);
        System.out.println("Updated new Mobile" + m.getMfName());
    }
    public  void  deleteMobile(){
        System.out.println("Enter id to delete");
        int id = sc.nextInt();
        MobilePhone m = new MobilePhone(id);
        dao.deleteMobile(m);
        System.out.println("Deleted  Mobile" + m.getId());
    }
}
