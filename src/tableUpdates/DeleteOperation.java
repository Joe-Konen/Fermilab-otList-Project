package tableUpdates;

import application.FermiEntry;

public class DeleteOperation extends Operation {
	private FermiEntry entry;
	private String firstName;
	private String lastName;
	private int seniority;
	private double hoursChanged = 0;

	public DeleteOperation(String firstName, String lastName, int seniority) {
		super();
		this.type = "delete";
		this.firstName = firstName;
		this.lastName = lastName;
		this.seniority = seniority;
	}

	public DeleteOperation(FermiEntry entry) {
		super();
		this.entry = entry;
		this.firstName = entry.getFirstName();
		this.lastName = entry.getLastName();
		this.seniority = entry.getSeniority();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public double getHoursChanged() {
		return hoursChanged;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(String.format("%s,%s,%s,%s,%s", this.getTime(), "delete", this.firstName,
				this.lastName, this.seniority));
		return sb.toString();
	}
}
