package git;

public class demo {

	//code change in master 1
<<<<<<< Upstream, based on master
	//change 1 - master
=======
	//change 2 - feature
>>>>>>> 5977c78 change 2 - feature
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "demo [id=" + id + ", name=" + name + "]";
	}
}
