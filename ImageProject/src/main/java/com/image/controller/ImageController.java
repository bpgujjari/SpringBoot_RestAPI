package com.image.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.image.entity.Image;
import com.image.serv.ImageService;

@RestController
public class ImageController {

	@Autowired
	private ImageService serv;
	
	
	@PostMapping("postImg")
	public String saveImageDb(@RequestParam("name") String name, @RequestParam("image") MultipartFile  file  ) throws IOException {
		
		serv.saveImage(file, name);
		
		return "Image saved";
	}
	
	
	@GetMapping("getImg/{id}")
	public Image getImageObj(@PathVariable Integer id) {
		return serv.getImage(id);
	}
	
	@GetMapping("getAll")
	public List<Image> getAllImages(){
		return serv.getAll();
	}
	
}
