package hello;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NameService {
	public  ArrayList<students> addToList () {
		ArrayList<students> student_list = new ArrayList<>();
			student_list.add(new students("putin"));
			student_list.add(new students("stalin"));
			student_list.add(new students("kinggeorge"));
			student_list.add(new students("trump"));
			student_list.add(new students("castro"));
			student_list.add(new students("thatcher"));
			student_list.add(new students("idiamin"));
			student_list.add(new students("botha"));
			student_list.add(new students("mandela"));
			student_list.add(new students("guervara"));
			return student_list;
			
	}
	public  ArrayList<students> showReverse() {
		ArrayList<students> student_list2 = addToList();
		student_list2.sort(new Comparator<students> () {
			@Override
			public int compare(students s1, students s2) {
				if (	s1.getName().compareTo(s2.getName()) > 0) {
					return -1;
				}
				else 
					return 1;
			
			}
		});
		return student_list2;
				
	}
}
