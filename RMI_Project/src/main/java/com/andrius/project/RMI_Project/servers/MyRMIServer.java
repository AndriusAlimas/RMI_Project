package com.andrius.project.RMI_Project.servers;

import java.rmi.Naming;

import com.andrius.project.RMI_Project.others.AddC;

public class MyRMIServer {

	public static void main(String[] args)throws Exception {
		
	// this object will be on Server SIDE:
	AddC obj = new AddC();
// We have to link this object to RMI register, we have to register his name here
		// to save caption of Object:
			Naming.rebind("ADD",obj);

	// to promt that server is started:
	System.out.println("Server is started...");
			}

}

