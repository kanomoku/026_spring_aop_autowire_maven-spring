package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
//		一.自动注入
//		1.在Spring 配置文件中对象名和ref=”id”,id名相同使用自动注入,可以不配置<property/>
//		2.两种配置办法
//			2.1 在<bean>中通过autowire=”” 配置,只对这个<bean>生效
//			2.2 在<beans>中通过default-autowire=””配置,表当前文件中所有<bean>都是全局配置内容
//		3.autowire=”” 可取值
//			3.1 default: 默认值,根据全局default-autowire=””值.默认全局和局部都没有配置情况下,相当于no
//			3.2 no: 不自动注入
//			3.3 byName: 通过名称自动注入.在Spring 容器中找类的Id
//			3.4 byType: 根据类型注入.
//				3.4.1 spring 容器中不可以出现两个相同类型的<bean>
//			3.5 constructor: 根据构造方法注入.
//				3.5.1 提供对应参数的构造方法(构造方法参数中包含注入对象)
//				3.5.2 底层使用byName, 构造方法参数名和其他<bean>的id相同.
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		People people = ac.getBean("people",People.class);
		System.out.println(people);
		System.out.println(people.getTeacher());
		
		People people1 = ac.getBean("people1",People.class);
		System.out.println(people1);
		System.out.println(people1.getTeacher());
		
		People people2 = ac.getBean("people2",People.class);
		System.out.println(people2);
		System.out.println(people2.getTeacher());
	}

}
