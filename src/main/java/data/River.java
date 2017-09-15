package data;

public class River {
	
	private String name;
	private String county;
	private String length;
	private String streamType;
	
	public River(String name, String county, String length, String streamType) {
		super();
		this.name = name;
		this.county = county;
		this.length = length;
		this.streamType = streamType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getStreamType() {
		return streamType;
	}
	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}
	@Override
	public String toString() {
		return "River [name=" + name + ", county=" + county + ", length=" + length + ", streamType=" + streamType + "]";
	}
}
	
	