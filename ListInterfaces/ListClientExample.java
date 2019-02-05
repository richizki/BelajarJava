/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListInterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bangadam
 */
public class ListClientExample {
	// deklarasi Interface List
	private List list;

	// COnstructor dari class ListClientExample
//	public ListClientExample() {
//		ArrayList<String> list = new ArrayList();
//	}
        
        // Memembuat method dengan mendapatkan data dari List
	private List getList() {
		return list;
	}
        
	public static void main(String[] args) {
//		ListClientExample ice = new ListClientExample();
//		System.out.println(list);
            LinkedList<String> turism = new LinkedList<String>();
             //add elements to LinkedList
             turism.add("JEMBATAN AMPERA");
             turism.add("BENTENG KUTO BESAK");
             turism.add("KAMBANG IWAK");
             turism.add("PUNTI KAYU");
             turism.add("AIR TERJUN BEDEGUM");
             turism.add("SUNGAI MUSI");
             
             System.out.println(turism);
	}
}
