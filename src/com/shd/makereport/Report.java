package com.shd.makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * <h1>Make Report</h1>
 * Clase que se encarga de escribir archivos de texto
 * <br>
 * Escribe documentos de texto a partir de los atributos {@code nameFile}, {@code title}
 * y {@code content}, donde {@code nameFile} es el nombre del archivo, {@code title} es el titulo del mismo
 * y {@code content} el contenido de este.
 *
 * @author Ivan Tabera
 * @version 1.0
 * @since 2021
 * */
public class Report {
	
	private String nameFile;
	private String title;
	private String content;
	private String extension;
	
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * <h1>Metodo makeReport</h1>
	 * Metodo que se encarga de generar los archivos .txt utilizando los datos establecidos por los setters
	 * <br>
	 * Hace una comprobacion, si {@code nameFile}, {@code title} o {@code content} son nulos no genera el archivo
	 * y le pide al usuario proporcionar los datos necesarios.
	 * */
	public void makeReport() {
		if ( (getNameFile() != null) && (getTitle() != null) && (getContent() != null) ) {
			//Crear el archivo
			try {
				
				File file = new File(getNameFile()+"."+getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} else {
			System.out.println("Ingresa los datos del archivo");
		}
	}
	
	
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

}










