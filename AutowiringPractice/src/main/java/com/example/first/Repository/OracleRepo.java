package com.example.first.Repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.example.first.ReportDAo;

@Repository("ora")

public class OracleRepo implements ReportDAo {

	@Override
	
	public String display() {
		// TODO Auto-generated method stub
		return "This is from Oracle";
	}

}
