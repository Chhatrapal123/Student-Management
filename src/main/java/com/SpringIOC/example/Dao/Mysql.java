package com.SpringIOC.example.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class Mysql implements DaoI
{
	    @Override
	    public void generateReport() 
	    {
	        System.out.println("This is Mysql implementation of generateReport()");
	    }

}
