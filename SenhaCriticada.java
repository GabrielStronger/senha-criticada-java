public class SenhaCriticada {
    private String senha;

    public SenhaCriticada(String senha) {
        this.senha = senha;
    }

    public boolean isValida() {
        
        if (senha.length() < 6 || senha.length() > 8) {
            return false; 
        }

        if (senha.charAt(0) >= '0' && senha.charAt(0) <= '9') {
            return false; 
        }

        
        boolean temNumero = false;
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (c >= '0' && c <= '9') {
                temNumero = true; 
                break;
            }
        }

        return temNumero;
    }

    public static void main(String[] args) {
        String[] senhasParaTestar = {
            "Qwerty123abc", 
            "Q3abc",        
            "Qwerty12",     
            "123abcD",      
            "a23abcd",      
            "q123abcD"      
        };

        for (int i = 0; i < senhasParaTestar.length; i++) {
            SenhaCriticada senhaCriticada = new SenhaCriticada(senhasParaTestar[i]);
            boolean valida = senhaCriticada.isValida();
            if (valida) {
                System.out.println(senhasParaTestar[i] + " -> senha válida");
            } else {
                System.out.println(senhasParaTestar[i] + " -> senha inválida");
            }
        }
    }
}
