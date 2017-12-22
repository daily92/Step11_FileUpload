package test.file.dto;

public class FileDto {
	private int num;
	private String writer;
	private String title;
	private String orgFileName;		// 원본 파일명
	private String saveFileName;	// 저장된 파일명
	private long filesize;			// 파일의 크기 byte 는 큰 숫자 일 수 있으므
	private String regdate;
	
	public FileDto() {}

	public FileDto(int num, String writer, String title, String orgFileName, String saveFileName, long filesize,
			String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.orgFileName = orgFileName;
		this.saveFileName = saveFileName;
		this.filesize = filesize;
		this.regdate = regdate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrgFileName() {
		return orgFileName;
	}

	public void setOrgFileName(String orgFileName) {
		this.orgFileName = orgFileName;
	}

	public String getSaveFileName() {
		return saveFileName;
	}

	public void setSaveFileName(String saveFileName) {
		this.saveFileName = saveFileName;
	}

	public long getFileSize() {
		return filesize;
	}

	public void setFileSize(long filesize) {
		this.filesize = filesize;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}