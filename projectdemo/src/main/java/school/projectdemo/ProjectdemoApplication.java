package school.projectdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import school.projectdemo.entity.Student;
import school.projectdemo.repository.StudentRepository;

@SpringBootApplication
public class ProjectdemoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjectdemoApplication.class, args);
		System.out.println("---started----");
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception{
//		Student std1=new Student("Ramesh","Fadatare","ramesh@gmail.com");
//		studentRepository.save(std1);
//		
//		Student std2=new Student("Rajesh","tare","rajesh@gmail.com");
//		studentRepository.save(std2);
//		
//		Student std3=new Student("mouni","nalla","mouni@gmail.com");
//		studentRepository.save(std3);
	}

}
