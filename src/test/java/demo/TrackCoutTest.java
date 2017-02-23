package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.cisco.spring.demo.api.CompactDisc;
import com.cisco.spring.demo.config.TrackCounterConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TrackCounterConfig.class }, loader = AnnotationConfigContextLoader.class)
public class TrackCoutTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private CompactDisc disc;

	@Test
	public void testDevDataSource() {

		CompactDisc disc = (CompactDisc) applicationContext.getBean("bankDisc");
		disc.playTrack(1); disc.playTrack(1); disc.playTrack(2); 

	}

}
