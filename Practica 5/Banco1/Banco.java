public class Banco {

    public static void Cuentas(){
    int opc;
    General [] BK = new General[10];//Maximo 10 personas en el banco
    int cont = 4; //Cuanta el num de cuentas que ya existen para llevar control, 4 porque ya se inicializo hasta la 4
    User.cuentasPreD(BK);
    do{
        opc = Menus.Principal();            

        switch(opc){

            case '1':
                cont++;
                NewUser.generaUser(BK, cont);
                NewUser.mostrarDatos(BK, cont);
                break;

            case '2':
                
                break;

            case '3':
                System.out.println("Saliendo del programa...");
                System.out.print("Presione ENTER para continuar...");
                sc.nextLine();
                break;

            default:
                break;
        }
    }

}
