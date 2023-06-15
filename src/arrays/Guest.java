package arrays;

public class Guest {

	private String name;
	private String email;
	private int room;
	  
	   
	  public Guest(String name, String email, int room) {
	    this.name = name;
	    this.email = email;
	    this.room = room;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getEmail() {
	    return email;
	  }
	  
	  public void setRoom(int room) {
		  this.room = room;
	  }
	  
	  public int getRoom() {
		  return room;
	  }

	@Override
	public String toString() {
		return room + ": " + name + ", " + email;
	}
}
