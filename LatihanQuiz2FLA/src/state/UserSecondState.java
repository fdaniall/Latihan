package state;

import model.User;

public class UserSecondState implements State {

	@Override
	public void changeNext(User T) {
		if(T.getJobpref().equals("Backend Dev")) {
			T.setStatusForm(new backendState());
		} else {
			T.setStatusForm(new frontendState());
		}
	}

	@Override
	public void displayState() {
		System.out.println("Ongoing Interview");
	}

}
