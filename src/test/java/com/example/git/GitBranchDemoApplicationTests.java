package com.example.git;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitBranchDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("this is local01");
	}

	public static void main(String[] args) {
		System.out.println("this is master demo 01");
	}

}
