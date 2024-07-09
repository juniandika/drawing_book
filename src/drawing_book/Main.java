package drawing_book;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner scan = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int limit_page = scan.nextInt();
		scan.nextLine();
		int target_page = scan.nextInt();
		scan.nextLine();
		Vector<Page> list = new Vector<Page>();
		
		for (int i = 0; i < limit_page + 1; i++) {
			if (i == 0) {
				Page page = new Page(i, i+1);
				list.add(page);
			} else if (i%2 == 0) {
				Page page = new Page(i, i+1);
				list.add(page);
			}
		}
		
		int start_count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (target_page == list.get(i).getFirst_page() || 
				target_page == list.get(i).getLast_page()) {
				break;
			}
			start_count++;
		}
		
		int last_count = 0;
		for (int i = list.size()-1; i > 0; i--) {
			System.out.println("Index " + i);
			if (target_page == list.get(i).getFirst_page() || 
					target_page == list.get(i).getLast_page()) {
				break;
			}
			last_count++;
		}
		
		int result_count = (start_count <= last_count) ? start_count : last_count;
		
		System.out.println(result_count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
