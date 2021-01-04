package com.taxfiling.repositorytest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taxfiling.TaxFilingApplication;
import com.taxfiling.entity.Admin;
import com.taxfiling.repository.AdminRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TaxFilingApplication.class)
class AdminRepositoryTest {

	@Autowired
	private AdminRepository ar;

	@Test
	void getloginAdmin() {
		Admin a3 = ar.loginAdmin("admin", "admin");
		assertEquals("admin", a3.getEmail());
	}
}