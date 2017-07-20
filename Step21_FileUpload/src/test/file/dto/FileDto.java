package test.file.dto;

public class FileDto {
	private	int num;				//파일번호
	private	String writer;			//작성자	
	private	String title;			//제목
	private	String orgFileName;		//원본 파일명
	private	String saveFileName;	//파일 시스템에 저장된 파일명
	private long fileSize;			//파일의 크기
	private String regdate;			//등록일(업로드일자)
	
	//디폴트 생성자
	public FileDto(){}

	public FileDto(int num, String writer, String title, String orgFileName, String saveFileName, long fileSize,
			String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.orgFileName = orgFileName;
		this.saveFileName = saveFileName;
		this.fileSize = fileSize;
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
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
