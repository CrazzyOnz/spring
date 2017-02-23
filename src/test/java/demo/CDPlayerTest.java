package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.cisco.spring.demo.api.MediaPlayer;
import com.cisco.spring.demo.api.Performance;
import com.cisco.spring.demo.biz.cd.MagicDisc;
import com.cisco.spring.demo.config.AppConfig;
import com.cisco.spring.demo.config.Electronic;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class }, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles(value = "dev")
public class CDPlayerTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private MediaPlayer mp1;
	
	@Autowired
	private MagicDisc magicDisc;
	
	@Autowired
	@Electronic
	private Performance perform;
	
	
	@Test
	public void testDevDataSource() {
		
		MediaPlayer mediaPlayer = (MediaPlayer) applicationContext.getBean("cdPlayer");
		mediaPlayer.play();

		System.out.println("Playing Again!!!");  
		
		mp1.play();
		
		System.out.println(mp1==mediaPlayer);   
		
		magicDisc.play();
		
		perform.perform();
		
		
		
	}

}
