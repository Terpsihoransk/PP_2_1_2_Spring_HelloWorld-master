import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean2 = (Cat) applicationContext.getBean("cat");
        Cat secondBean2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.getMessage());
        System.out.println(secondBean.getMessage());

        System.out.println(bean2.getMessage());
        System.out.println(secondBean2.getMessage());

        boolean comparsion1 = bean == secondBean;
        boolean comparsion2 = bean2 == secondBean2;

        System.out.println(comparsion1);
        System.out.println(comparsion2);

    }
}