package com.example.ComponentMapping;

import com.example.ComponentMapping.entities.Salary;
import com.example.ComponentMapping.entities.employee;
import com.example.ComponentMapping.repos.employeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class ComponentMappingApplicationTests {


	@Autowired
	employeeRepository repository;


	@Test
	void contextLoads() {
	}

	@Test
	public void testEmployee(){
		employee em=new employee();
		em.setId(11);
		em.setFirstname("ritika");
		em.setLastname("rawat");
		em.setAge(21);
		Salary s = new Salary();
		s.setBasicsalary(20000);
		//s.setBonussalary(10000);
		s.setApecialallowancesalary(10000);
		s.setTaxamount(200);
		em.setSalary(s);
		repository.save(em);




	}



}
