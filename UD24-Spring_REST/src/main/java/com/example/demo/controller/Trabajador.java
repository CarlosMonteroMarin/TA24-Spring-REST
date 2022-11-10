package com.example.demo.controller;

public enum Trabajador {
	
	carpintero, herrero, pintor;
	
public static int definirSalario(String puesto) {
		
		switch (puesto) {
		case "carpintero":
			return 2000;
			
		case "herrero":
			return 2500;
			
		case "pintor":
			return 3000;
		
		default:
			return 0;
		}
	}
public static String getTrabajo(Trabajador trabajador) {
	
	switch (trabajador) {
		case carpintero:
			return "carpintero";

		case herrero:
			return "herrero";
			
		case pintor:
			return "pintor";
		
		default:
			return "trabajo predeterminado";
	}
	
}
}
