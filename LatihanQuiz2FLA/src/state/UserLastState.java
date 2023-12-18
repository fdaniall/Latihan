package state;

import model.User;

public class UserLastState implements State{

	@Override
	public void changeNext(User T) {
		T.setStatusForm(null);
	}

	@Override
	public void displayState() {
		System.out.println("Applicant Succesfully Saved");
	}
	
}
