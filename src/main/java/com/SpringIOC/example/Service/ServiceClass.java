package com.SpringIOC.example.Service;

import org.springframework.stereotype.Service;

import com.SpringIOC.example.Dao.DaoI;
import com.SpringIOC.example.Dao.Mysql;
import com.SpringIOC.example.Dao.Oracle;

@Service
public class ServiceClass 
{    
    public void doSomething() 
    {
    	DaoI instanceA = new Mysql();
    	DaoI instanceB = new Oracle();
    	
        instanceA.generateReport();
        instanceB.generateReport();
    }

}
