package com.andrius.project.RMI_Project.others;

import java.rmi.RemoteException;
import java.rmi.server.*;

import com.andrius.project.RMI_Project.interfaces.AddI;

// obtaining a stub that communicates to the remote object we need extend UnicastRemoteObject
public class AddC extends UnicastRemoteObject implements AddI{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// if you extend UnicastRemoteObject, you must have provide default constructor:
	public AddC() throws RemoteException {
		super();
	}

	// we need provide Remote Interface implementation for one method:
	public int add(int x, int y){
		return x + y;
	}
}
