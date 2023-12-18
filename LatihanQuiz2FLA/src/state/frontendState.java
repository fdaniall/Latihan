package state;

import model.User;

public class frontendState implements State {

	@Override
	public void changeNext(User T) {
		T.setStatusForm(new UserLastState());
	}

	@Override
	public void displayState() {
		System.out.println("Designing Application UI UX");

	}

}
