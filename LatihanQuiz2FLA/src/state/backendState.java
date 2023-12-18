package state;

import model.User;

public class backendState implements State {

	@Override
	public void changeNext(User T) {
		T.setStatusForm(new UserLastState());
	}

	@Override
	public void displayState() {
		System.out.println("Solving Algorithm Problems");
	}

}
