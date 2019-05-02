package models;

public class TwitterModel {

	public int id;
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String title;
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String imageUrl;
	public String getImageUrl() {return title;}
	public void setImageUrl(String imageUrl) {this.imageUrl = imageUrl;}
	
	public boolean isPosted;
	public boolean getIsPosted() {return isPosted;}
	public void setIsPosted(boolean isPosted) {this.isPosted = isPosted;}
}
