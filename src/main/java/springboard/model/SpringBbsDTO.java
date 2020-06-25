package springboard.model;

public class SpringBbsDTO {
	private int idx;
	private String name;
	private String title;
	private String contents;
	private java.sql.Date postdate;
	private int hits;
	private int bgroup;
	private int bstep;
	private int bindent;
	private String pass;
	//가산번호 부여를 위한 멤버변수 추가
	private int virtualNum;
	
	//getter/setter만 선언
	public int getIdx() {
		return idx;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public java.sql.Date getPostdate() {
		return postdate;
	}
	public int getHits() {
		return hits;
	}
	public int getBgroup() {
		return bgroup;
	}
	public int getBstep() {
		return bstep;
	}
	public int getBindent() {
		return bindent;
	}
	public String getPass() {
		return pass;
	}
	public int getVirtualNum() {
		return virtualNum;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setPostdate(java.sql.Date postdate) {
		this.postdate = postdate;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setVirtualNum(int virtualNum) {
		this.virtualNum = virtualNum;
	}

}
