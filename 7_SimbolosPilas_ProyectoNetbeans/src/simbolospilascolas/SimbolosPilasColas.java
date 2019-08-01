/* Programa que checa si las expresiones matemáticas son válidas a través de una pila
Realizado en Netbeans */
package simbolospilascolas;
public class SimbolosPilasColas {
    public static void main(String[] args) {
       String exp = "[X * ((X + Y) / {J - 3} + Y) / (4 - 2.5)]";
       String exp1 ="(5+7";
        if(ChecaBalance(exp))
            System.out.println("Expresión válida");
        else
            System.out.println("Expresión no válida");
        if(ChecaBalance(exp1))
            System.out.println("Expresión válida");
        else
            System.out.println("Expresión no válida");
    }
    public static boolean ChecaBalance(String ec){
        Pila p = new Pila();
        char[] separado = separa(ec);
        for(int i = 0; i<separado.length;i++){
            if((separado[i]=='{')||(separado[i]=='[')||(separado[i]=='(')){
              p.push(separado[i]);
            }
            else if((separado[i]=='}')||(separado[i]==']')||(separado[i]==')')){
                if((p.esVacia()||(ChecaCierre(p,separado[i])))){
                    return false;
                }
                else
                    p.pop();
            }
        }
        return p.esVacia();
    }
    public static boolean ChecaCierre(Pila p, char x){
        if(x == ')'){
            if(p.Ultimo().equals('('))
                return false;
        }
        if(x == ']'){
            if(p.Ultimo().equals('['))
                return false;
        }
        if(x == '}'){
            if(p.Ultimo().equals('{'))
                return false;
        }
        return true;
    }
    public static char[] separa(String exp){
        char[] temp = new char[exp.length()];
        for(int i = 0; i <exp.length();i++){
           temp[i] = exp.charAt(i);
       }
        return temp;
    }
}
