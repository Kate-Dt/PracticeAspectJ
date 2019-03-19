import main.Quiz;
import main.Visitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("SpringBeans.xml");
        Quiz quiz = (Quiz) applicationContext.getBean("quiz");
        quiz.start("\"musical quiz\"");
        Visitor visitor = (Visitor)applicationContext.getBean("visitor");
        visitor.visitCafe();
    }
}
