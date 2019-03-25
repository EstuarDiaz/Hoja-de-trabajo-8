import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorHeapTest {

	@Test
	void testAdd() {
		VectorHeap<Paciente> heap = new VectorHeap<Paciente>();
		Paciente paciente1 = new Paciente("Estuardo","Fiebre","C");
		Paciente paciente2 = new Paciente("Alejandro","Tos","B");
		Paciente paciente3 = new Paciente("Diaz","Fractura","D");
		Paciente paciente4 = new Paciente("Diaz","Fractura","B");
		heap.add(paciente1);
		heap.add(paciente2);
		heap.add(paciente3);
		heap.add(paciente4);
		// Se agregan 4 personas con distintas prioridades,
		// el paciente 2 es el de mayor prioridad que entro primero
		assertEquals(heap.getFirst(),paciente2);
	}

	@Test
	void testRemove() {
		VectorHeap<Paciente> heap = new VectorHeap<Paciente>();
		Paciente paciente1 = new Paciente("Estuardo","Fiebre","C");
		Paciente paciente2 = new Paciente("Alejandro","Tos","B");
		Paciente paciente3 = new Paciente("Diaz","Fractura","D");
		Paciente paciente4 = new Paciente("Diaz","Fractura","B");
		heap.add(paciente1);
		heap.add(paciente2);
		heap.add(paciente3);
		heap.add(paciente4);
		// Se agregan 4 personas con distintas prioridades,
		// el paciente 2 es el de mayor prioridad que entro primero
		heap.remove();
		// cuando el paciente 2 sale, le toca turno al paciente 4
		assertEquals(heap.getFirst(),paciente4);
	}

}
