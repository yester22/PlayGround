package kr.playground.jobs.vo;

import kr.playground.jobs.vo.upper.AbstractVo;

public class MenuVo extends AbstractVo {
	private String menuCd;
	private String upMenuCd;
	private String menuNm;
	
	private String grantCd;
	private String grantw;
	private String grantd;
	private String grantu;
	private String programUrl;
	private String memberYn;
	private String memberId;
	
	
	public String getGrantCd() {
		return grantCd;
	}
	public void setGrantCd(String grantCd) {
		this.grantCd = grantCd;
	}
	public String getMenuCd() {
		return menuCd;
	}
	public void setMenuCd(String menuCd) {
		this.menuCd = menuCd;
	}
	public String getUpMenuCd() {
		return upMenuCd;
	}
	public void setUpMenuCd(String upMenuCd) {
		this.upMenuCd = upMenuCd;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
	public String getGrantw() {
		return grantw;
	}
	public void setGrantw(String grantw) {
		this.grantw = grantw;
	}
	public String getGrantd() {
		return grantd;
	}
	public void setGrantd(String grantd) {
		this.grantd = grantd;
	}
	public String getGrantu() {
		return grantu;
	}
	public void setGrantu(String grantu) {
		this.grantu = grantu;
	}
	public String getProgramUrl() {
		return programUrl;
	}
	public void setProgramUrl(String programUrl) {
		this.programUrl = programUrl;
	}
	/**
	 * @return the memberYn
	 */
	public String getMemberYn() {
		return memberYn;
	}
	/**
	 * @param memberYn the memberYn to set
	 */
	public void setMemberYn(String memberYn) {
		this.memberYn = memberYn;
	}
	/**
	 * memberId
	 * @return memberId 출력항목
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * memberId 세팅
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
