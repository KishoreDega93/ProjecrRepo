package com.example.first.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.first.ReportDAo;


@Service
public class ReportDaoService {

	public ReportDAo rd ;
	
	@Autowired
//	@Qualifier("ora")
//	void setReportDAo (ReportDAo rd) {
//		System.out.println("Setter methode called");
//		this.rd=rd;
//	}
	
	// constructor
	public ReportDaoService(@Qualifier("ora")ReportDAo rd) {
		this.rd = rd;
	}

	
	public void database() {
		String str = rd.display();
		System.out.println(str);
	}
}
