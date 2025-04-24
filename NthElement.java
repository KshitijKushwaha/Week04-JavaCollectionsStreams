import java.util.LinkedList;

public class NthElement{
	public static void main(String[] a){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
		int n=3;
        int ans = list.getLast() - (n - 1);
		System.out.print(ans);
	}
}