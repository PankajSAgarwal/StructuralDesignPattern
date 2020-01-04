package com.pankaj.designpatterns.composite;

// The component base class for composite pattern
// defines operations applicable for both leaf and composite
public abstract class File {

	private String name;
	
	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	public abstract void addFile(File file);
	
	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}
