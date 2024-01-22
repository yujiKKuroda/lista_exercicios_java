public class Holiday {
  private String date;
  private String name;

  public String getDate() {
    return this.date;
  }

  public String getName() {
    return this.name;
  }

  public Holiday() {
	}

	public Holiday(String date, String name) {
    this.date = date;
		this.name = name;
	}

  @Override
   public String toString() {
        return (this.getDate() + " => " + this.getName());
   }
}
