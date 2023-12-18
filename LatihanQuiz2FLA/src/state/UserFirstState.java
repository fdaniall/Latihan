package state;

import model.User;

public class UserFirstState implements State{

	@Override
	public void changeNext(User T) {
		T.setStatusForm(new UserSecondState());
	}

	@Override
	public void displayState() {
		System.out.println("Going Through Paperwork");
	}

}
