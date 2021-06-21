package com.java.bootcamp.assignment;


public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size =0;

	@Override
	public boolean add(T item) {
		if(size == items.length) {
			items = increaseArraySizeByDouble();
		}
		items[size++] = item;
		return true;
	}

	private Object[] increaseArraySizeByDouble() {
		Object[] newItems = new Object[size*2];
		int i=0;
		for(Object obj:items) {
			newItems[i++] = obj;
		}
		
		return newItems;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index){
		try {
			return (T) items[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Please provide a Valid! index.");
		}
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if(index > size) {
			throw new IndexOutOfBoundsException("Index is out of bound. Index:" + index +" Size:"+size);
		}
		
		if(size == items.length) {
			items = increaseArraySizeByDouble();
		}
		

		for(int i = size-1; i>=index; i--) {
			// System.out.println(items[i] +"=="+items[i+1]);
			items[i+1] = items[i];
		}
		items[index] = item;
		size++;
		
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(index > size) {
			throw new IndexOutOfBoundsException("Index is out of bound. Index:" + index +" Size:"+size);
		}
		
		for(int i = index; i < getSize()-1; i++) {
			items[i] = items[i+1];
		}
		size--;
		return (T) items[index];
	}
	
	
}
