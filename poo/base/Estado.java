package poo.base;

public enum Estado {
    Normal{
        @Override
        public void getEstado(){
            System.out.println("A pista está em estado normal\n");
        }
    },
    Erupcao_Vulcanica{
        public void getEstado(){
            System.out.println("A pista está em estado normal\n");
        }
    },
    Precipicio{
        public void getEstado(){
            System.out.println("A pista está em estado normal\n");
        }
    },
    AreiaMovedica{
        public void getEstado(){
            System.out.println("A pista está em estado normal\n");
        }
    };

    public void getEstado(){
        System.out.println("<Estado da pista>");
    };
}