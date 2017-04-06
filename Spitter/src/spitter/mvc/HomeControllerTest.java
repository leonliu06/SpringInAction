package spitter.mvc;

import java.util.*;

import spitter.domain.Spittle;
import spitter.service.SpitterService;

import org.mockito.*;
import org.junit.*;


public class HomeControllerTest {
	
	@Test
	public void shouldDisplayRecentSpittles(){
		
		List<Spittle> expectedSpittles = Arrays.asList(new Spittle(), new Spittle(), new Spittle());
		
		SpitterService spitterService = Mockito.mock(SpitterService.class);
		
		Mockito.when(spitterService.getRecentSpittles(HomeController.DEFAULT_SPITTLES_PER_PAGE)).thenReturn(expectedSpittles);
		
		HomeController controller = new HomeController(spitterService);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		
		String viewName = controller.showHomePage(model);
		
		Assert.assertEquals("home", viewName);
		
		Assert.assertSame(expectedSpittles, model.get("spittles"));
		
		Mockito.verify(spitterService).getRecentSpittles(HomeController.DEFAULT_SPITTLES_PER_PAGE);
		
	}

}
