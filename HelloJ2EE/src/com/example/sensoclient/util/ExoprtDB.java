package com.example.sensoclient.util;

import org.hibernate.cfg.Configuration;  
import org.hibernate.tool.hbm2ddl.SchemaExport; 


public class ExoprtDB {
	public static void main(String[] args) {  
        //Ĭ�϶�ȡhibernate.cfg.xml�ļ�  
        Configuration cfr = new Configuration().configure();  
          
        SchemaExport export = new SchemaExport(cfr);  
        export.create(true, true);  
    }  
}
