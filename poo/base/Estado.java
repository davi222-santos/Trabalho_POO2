package poo.base;

public enum Estado {
    Normal{
        @Override
        public void mostrarEstado(){
            System.out.println("A pista está em estado normal!\n");
        }
    },
    Erupcao_Vulcanica{
        public void mostrarEstado(){
            System.out.println("A pista está em Erupção Vulcânica!\n");
        }
    },
    Precipicio{
        public void mostrarEstado(){
            System.out.println("A pista está em um Precipício!\n");
        }
    },
    AreiaMovedica{
        public void mostrarEstado(){
            System.out.println("A pista se tornou Areia Movediça!\n");
        }
    };

    public void mostrarEstado(){
        System.out.println("<Estado da pista>");
    };
}