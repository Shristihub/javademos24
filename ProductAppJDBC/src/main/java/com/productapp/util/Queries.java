package com.productapp.util;

public class Queries {

	public static final String CREATEQUERY = """
			create table product(product_name varchar(20),
			                     product_id int primary key auto_increment,
			                     brand varchar(20),
			                     category varchar(20),
			                     price float,
			                     mfg_date date,
			                     expiry_date date,
			                     weight_in_gms varchar(20)) """;
	
	public static final String INSERTQUERY = """
				INSERT INTO PRODUCT
				(product_name,brand,category,price,mfg_date,expiry_date,weight_in_gms)
				values(?,?,?,?,?,?,?)
			""";

	public static final String UPDATEQUERY = """
			UPDATE PRODUCT SET PRICE = ? WHERE PRODUCT_ID=?;
			
			""";

}
