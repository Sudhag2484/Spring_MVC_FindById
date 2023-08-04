package in.sudha.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sudha.entity.Course;
import in.sudha.repo.CourseRepo;

@Controller
public class CourseController {
	
	@Autowired
	private CourseRepo repo;
	
	@GetMapping("/course")
	private String getBookById(@RequestParam("cid") Integer cid ,Model model) {
		Optional<Course> findById = repo.findById(cid);
		if(findById.isPresent()) {
			Course courseObj = findById.get();
			model.addAttribute("course", courseObj);
		}
		return "index";
	}

}
