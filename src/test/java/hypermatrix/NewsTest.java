package hypermatrix;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hypermatrix.entity.News;
import com.hypermatrix.service.NewsService;


public class NewsTest {
	NewsService service;
	@Before
	public void before(){
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/spring-beans.xml");
		service = ac.getBean(NewsService.class);
	}
	@Test
	public void functiuonQuereyTest(){
		System.out.println(service.query());
	}
	@Test
	public void functiuonQuereyByIdTest(){
		System.out.println(service.queryById( 6));
	}
	@Test
	public void functiuonSaveTest(){
		News n;
		for(int i=1;i<20;i++){
			n = new News(null,"title:"+i,new Date(),"author:"+i,"fsdaf-"+i+"-dfsaf");
			service.save(n);
			}
	}
	@Test
	public void functiuonDeleteTest(){
		for(int i=10;i<15;i++){
			service.delete(i);
			}
	}
	@Test
	public void functiuonUpdateTest(){
		News f = new News(6, "title:"+88,new Date(), "author:"+88, "dasfds-"+88+"-fasdfds");
		service.update(f);
	}
}
