package com.bit.exam02;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public SmsSender sender() {
		SmsSender s = new SmsSender();
		s.setFrom("ȫ�浿");
		s.setTo("�̼���");
		return s;
	}
	
	@Bean(autowire = Autowire.BY_TYPE, initMethod = "monitor")
	public SystemMonitor sm() {
		SystemMonitor s = new SystemMonitor();
		s.setPeriodTime(30);
		//s.setSender(sender());
		return s;
	}
}












