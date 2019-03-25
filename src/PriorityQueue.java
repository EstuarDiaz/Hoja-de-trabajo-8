public interface PriorityQueue<E extends Comparable<E>>
{
	/**
	 * Devuelve el elemento con mayor prioridad en la cola
	 */
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	/**
	 * Devuelve el elemento con menor valor (mayor prioridad) y lo quita del heap
	 */
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	/**
	 * Agrega un valor al heap, segun prioridad y orden de entrada
	 */
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	/**
	 * Chequear si el heap tiene elementos
	 * @return boolean true si y solo si el heap no tiene elementos
	 */
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	/**
	 * Obtener el tamanio del heap
	 * @return int tamanio
	 */
	public int size();
	// post: returns number of elements within queue
	
	/**
	 * Borrar todos los elementos del heap
	 */
	public void clear();
	// post: removes all elements from queue
}