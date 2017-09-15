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
	// TODO : Autowire a RiverDAO and create getters and setters

	@Autowired
	RiverDAO dao;

	public void setDao(RiverDAO dao) {
		this.dao = dao;
	}

	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "name"
	// method GET
	// return : ModelAndView
	// view : "result.jsp"
	// object : "state", getStateByName

	@RequestMapping(path = "GetRiverData.do", params = "name", method = RequestMethod.GET)
	public ModelAndView getByName(@RequestParam("name") String n) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("state", dao.getRiverByName(n));
		mv.setViewName("result");
		return mv;
	}

	// TODO : Implement a request handler for:
	// path "GetStateData.do"
	// params "abbr"
	// method GET
	// return : ModelAndView
	// view : "result.jsp"
	// object : "state", getStateByAbbreviation

	@RequestMapping(path = "GetRiverData.do", params = "county", method = RequestMethod.GET)
	public ModelAndView getByCounty(@RequestParam("county") String n) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("state", dao.getRiverByCounty(n));
		mv.setViewName("result");
		return mv;
	}

	// TODO : Implement a request handler for:
	// path "NewState.do"
	// method POST
	// command object : State
	// return : ModelAndView
	// view : "result.jsp"

//	@RequestMapping(path = "NewState.do", method = RequestMethod.POST)
//	public ModelAndView newState(State state) {
//		dao.addState(state);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result.jsp");
//		return mv;
//	}

		// -------------------

		// TODO : Implement another request handler for:
		// path "NewState.do"
		// method POST
		// command object : State
		// return : ModelAndView
		// view : "redirect:stateAdded.do"
		// behavior : add state to dao, add state to flashAttributes

	@RequestMapping(path = "NewRiver.do", method = RequestMethod.POST)
	public ModelAndView newState(River river, RedirectAttributes redir) {
		dao.addRiver(river);
		ModelAndView mv = new ModelAndView();
		// mv.setViewName("result.jsp");
		redir.addFlashAttribute("river", river); // add "state" to model for next request
		mv.setViewName("redirect:riverAdded.do"); // redirect to new mapping
		return mv;
	}

		// TODO : Implement another request handler for:
		// path "stateAdded.do"
		// method GET
		// command object : State
		// return : ModelAndView
		// view : "result.jsp" or "result" if using InternalResourceViewResolver
		
		  
		  @RequestMapping(path = "riverAdded.do", method = RequestMethod.GET)
		  public String getInfo(River river) {
		    return "result";  //no longer result.jsp
		  }
	

	}