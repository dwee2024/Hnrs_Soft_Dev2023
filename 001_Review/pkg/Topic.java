package pkg;
import java.util.*;
import java.io.*;

public class Topic extends Message {

	// Default Constructor
	public Topic() {
		a = " ";
		sub = " ";
		bod = " ";
		num = 0;
	}

	// Parameterized constructor
	public Topic(String auth, String subj, String bod, int i) {
		a = auth;
		sub = subj;
		this.bod = bod;
		num = i;
	}

	// Returns if it's a reply (false)
	public boolean isReply(){
		return false;
	}
}
