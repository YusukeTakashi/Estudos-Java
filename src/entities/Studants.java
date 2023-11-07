package entities;

import java.util.Objects;

public class Studants {
	private String name;
	
	public Studants(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studants other = (Studants) obj;
		return Objects.equals(name, other.name);
	}

	
	
}
