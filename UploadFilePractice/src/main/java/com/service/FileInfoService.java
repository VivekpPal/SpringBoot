package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.FileInfo;
import com.repository.FileInfoRepository;
@Service
public class FileInfoService {
	
	
	@Autowired
	FileInfoRepository fileInfoRepository;

	
	 public void saveFile(FileInfo fileInfo){
		 this.fileInfoRepository.saveFile(fileInfo);
	 }
	 
	 public  List<FileInfo>  getAllFile(){
		 List<FileInfo> listofFile = this.fileInfoRepository.getAllFiles();
		 
		 return  listofFile;
	 }
	 
	 public FileInfo getSingleData(int id){
		 FileInfo fileInfo = this.fileInfoRepository.getSingleFile(id);
		 return fileInfo;
	 }
	 

}
