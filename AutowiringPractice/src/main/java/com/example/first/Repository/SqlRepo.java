package com.example.first.Repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.first.ReportDAo;

@Repository
public class SqlRepo  implements ReportDAo{

	
	

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "This is from Sql";
	}

}
