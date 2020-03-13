package com.home;

public class grapes {
	
	
	public grapes(String type, String shape) {
		super();
		this.type = type;
		this.shape = shape;
	}
	String type;
	String shape;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}

	
	  @Override public int hashCode() { final int prime = 31; int result = 1;
	  result = prime * result + ((shape == null) ? 0 : shape.hashCode()); result =
	  prime * result + ((type == null) ? 0 : type.hashCode()); return result; }
	 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		apple other = (apple) obj;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	


}
