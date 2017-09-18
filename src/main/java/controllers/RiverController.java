package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import data.River;
import data.RiverDAO;

@Controller
public class RiverController {

	@Autowired
	RiverDAO dao;

	public void setDao(RiverDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(path = "GetRiverData.do", params = "name", method = RequestMethod.GET)
	public ModelAndView getByName(@RequestParam("name") String n) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("river", dao.getRiverByName(n));
		mv.setViewName("result");
		return mv;
	}

	@RequestMapping(path = "GetRiverData.do", params = "county", method = RequestMethod.GET)
	public ModelAndView getByCounty(@RequestParam("county") String n) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("river", dao.getRiverByCounty(n));
		mv.setViewName("result");
		return mv;
	}


	@RequestMapping(path = "GetRiverData.do", params = "streamType", method = RequestMethod.GET)
	public ModelAndView getByStreamType(@RequestParam("streamType") String n) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("river", dao.getRiverByStreamType(n));
		mv.setViewName("result");
		return mv;
	}


	@RequestMapping(path = "NewRiver.do", method = RequestMethod.POST)
	public ModelAndView newRiver(River river, RedirectAttributes redir) {
		dao.addRiver(river);
		ModelAndView mv = new ModelAndView();
		// mv.setViewName("result.jsp");
		redir.addFlashAttribute("river", river); // add "river" to model for next request
		mv.setViewName("redirect:riverAdded.do"); // redirect to new mapping
		return mv;
	}


	@RequestMapping(path = "riverAdded.do", method = RequestMethod.GET)
	public String getInfo(River river) {
		return "result"; // no longer result.jsp
	}
	
	@RequestMapping(path = "deleteRiver.do", method = RequestMethod.GET)
		public ModelAndView deleteRiver( String name) {
			ModelAndView mv = new ModelAndView();
			dao.deleteByName(name);
			mv.setViewName("riverDeleted");
			return mv;
			
			
		}

}