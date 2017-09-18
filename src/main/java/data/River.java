package data;

public class River {
	
	private String id;
	private String county;
	private String name;
	private String streamType;
	private String imgurl;
	private String fact;
	public River(String id, String county, String name, String streamType, String imgurl, String fact) {
		super();
		this.id = id;
		this.county = county;
		this.name = name;
		this.streamType = streamType;
		this.imgurl = imgurl;
		this.fact = fact;
	}
	
	public River() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreamType() {
		return streamType;
	}
	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getFact() {
		return fact;
	}
	public void setFact(String fact) {
		this.fact = fact;
	}
	@Override
	public String toString() {
		return "River [id=" + id + ", county=" + county + ", name=" + name + ", streamType=" + streamType + ", imgurl="
				+ imgurl + ", fact=" + fact + "]";
	}
	
}