package state;

import model.User;

public interface State {
	public void changeNext(User T);
	public void displayState();
}
