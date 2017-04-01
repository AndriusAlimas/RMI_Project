package com.andrius.project.RMI_Project.interfaces;

import java.rmi.Remote;
// we creating Remote Interface that interface become Remote Interface
public interface AddI extends Remote {
	// just add two numbers from parameters, interface method signature :
	public int add(int x, int y)throws Exception;
}
