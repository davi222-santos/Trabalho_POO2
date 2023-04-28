package base;

interface IEstado {
    public void mostrarEstado();
}

public enum Estado implements IEstado {
    Normal{
        @Override
        public void mostrarEstado(){
            System.out.println("\nA pista está em estado normal!\n");
        }
    },
    Erupcao_Vulcanica{
        public void mostrarEstado(){
            System.out.println("\nA pista está em Erupção Vulcânica!\n");
        }
    },
    Precipicio{
        public void mostrarEstado(){
            System.out.println("\nA pista está em um Precipício!\n");
        }
    },
    AreiaMovedica{
        public void mostrarEstado(){
            System.out.println("\nA pista se tornou Areia Movediça!\n");
        }
    };
}