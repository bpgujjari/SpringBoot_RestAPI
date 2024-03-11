package com.image.serv;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.image.entity.Image;
import com.image.repo.ImageRepo;

@Service
public class ImageService implements ImageServ {

	
	@Autowired
	private ImageRepo repo;
	
	
	public Image saveImage(MultipartFile file,String name) throws IOException {
		Image img=new Image();
		img.setImage(file.getBytes());
		img.setName(name);
		
		return repo.save(img);
	}


	


	@Override
	public Image getImage(Integer id) {
		return repo.findById(id).get();
	}





	@Override
	public List<Image> getAll() {

		return repo.findAll();
	}





	
}
