
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mr.gos
 */
public class ctrlBoletos {
    /*private int[][] boletos = {{12, 56, 11}, {4, 5, 8}, {6, 7, 2}, {7, 8, 9}, {11, 23, 12}};
    private String[] destinos = {"Cancun", "Tula", "Tepeji", "CDMX", "Acapulco"};
    private String[] horario = {"Matutino", "Despertino", "Nocturno"};
    private int destino=0;
    private int turno=0;

    public ctrlBoletos() {

    }

    public void llenarMatriz()
    {
        for(int i=0; i<boletos.length; i++)
        {
            for(int j=0; j<boletos[0].length; j++)
            {
                boletos[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de boletos"));
            }
        }
    }
    public void llenar destinos(){
        
    }
    public String imprimirBoletos() {
        String resultado = "";
        for (int i = 0; i < boletos.length; i++) {
            for (int j = 0; j < boletos[0].length; j++) {
                resultado += boletos[i][j] + " ";
            }

            resultado += "\n";
        }
        return resultado;
    }

    public String imprimirDestino() {
        String resultado = "";
        for (int i = 0; i < destinos.length; i++) {
            resultado += destinos[i];
        }
        return resultado;
    }

    public void seleccionarDestinos() {
        int valor = -1;
        while (valor == -1) {
            String destinos = "1.Cancun\n2.CDMX\n3.Los Cabos\n4.Mazatlan\n5.Puerto Vallarta";
            String seleccion = JOptionPane.showInputDialog(null, destinos);

            switch (seleccion) {
                case "1":
                    valor = 0;
                    break;
                case "2":
                    valor = 1;
                    break;
                case "3":
                    valor = 2;
                    break;
                case "4":
                    valor = 3;
                    break;
                case "5":
                    valor = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un destino correcto");

            }
        }
        destino = valor;
    }

    public void cantidadBoletos() {
        boolean flag=true;
        int resultado=0;
        while(flag)
        {
            int cantidadBoletos=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de boletos a comprar"));
            resultado = (boletos[destino][turno]) - cantidadBoletos;
            if(verificarResta(resultado)){
                boletos[destino][turno] = resultado;
                flag=false;
            }
        }
        
    }

    public void seleccionarTurno() {
        int valor = -1;
        while (valor == -1) {
            String turno = "1.Matutino\n2.Vespertino\n3.Nocturno";
            String seleccion = JOptionPane.showInputDialog(null, turno);
            switch (seleccion) {
                case "1":
                    valor = 0;
                    break;
                case "2":
                    valor = 1;
                    break;
                case "3":
                    valor = 2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un destino correcto");

            }
        }
        turno = valor;
    }

    private boolean verificarResta(int resultado) {
        boolean flag= true;
        if (resultado < 0) {
            mensaje(!flag);
            return !flag;
        } else {
            mensaje(flag);
            return flag;
        }
    }

    private void mensaje(boolean letrero) {
        if (letrero) {
            JOptionPane.showMessageDialog(null, "Pedido exitoso!");
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficientes boletos");
        }
    }

     public boolean inicio()
    {

        JOptionPane.showMessageDialog(null,"boletos\n"+imprimirBoletos());
        seleccionarDestinos();
        seleccionarTurno();
        System.out.println(turno+" "+destino);
        cantidadBoletos();
        boolean salida=continuar();
        System.out.println(imprimirBoletos());
        return salida;
    }
    private boolean continuar() {
        boolean valor = false;
            String turno = "1.Sí\n2.No";
            String seleccion = JOptionPane.showInputDialog(null, turno);

            switch (seleccion) {
                case "1":
                    valor = true;
                    break;
                case "2":
                    valor = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opción correcta");
                    break;
            }
        return valor;
    }*/
    
    private int[][] cantidadBoletos;
    private String[] destinos;
    private String[] turnos;
    private int valorDestion;
    private int valorTurno;
    
    public ctrlBoletos(int cantidadDestino, int cantidadTurno)
    {
        destinos=new String[cantidadDestino];
        turnos=new String[cantidadTurno];
        cantidadBoletos=new int[cantidadDestino][cantidadTurno];
    }
    
    public void llenarMatrizCantidadBoletos()
    {
        for(int i=0; i<cantidadBoletos.length; i++)
        {
            for (int j=0; i<cantidadBoletos[0].length; j++)
            {
                cantidadBoletos[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de boletos"));
            }
        }
    }
    
    public void llenarDestinos()
    {
        for(int i=0; i<destinos.length; i++)
        {
            destinos[i]=JOptionPane.showInputDialog(null, "Ingrese los destinos");
        }
    }
    
    public void llenarTurnos()
    {
        for(int i=0; i<turnos.length; i++)
        {
            turnos[i]=JOptionPane.showInputDialog(null, "Ingrese el turno");
        }
    }
    
    public void seleccionarTurno()
    {
        
    }
    
}
