package com.image.serv;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.image.entity.Image;

public interface ImageServ {
	public Image saveImage(MultipartFile file,String name) throws IOException;
	public Image getImage(Integer id);
	public List<Image> getAll();
}
