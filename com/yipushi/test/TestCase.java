package com.yipushi.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCase {
	/*@Test
	public void test1(){
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		JobLauncher launcher = c.getBean("jobLauncher",JobLauncher.class);
		Job job = c.getBean("FileReadAndWriterJob",Job.class);
		try {
			JobExecution result = launcher.run(job, new JobParameters());
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2(){
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource source = c.getBean("dataSource",DataSource.class);
		System.out.println(source);
	}
	@Test
	public void test3(){
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
		JobLauncher launcher = c.getBean("jobLauncher",JobLauncher.class);
		Job job = c.getBean("FileReadAndWriterJob",Job.class);
		try {
			JobExecution result = launcher.run(job, new JobParameters());
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
//	public static void main(String[] args) {
//		ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");
//		JobLauncher launcher = c.getBean("jobLauncher",JobLauncher.class);
//		Job job = c.getBean("FileReadAndWriterJob",Job.class);
//		try {
//			JobExecution result = launcher.run(job, new JobParameters());
//			System.out.println(result.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	@Test
	public void test1(){
		new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
