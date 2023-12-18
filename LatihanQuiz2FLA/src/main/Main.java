package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.KumpulanUser;
import model.User;
import state.State;

public class Main {

	Scanner scanner = new Scanner(System.in);
	String name, jobpref, randomCode = "";
	int jobex;
	Random random = new Random();

	KumpulanUser kumpulanUser = new KumpulanUser();

	ArrayList<String> data = new ArrayList<>();

	public Main() {
		menu();
	}

	public static void main(String[] args) {
		new Main();
	}

	void menu() {
		System.out.println("JekPedia");
		System.out.println("========");
		System.out.println("1. Register New Applicant Form");
		System.out.println("2. View Form");
		System.out.println("3. Exit");
		System.out.print(">> ");

		if(scanner.hasNextInt()) {
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				case1();
				break;
			case 2:
				case2();	
				break;
			case 3:
				System.out.println("makasih dah nyoba");
				System.exit(0);
				break;
			default:
				System.out.println("gaada menunya");
				break;
			}
		} else {
			System.out.println("harus int");
		}
	}

	void case1() {

		do {
			System.out.print("Input name [cannot be empty]: ");
			name = scanner.nextLine();
		} while (name.isEmpty());

		do {
			System.out.print("Input job experience [> 1]: ");
			jobex = scanner.nextInt();
			scanner.nextLine();
		} while (jobex <= 1);

		do {
			System.out.print("Input job preferences [Backend Dev | Frontend Dev][case sensitive]: ");
			jobpref = scanner.nextLine();
		} while (!jobpref.equals("Backend Dev") && (!jobpref.equals("Frontend Dev")));

		Random random 	= new Random();
		String ch	 	= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

		for(int i=0; i<5; i++) {
			int index 	= random.nextInt(ch.length());
			randomCode 	+= ch.charAt(index);
		}
		System.out.println("Random Code: " + randomCode);

		kumpulanUser.tambahUser(new User(name, jobpref, randomCode, jobex));
		System.out.println("Data submitted!");
		menu();
	}

	void case2() {
		kumpulanUser.viewUser();
		System.out.print("Preview next applicant form? [N for next | Q to quit][case sensitive]: ");
		String chs = scanner.nextLine();
		if(chs.equals("N")) {
			kumpulanUser.nextUser();
		}
		menu();
	}

	public String getJobpref() {
		return jobpref;
	}

	public void setJobpref(String jobpref) {
		this.jobpref = jobpref;
	}

	public String getRandomCode() {
		return randomCode;
	}

	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}

	public int getJobex() {
		return jobex;
	}

	public void setJobex(int jobex) {
		this.jobex = jobex;
	}

	public KumpulanUser getKumpulanUser() {
		return kumpulanUser;
	}

	public void setKumpulanUser(KumpulanUser kumpulanUser) {
		this.kumpulanUser = kumpulanUser;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public ArrayList<String> getData() {
		return data;
	}

	public void setData(ArrayList<String> data) {
		this.data = data;
	}
}
