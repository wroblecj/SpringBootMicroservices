package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Test
/**
 * @author Administrator
 *
 */
@Controller
public class PlantPlacesController {

	@RequestMapping("/start")
	public String start() {
		
		return "start";
		
	}
	
	/**
	 * 
	 * Handle the / endpoint
	 *@return something
	 */
	@RequestMapping("/")
	public String index() {
		
		return "start";
		
	}
}
