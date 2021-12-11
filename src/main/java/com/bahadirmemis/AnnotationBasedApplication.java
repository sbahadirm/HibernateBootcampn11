package com.bahadirmemis;

import com.bahadirmemis.dao.UrunDao;
import com.bahadirmemis.entity.Urun;
import com.bahadirmemis.entityservice.UrunEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public class AnnotationBasedApplication {

    @Autowired
    UrunEntityService urunEntityService;

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext
//                ("applicationcontext/annotation-based-config.xml");

        ApplicationContext context = getApplicationContext();

        UrunEntityService urunEntityService = context.getBean(UrunEntityService.class);
        UrunEntityService urunEntityService1 = context.getBean(UrunEntityService.class);

        UrunDao urunDao = urunEntityService.getUrunDao();
        UrunDao urunDao1 = urunEntityService1.getUrunDao();

        System.out.println("**** service ****");
        System.out.println(urunEntityService == urunEntityService1);

        System.out.println("**** dao ****");
        System.out.println(urunDao == urunDao1);


        ApplicationContext context1 = new AnnotationConfigApplicationContext(AnnotationBasedApplication.class);
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AnnotationBasedApplication.class);

        UrunEntityService urunEntityService3 = context1.getBean(UrunEntityService.class);
        UrunEntityService urunEntityService4 = context2.getBean(UrunEntityService.class);

        System.out.println("**** farklı context ****");
        System.out.println(urunEntityService3 == urunEntityService4);

//        List<Urun> urunList = urunEntityService.findAll();
//
//        for (Urun urun : urunList) {
//            System.out.println(urun);
//        }
    }

    public static ApplicationContext getApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBasedApplication.class);
        return context;
    }

    public void test(){

        List<Urun> urunList = urunEntityService.findAll();

        for (Urun urun : urunList) {
            String adi = urun.getAdi();

            System.out.println(adi);
        }

    }
}
