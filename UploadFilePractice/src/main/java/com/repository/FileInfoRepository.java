package com.repository;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.FileInfo;

@Repository
public class FileInfoRepository {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//-------------------------------------------------
	//save
	@Transactional
	public void saveFile(FileInfo fileInfo){
		this.hibernateTemplate.save(fileInfo);
		
	}
	//get all
	public List<FileInfo> getAllFiles(){
		List<FileInfo> listofFile = this.hibernateTemplate.loadAll(FileInfo.class);
		return listofFile;
	}
	//get single data
public FileInfo getSingleFile(int id){
	FileInfo fileInfo = this.hibernateTemplate.get(FileInfo.class, id);
	return fileInfo;
	
}



}



