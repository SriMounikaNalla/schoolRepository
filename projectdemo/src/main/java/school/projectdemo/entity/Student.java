package school.projectdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="students")
public class Student {
		
		

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="first_name" ,nullable=false)
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="email")
		private String email;
		
		public Student() {
			
		}
		
		public Student(String firstName, String lastName, String email) {
			
			this.firstName=firstName;
			this.lastName=lastName;
			this.email=email;
			
			
		}
}
