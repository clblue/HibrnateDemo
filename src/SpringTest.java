import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import user.User;

public class SpringTest {
    public static void main(String[] args)
    {
        ClassPathResource resource = new ClassPathResource("beans1.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);
        User user = (User) factory.getBean("user");
        System.out.println(user.print());
    }
}
