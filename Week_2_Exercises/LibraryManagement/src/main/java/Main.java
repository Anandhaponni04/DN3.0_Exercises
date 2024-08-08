import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.*;

import com.library.service.BookService;

public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext demo=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BookService book=(BookService)demo.getBean("service");
		book.saveBook("Power of subConcious mind", "Joseph murphy");
	}
	
}
