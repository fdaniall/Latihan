package model;

import java.util.ArrayList;

import iterator.FIFOIterator;

public class KumpulanUser {	
	private ArrayList<User> kumpulanUser;
	
	public KumpulanUser() {
		kumpulanUser = new ArrayList<>();
	}
	
	public void tambahUser(User T) {
		kumpulanUser.add(T);
	}
	
	public void viewUser() {
		FIFOIterator<User> iterator = new FIFOIterator<>(kumpulanUser);
		while(iterator.hasNext()) {
			iterator.getNext().printAttribute();
			System.out.println();
		}
	}
	
	public void nextUser() {
		FIFOIterator<User> iterator = new FIFOIterator<>(kumpulanUser);
		while(iterator.hasNext()) {
			User currUser = iterator.getNext();
			currUser.getStatusForm().changeNext(currUser);
		}
	}
}
