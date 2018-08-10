package kr.playground.jobs.vo;

import kr.playground.jobs.vo.upper.AbstractVo;

public class PopupVo extends AbstractVo {
	
	private String popupId  ;
	private String popupName   ;
	private String popupType   ;
	private String contents    ;
	private String height      ;
	private String width       ;
	private String startY      ;
	private String startX      ;
	private String startDate   ;
	private String endDate     ;
	private String url         ;
	private String useYn       ;
	
	
	public String getPopupId() {
		return popupId;
	}
	public void setPopupId(String popupId) {
		this.popupId = popupId;
	}
	public String getPopupName() {
		return popupName;
	}
	public void setPopupName(String popupName) {
		this.popupName = popupName;
	}
	public String getPopupType() {
		return popupType;
	}
	public void setPopupType(String popupType) {
		this.popupType = popupType;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getStartY() {
		return startY;
	}
	public void setStartY(String startY) {
		this.startY = startY;
	}
	public String getStartX() {
		return startX;
	}
	public void setStartX(String startX) {
		this.startX = startX;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	
}
