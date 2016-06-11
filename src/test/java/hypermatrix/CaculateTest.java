package hypermatrix;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hypermatrix.dto.CaculateDto;
import com.hypermatrix.service.CaculateService;
import com.hypermatrix.service.FunctionService;
import com.mathworks.toolbox.javabuilder.MWArray;


public class CaculateTest {
	/*private CaculateService service;
	@Before
	public void before(){
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/spring-beans.xml");
		service = ac.getBean(CaculateService.class);
	}
	@Test
	public void caculateTest(){
		String projectName = "test1";
		String className = "test2";
		String methodName = "test3";
		URL url;
		try {
			url = new URL("file:F:/functions/"+projectName+".jar");
			
	        URLClassLoader myClassLoader = new URLClassLoader(new URL[] { url }, Thread.currentThread()  
	                .getContextClassLoader());  
	        Class<?> myClass = myClassLoader.loadClass(projectName+"."+className);  
	        Method method = myClass.getMethod(methodName, int.class,Object[].class);
	        Object[] result = (Object[]) method.invoke(myClass.newInstance(), 1,new Object[]{"3"});
	        System.out.println(result[0]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Test
	public void caculateServiceTest(){
		CaculateDto dto = new CaculateDto();
		List<String> list = new ArrayList<String>();
		list.add("2");
		dto.setClassName("test2");
		dto.setPakageName("test1");
		dto.setMethodName("test3");
		dto.setParams(list);
		System.out.println(service.caculate(dto));
	}*/
}
