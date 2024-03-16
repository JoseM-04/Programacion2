package Ejercicio_02;

public class Animal {

	String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public void moverse() {
		 System.out.println(nombre + " se esta moviendo");
	}
	
	public void comer() {
		System.out.println(nombre + " esta comiendo");
	}
	
	public void domir() {
		System.out.println(nombre + " esta durmiendo");
	}
}

class Mamifero extends Animal{
	
	public Mamifero(String nombre) {
		super(nombre);
	}
	
	public void amamantar() {
		System.out.println(nombre + " esta amamantando a sus crias");
	}
	
	public void parto() {
		System.out.println(nombre + " esta dando a luz");
	}
}

class Ave extends Animal {
	
    public Ave(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    public void construirNido() {
        System.out.println(nombre + " está construyendo un nido.");
    }
}

class Gato extends Mamifero {
    
	public Gato(String nombre) {
        super(nombre);
    }

    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }

    public void arañar() {
        System.out.println(nombre + " está arañando.");
    }
}

class Perro extends Mamifero {
    
	public Perro(String nombre) {
        super(nombre);
    }

   public  void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }

   public  void perseguirCola() {
        System.out.println(nombre + " está persiguiendo su cola.");
    }
}

class Canario extends Ave {
    
	public Canario(String nombre) {
        super(nombre);
    }

   public void cantar() {
        System.out.println(nombre + " está cantando.");
    }

    public void picotearSemillas() {
        System.out.println(nombre + " está picoteando semillas.");
    }
}

class Pinguino extends Ave {
    
	public Pinguino(String nombre) {
        super(nombre);
    }

    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

    public void deslizarse() {
        System.out.println(nombre + " está deslizándose sobre el hielo.");
    }
}

class Lagarto extends Animal {
    
	public Lagarto(String nombre) {
        super(nombre);
    }

    public void camuflarse() {
        System.out.println(nombre + " está camuflándose.");
    }

    public void tomarSol() {
        System.out.println(nombre + " está tomando el sol.");
    }
}
