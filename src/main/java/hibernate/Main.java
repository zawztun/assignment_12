package hibernate;

import hibernate.utils.MobileTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mobilePhone_bean.xml");
        Scanner sc = new Scanner(System.in);
        System.out.println("mobilePhone bean is ready");
        MobileTest t = new MobileTest(context);
        while (true) {
            System.out.println("Enter \n 1:Add New Mobile \n 2:Update Mobile \n 3:Delete Mobile");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    t.createMobile();
                    break;
                case 2:
                    t.updateMobile();
                    break;
                case 3:
                    t.deleteMobile();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}