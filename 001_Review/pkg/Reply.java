package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {

	// Default Constructor
	public Reply() {
		a = " ";
		sub = " ";
		bod = " ";
		num = 0;
	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		a = auth;
		sub = subj;
		this.bod = bod;
		num = i;
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
