package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.LocationData;
import com.location.entities.Locations;
import com.location.services.Locationservices;
import com.location.util.EmailService;
@Controller
public class LocationController {
	@Autowired
	private Locationservices loc;
	
	@Autowired
	private EmailService mail;
	
	
	@RequestMapping("/savelocation1")
	public String saveLocation() {
		return "saveLocation";}
	@RequestMapping("/savelocdata")
	public String savelocationdata(@ModelAttribute("location") Locations location, ModelMap modelMap) {
		loc.savedata(location);
		modelMap.addAttribute( "msg",  "Record is saved");
		mail.sendSimpleMessage("prajwalmundodi@gmail.com", "welcome", "location is saved");
		return "saveLocation";
		}
//	@RequestMapping("/savelocdata")
//	public String savelocationdata(@RequestParam ("id") long id, @RequestParam ("name") String name , @RequestParam ("codes") String code, @RequestParam ("type") String type, ModelMap modelMap) {
//		Locations locate =new Locations();
//		locate.setId(id);
//		locate.setCodes(code);
//		locate.setName(name);
//		locate.setType(type);
//		loc.savedata(locate);
//		modelMap.addAttribute( "msg",  "Record is saved");
//		return "saveLocation";
//		
//	}
//	@RequestMapping("/savelocdata")
//	public String savelocationdata(LocationData locatiodata, ModelMap modelMap) {
//		Locations locate =new Locations();
//		locate.setId(locatiodata.getId());
//		locate.setCodes(locatiodata.getCodes());
//		locate.setName(locatiodata.getName());
//		locate.setType(locatiodata.getType());
//		loc.savedata(locate);
//		modelMap.addAttribute( "msg",  "Record is saved");
//		return "saveLocation";
	@RequestMapping("searchlocation")	
	public String getAll(ModelMap model) {
		List<Locations> getlocation = loc.getlocation();
		model.addAttribute("location", getlocation);
		return "searchresults";
}
	@RequestMapping("delete")	
	public String delete(@RequestParam ("id") long id,ModelMap model,ModelMap model1) {
		loc.delete(id);
		System.out.println(id);
		List<Locations> getlocation = loc.getlocation();
		model.addAttribute("location", getlocation);
		model1.addAttribute("msg", "location deleted");
		return "searchresults";
	}
	@RequestMapping("update")	
	public String update(@RequestParam ("id") long id,ModelMap model) {
		Locations update = loc.update(id);
		model.addAttribute("locs", update);
		return "updateresults";
	}
	
	@RequestMapping("/updatevalues")
	public String updateValues(LocationData locat,ModelMap model, ModelMap model1) {
		Locations ln = new Locations();
		ln.setId(locat.getId());
		ln.setCodes(locat.getCodes());
		ln.setName(locat.getName());
		ln.setType(locat.getType());
		loc.savedata(ln);
		List<Locations> getlocation = loc.getlocation();
		model.addAttribute("location", getlocation);
		model1.addAttribute("msg", "location updated");
		return "searchresults";
		
	}
}
