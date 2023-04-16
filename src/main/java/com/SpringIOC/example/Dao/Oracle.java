package com.SpringIOC.example.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements DaoI
{
	@Override
    public void generateReport() 
	{
        System.out.println("This is Oracle implementation of generateReport()");
    }

}
