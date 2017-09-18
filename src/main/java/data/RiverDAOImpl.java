package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
public class RiverDAOImpl implements RiverDAO {
	private static final String FILE_NAME = "/WEB-INF/rivers.csv";		//make csv file!
	private List<River> rivers = new ArrayList<>();
	/*
	 * Use Autowired to have Spring inject an instance of a WebApplicationContext
	 * into this object after creation. We will use the WebApplicationContext to
	 * retrieve an ServletContext so we can read from a file.
	 */
	@Autowired
	private WebApplicationContext wac;

	/*
	 * The @PostConstruct method is called by Spring after object creation and
	 * dependency injection
	 */
	@PostConstruct
	public void init() {
		// Retrieve an input stream from the servlet context
		// rather than directly from the file system
		try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				String id = tokens[0];
				String county = tokens[1];
				String name = tokens[2];
				String streamType = tokens[3];
				String imgurl = tokens[4];
				String fact = tokens[5];
				rivers.add(new River(id, county, name, streamType, imgurl, fact));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	// public State getStateByName(String name) {
	// // TODO : Implement method
	// State s = null;
	// // Find the state by it's name in the 'states' array
	// // If found, assign the state to 's'
	// return s;
	// }
	public River getRiverByName(String name) {
		River s = null;
		for (River river : rivers) {
			if (river.getName().equalsIgnoreCase(name)) {
				s = river;
				break;
			}
		}
		return s;
	}

	@Override
//	public State getStateByAbbreviation(String abbrev) {
//		// TODO : Implement method
//		State s = null;
//		// Find the state by it's abbreviation in the 'states' array
//		// If found, assign the state to 's'
//		return s;
//	}
	public River getRiverByCounty(String county) {
		River s = null;
		for (River river : rivers) {
			if (river.getCounty().equalsIgnoreCase(county)) {
				s = river;
				break;
			}
		}
		return s;
	}
	
	@Override
	public List<River> getRiverByStreamType(String StreamType) {
		
		List<River> riverList = new ArrayList();
		for (River river : rivers) {
			if (river.getStreamType().equalsIgnoreCase(StreamType)) {
				riverList.add(river);
			}
		}
		return riverList;
	}

	@Override
	public void addRiver(River river) {
		rivers.add(river);
	}

	@Override
	public void deleteByName(String name) {
		River riverByName = getRiverByName(name);
		if(riverByName!= null) {
			rivers.remove(riverByName);
		}
		
		
		
//		for (int i = 0; i < rivers.size(); i++) {
//			if(rivers.get(i).getName().equals(name.getName())) {
//				rivers.remove(name);
//			}
//		}
	}
	
	
	
}
