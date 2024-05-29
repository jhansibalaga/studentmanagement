package models;

public class student {
	private int stu_id;
    private String stu_name;
    private String stu_email;
	private long stu_phn;
    private String stu_branch;
    public student(int stu_id, String stu_name, String stu_email, long stu_phn, String stu_branch) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_email = stu_email;
		this.stu_phn = stu_phn;
		this.stu_branch = stu_branch;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_email() {
		return stu_email;
	}
	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}
	public long getStu_phn() {
		return stu_phn;
	}
	public void setStu_phn(long stu_phn) {
		this.stu_phn = stu_phn;
	}
	public String getStu_branch() {
		return stu_branch;
	}
	public void setStu_branch(String stu_branch) {
		this.stu_branch = stu_branch;
	}
    
    

}
