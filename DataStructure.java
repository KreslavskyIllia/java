public class DataStructure {

    public static void main(String[] args) {

		DirectionalList directionalList = new OneDirectionalList();
		directionalList.add("val1");
		directionalList.add("val2");
		directionalList.add("val3");
		directionalList.add("val4");

		OneDirectionalList.Node first1 = (OneDirectionalList.Node) directionalList.getFirst();

		System.out.println("OneDirectionalList");
		System.out.println(first1.getVal());
		System.out.println(first1.getNext().getVal());
		System.out.println(first1.getNext().getNext().getVal());
		System.out.println(first1.getNext().getNext().getNext().getVal());

		System.out.println("Size: " + directionalList.size());

		System.out.println("Removed? - " + directionalList.remove("val6"));
		System.out.println("Removed? - " + directionalList.remove("val3"));

		System.out.println("Size: " + directionalList.size());
		System.out.println(first1.getVal());
		System.out.println(first1.getNext().getVal());
		System.out.println(first1.getNext().getNext().getVal());

    	DirectionalList directionalList2 = new TwoDirectionalList();
    	directionalList2.add("val1");
    	directionalList2.add("val2");
    	directionalList2.add("val3");
    	directionalList2.add("val4");

    	TwoDirectionalList.Node2 first2 = (TwoDirectionalList.Node2) directionalList2.getFirst();

    	System.out.println("TwoDirectionalList");
    	System.out.println(first2.getVal());
		System.out.println(first2.getNext().getVal());
		System.out.println(first2.getNext().getNext().getVal());

		System.out.println("Size: " + directionalList2.size());

		System.out.println("Removed? - " + directionalList2.remove("val9"));
		System.out.println("Removed? - " + directionalList2.remove("val2"));

		System.out.println("Size: " + directionalList2.size());
		System.out.println(first2.getVal());
		System.out.println(first2.getNext().getVal());
		System.out.println(first2.getNext().getNext().getVal());
    }
}
