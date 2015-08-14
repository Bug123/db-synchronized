package com.yipushi.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQtzJob {
	public void execute(){
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
}
