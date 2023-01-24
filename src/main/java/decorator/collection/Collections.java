package decorator.collection;

import java.util.Collection;
import java.util.Iterator;

public class Collections {

	public static <T> Collection<T> unmodifiableCollection(Collection<T> c) {

		class UnmodifiableIteratorDecorator implements Iterator<T> {

			private final Iterator<T> wrappedIterator;

			public UnmodifiableIteratorDecorator(Iterator<T> i) {
				wrappedIterator = i;
			}

			@Override
			public boolean hasNext() {
				return wrappedIterator.hasNext();
			}

			@Override
			public T next() {
				return wrappedIterator.next();
			}
		}

		class UnmodifiableCollectionDecorator implements Collection<T> {

			private final Collection<T> wrappedCollection;

			public UnmodifiableCollectionDecorator(Collection<T> collection) {
				wrappedCollection = collection;
			}

			@Override
			public int size() {
				return wrappedCollection.size();
			}

			@Override
			public boolean isEmpty() {
				return wrappedCollection.isEmpty();
			}

			@Override
			public boolean contains(Object o) {
				return wrappedCollection.contains(o);
			}

			@Override
			public Iterator<T> iterator() {
				return new UnmodifiableIteratorDecorator(wrappedCollection.iterator());
			}

			@Override
			public Object[] toArray() {
				return wrappedCollection.toArray();
			}

			@Override
			public <T> T[] toArray(T[] a) {
				return wrappedCollection.toArray(a);
			}

			@Override
			public boolean add(T e) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean remove(Object o) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				return wrappedCollection.containsAll(c);
			}

			@Override
			public boolean addAll(Collection<? extends T> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				throw new UnsupportedOperationException();
			}

			@Override
			public void clear() {
				throw new UnsupportedOperationException();
			}

			@Override
			public boolean equals(Object o) {
				if (o == null) return false;
				if (o == this) return true;
				return wrappedCollection.equals(o);
			}

			@Override
			public int hashCode() {
				return wrappedCollection.hashCode();
			}
		}

		return new UnmodifiableCollectionDecorator(c);
	}

}
