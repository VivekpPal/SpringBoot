package com.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.entity.FileInfo;

import com.service.FileInfoService;
@Controller
public class FileInfoController {
	
	@Autowired
	FileInfoService fileInfoService;
	
	@Autowired
	ServletContext context;
	
	@RequestMapping(path="/")
	public String geIndexPage(){
		
		return "index";
	}
	@RequestMapping(path="/file")
	public String getUploadForm(){
		
		return "fileForm";
		
	}
	@RequestMapping(path="uploadSuccess" ,method=RequestMethod.POST)
	public String uploadSuccess(@RequestParam("file") CommonsMultipartFile file, Model model) throws IllegalStateException, IOException{
		/*System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());*/
		
		String uploadDir=context.getRealPath("/uploadFile");
		//System.out.println(uploadDir);
		File  dir= new File(uploadDir);
		//create folder on server
		if(!dir.exists()) dir.mkdirs();
		//file transfer on server
		String fileName=file.getOriginalFilename();
		File serverFile= new File(dir, fileName);
		file.transferTo(serverFile);
		
		//save to databse
		FileInfo fileInfo=new FileInfo();
		fileInfo.setFileName(fileName);//store file name in DB
		fileInfo.setFilePath(uploadDir);//store folder path in DB
		this.fileInfoService.saveFile(fileInfo);//save
		
		
		//get all file
		List<FileInfo> files = this.fileInfoService.getAllFile();
		model.addAttribute("files", files);
		
		return "success";
	}
     @RequestMapping("/download")
	public void downloadTheFile(@RequestParam("id") int id , HttpServletResponse response) throws IOException{
		//get the file ofprovided id
    	 
    	 FileInfo fileInfo = this.fileInfoService.getSingleData(id);	
    	String fulFilePath = context.getRealPath("/uploadFile/"+fileInfo.getFileName());
    	
    	File f= new File(fulFilePath);
    	Files.copy(f.toPath(), response.getOutputStream());
    	response.getOutputStream().flush();
    	
    	 
	}

}
