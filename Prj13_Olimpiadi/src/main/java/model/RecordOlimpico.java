package model;

public class RecordOlimpico {

	private int id;

	private String Event;
	private String Record;
	private String Athlete;
	private String Nation;
	private String Games;
	private String Genre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public String getRecord() {
		return Record;
	}
	public void setRecord(String record) {
		Record = record;
	}
	public String getAthlete() {
		return Athlete;
	}
	public void setAthlete(String athlete) {
		Athlete = athlete;
	}
	public String getNation() {
		return Nation;
	}
	public void setNation(String nation) {
		Nation = nation;
	}
	public String getGames() {
		return Games;
	}
	public void setGames(String games) {
		Games = games;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	@Override
	public String toString() {
		return "RecordOlimpico [id=" + id + ", Event=" + Event + ", Record=" + Record + ", Athlete=" + Athlete
				+ ", Nation=" + Nation + ", Games=" + Games + ", Genre=" + Genre + "]";
	}

	
	
	
	
}
