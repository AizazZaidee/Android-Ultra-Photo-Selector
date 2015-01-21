package com.photoselector.model;

public class AlbumModel {

	private String name;

	private int count;

	private String recent;

	private boolean isCheck;

	public AlbumModel() {
		super();
	}
	
	public AlbumModel(String name) {
		this.name = name;
	}

	public AlbumModel(String name, int count, String recent) {
		super();
		this.name = name;
		this.count = count;
		this.recent = recent;
	}
	
	public AlbumModel(String name, int count, String recent, boolean isCheck) {
		super();
		this.name = name;
		this.count = count;
		this.recent = recent;
		this.isCheck = isCheck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getRecent() {
		return recent;
	}

	public void setRecent(String recent) {
		this.recent = recent;
	}

	public boolean isCheck() {
		return isCheck;
	}

	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}

	public void increaseCount() {
		count++;
	}

}
