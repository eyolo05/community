package com.nowcoder.community;

//import com.nowcoder.community.dao.AlphaDao;
//import com.nowcoder.community.service.AlphaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
//使得运行的测试代码以CommunityApplication为配置类
@ContextConfiguration(classes = CommunityApplication.class)

//想要获得自动创建的容器就要实现ApplicationContextAware接口，并实现其中的方法
class CommunityApplicationTests implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//这里的ApplicationContext就是Spring容器
		//记录获取的容器
		this.applicationContext = applicationContext;
	}

//	@Test
//	public void testApplicationContext() {
//		System.out.println(applicationContext);
//
//		AlphaDao alphaDao = applicationContext.getBean(AlphaDao.class);
//		System.out.println(alphaDao);
//		System.out.println(alphaDao.select());
//
//		//这样getBean默认返回的是Object类型，因为这样获取bean没有给类型
//		//alphaDao = applicationContext.getBean("alphaHibernate");
//
//		//解决方法有两种：强制类型转换、再加一个参数
//		//1
//		//alphaDao = (AlphaDao) applicationContext.getBean("alphaHibernate");
//		//2
//		alphaDao = applicationContext.getBean("alphaHibernate", AlphaDao.class);
//		System.out.println(alphaDao.select());
//
////		alphaDao = applicationContext.getBean(AlphaDaoHibernateImpl.class);
////		System.out.println(alphaDao.select());
//	}
//
//
//	@Test
//	public void testBeanManagement() {
//		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
//		//com.nowcoder.community.service.AlphaService@3b57dba4
//		System.out.println(alphaService);
//
//		AlphaService alphaService1 = applicationContext.getBean(AlphaService.class);
//		//com.nowcoder.community.service.AlphaService@3b57dba4
//		//两次返回的地址相同，说明bean在Spring容器中是单例的，只被创建和销毁一次
//		System.out.println(alphaService1);
//	}
//
//	@Test
//	public void testBeanConfigure() {
//		SimpleDateFormat simpleDateFormat =
//				applicationContext.getBean(SimpleDateFormat.class);
//		System.out.println(simpleDateFormat.format(new Date()));
//	}
//
//	//自动注入bean给属性alphaDao
//	@Autowired
//	//当有接口有多个实现的时候，自动注入bean使用@Qualifier（“类名”）可以指定注入哪个类
//	@Qualifier("alphaHibernate")
//	private AlphaDao alphaDao;
//
//	@Autowired
//	private AlphaService alphaService;
//
//	@Autowired
//	private SimpleDateFormat simpleDateFormat;
//
//	@Test
//	public void testDI() {
//		System.out.println(alphaDao);
//		System.out.println(alphaService);
//		System.out.println(simpleDateFormat);
//	}
}
