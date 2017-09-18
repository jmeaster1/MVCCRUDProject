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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((county == null) ? 0 : county.hashCode());
		result = prime * result + ((fact == null) ? 0 : fact.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((streamType == null) ? 0 : streamType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		River other = (River) obj;
		if (county == null) {
			if (other.county != null)
				return false;
		} else if (!county.equals(other.county))
			return false;
		if (fact == null) {
			if (other.fact != null)
				return false;
		} else if (!fact.equals(other.fact))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imgurl == null) {
			if (other.imgurl != null)
				return false;
		} else if (!imgurl.equals(other.imgurl))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (streamType == null) {
			if (other.streamType != null)
				return false;
		} else if (!streamType.equals(other.streamType))
			return false;
		return true;
	}
	
}