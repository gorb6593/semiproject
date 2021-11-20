package test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;



public class UserInserTest {

	public static void main(String[] args) {
		// Start Spring Container
		AbstractApplicationContext factory
		= new GenericXmlApplicationContext("myspring.xml");
		
		Service<String,UserVO> biz = 
			(Service)factory.getBean("uservice");
		UserVO user = new UserVO("id66", "pwd05", "�嵿��");
		try {
			biz.register(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		factory.close();
	}

}



