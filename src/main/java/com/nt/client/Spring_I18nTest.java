package com.nt.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;

public class Spring_I18nTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter language Code::");
		String lang=scn.next();
		
		System.out.println("Enter Country Code::");
		String country=scn.next();
		
		Locale locale =new Locale(lang,country);
		String msg1=ctx.getMessage("welcome.msg", new Object[] {"rushi"},locale);
		String msg2=ctx.getMessage("goodbye.msg", new Object[] {},locale);
		String msg3=ctx.getMessage("application.title", new Object[] {},locale);
		String msg4=ctx.getMessage("wish.message", new Object[] {},locale);
		
		System.out.println(msg1+"---"+ msg2+"---" +msg3+"..."+msg4);
		
		
	}

}
