/**
 * 
 */
package com.aiglesiasp.mvc.JavaModC4PatronMVC.models;

/**
 * @author aitor
 *
 */
public class VideoModel {
	private int id;
	private String title;
	private String director;
	private int cliId;

	public VideoModel() {

	}

	// CONSTRUCTOR
	public VideoModel(String title, String director, int cliId) {
		this.title = title;
		this.director = director;
		this.cliId = cliId;
	}

	@Override
	public String toString() {
		return "VideoModel [id=" + id + ", title=" + title + ", director=" + director + ", cliId=" + cliId + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCliId() {
		return cliId;
	}

	public void setCliId(int cliId) {
		this.cliId = cliId;
	}

}
