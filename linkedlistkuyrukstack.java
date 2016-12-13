public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack=new Stack<String>();
		stack.push("Selam");
		stack.push("Naber");
		Iterator<String> itr=stack.listIterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
		System.out.println("Son eleman : " + stack.peek());
		Queue<String> kuyruk=new LinkedList<String>();
		kuyruk.offer("Hanife");
		kuyruk.offer("Kurnaz");
		System.out.println(kuyruk);
		System.out.println("İlk eleman : " + kuyruk.poll());
		LinkedList<Integer> liste=new LinkedList<Integer>();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		System.out.println("İlk eleman : " + liste.getFirst());
		Iterator<Integer> itr2=liste.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}	
	}
}
