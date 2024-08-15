package com.shristi.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListSeq {

	public static void main(String[] args) {
								
		List<String> seqlist = Arrays.asList("Aa","BB","CH","DD","CH","EE");
		ListIterator<String> iterseq = seqlist.listIterator();
		boolean state = iterseq.hasNext(); 
		while (state) {
			String str = iterseq.next();
			System.out.println(str);
			if(str.equals("CH")) {
				str = iterseq.previous();
//				System.out.println(str);
				iterseq.set("POPPYYYY");
			}
			state = iterseq.hasNext();
			
		}
		System.out.println(seqlist);
		
	}

}
