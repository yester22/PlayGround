package kr.playground.jobs.vo;

public class AdminMemberVo {
	private String memberId; 
	private String memberNm; 
	private String pwd; 
	private String lastLoginDt; 
	private String lastLogoutDt; 
	private String login_failCnt; 
	private String chkIdCode; 
	private String chkPwCode; 
	private String regId; 
	private String regDate; 
	private String uptId; 
	private String uptDate;
	
	public AdminMemberVo () {}
	
	public AdminMemberVo ( String memberId , String pwd ) {
		this.memberId = memberId;
		this.pwd = pwd;
	}
	
	public AdminMemberVo ( String memberId ) {
		this.memberId = memberId;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getLastLoginDt() {
		return lastLoginDt;
	}
	public void setLastLoginDt(String lastLoginDt) {
		this.lastLoginDt = lastLoginDt;
	}
	public String getLastLogoutDt() {
		return lastLogoutDt;
	}
	public void setLastLogoutDt(String lastLogoutDt) {
		this.lastLogoutDt = lastLogoutDt;
	}
	public String getLogin_failCnt() {
		return login_failCnt;
	}
	public void setLogin_failCnt(String login_failCnt) {
		this.login_failCnt = login_failCnt;
	}
	public String getChkIdCode() {
		return chkIdCode;
	}
	public void setChkIdCode(String chkIdCode) {
		this.chkIdCode = chkIdCode;
	}
	public String getChkPwCode() {
		return chkPwCode;
	}
	public void setChkPwCode(String chkPwCode) {
		this.chkPwCode = chkPwCode;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUptId() {
		return uptId;
	}
	public void setUptId(String uptId) {
		this.uptId = uptId;
	}
	public String getUptDate() {
		return uptDate;
	}
	public void setUptDate(String uptDate) {
		this.uptDate = uptDate;
	}
	
	public boolean isIsadmin() {
		return true;
	}
	
	
}
