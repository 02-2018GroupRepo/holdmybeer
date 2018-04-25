package hello;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
//	@Autowired
//	private ArrayList<students> student_list = new ArrayList<String>();
//	@Autowired
//	private ArrayList<students> student_list2 = new ArrayList<String>();
	
	@Autowired
	NameService conf;
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
 
    
    @RequestMapping("/students")
    public ArrayList<students> show_students(){
        		return conf.addToList();
    }
    @RequestMapping("/reverse")
    public ArrayList<students> show_students_reverse(){
    	return conf.showReverse();
    }
}
