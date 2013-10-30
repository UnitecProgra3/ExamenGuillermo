/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exmanetest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Calendar;

/**
 *
 * @author Guillermo Sandoval
 */
public class ExmaneTest {

    protected RandomAccessFile clientes;
    protected RandomAccessFile revision;

    public ExmaneTest() {
        try {
            crearDir();
            clientes = new RandomAccessFile("Examen/clientes.rev", "rw");
            revision = new RandomAccessFile("Examen/revision.rev", "rw");
        } catch (IOException a) {
            System.out.println("Erro" + a.getMessage());

        }
    }

    public void crearDir() throws IOException {
        File dir = new File("Examen");
        dir.mkdir();

    }

    public long Buscar(int cod) throws IOException {
        clientes.seek(0);
        while (clientes.getFilePointer() < clientes.length()) {
            long pos = clientes.getFilePointer();
            int busca = clientes.readInt();
            if (cod == busca) {
                return pos;
            }
            clientes.readUTF();
            clientes.readDouble();
        }
        return -1;
    }

    public boolean agregarCliente(int codigo, String nombre) throws IOException {
        if (Buscar(codigo) != -1) {
            clientes.seek(clientes.length());
            clientes.writeInt(codigo);
            clientes.writeUTF(nombre);
            clientes.writeInt(0);
            return true;
        }
        return false;
    }

    public boolean generarRevision(int codCliente, double montoPagar) throws IOException {
        if (Buscar(codCliente) > -1) {
            revision.seek(revision.length());
            revision.writeInt(codCliente);
            Calendar c = Calendar.getInstance();
            long fecha = c.getTimeInMillis();
            revision.writeLong(fecha);
            revision.writeDouble(montoPagar);
            clientes.readInt();
            clientes.readUTF();
            int km = clientes.readInt();
            clientes.seek(clientes.getFilePointer() - 4);
            clientes.writeInt(km + 500);

            return true;
        }
        System.out.println("EL CLIENTE NO EXISTE");
        return false;
    }

    public void historicoRevision(int codCodigo) throws IOException {
        revision.seek(0);
        double acumulado = 0;

        while (revision.getFilePointer() < revision.length()) {
            int cod = revision.readInt();
            long date = revision.readLong();
            double monto = revision.readDouble();

            if (cod == codCodigo) {
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(date);
                System.out.println("el codigo de cliente" + cod + "tuvo revision el la fecha " + c.getTime() + " con un monto de " + monto);
                acumulado = monto; }
            if (revision.getFilePointer() == revision.length()) {
                System.out.println("EL MONTO TOTAL DE TODAS LA REVISIONES ES DE " + acumulado);
            }
            if(monto==0){
                System.out.println("el codigo no existe ");
            }
        }
    }
    public void backup( String txtFile ) throws IOException{
        clientes.seek(0);
        FileWriter fw = new FileWriter(txtFile);
        fw.write("CLIENTES\n------------\n");
        
        while( clientes.getFilePointer() < clientes.length() ){
            int cod = clientes.readInt();
            String n = clientes.readUTF();
           int kms = clientes.readInt();
            
            fw.write(cod + "-" + n + "-" + kms + "\n");
        }
        
        revision.seek(0);
        fw.write("REVISIONES\n-----------------\n");
        
        while( revision.getFilePointer() < revision.length()){
            String cod = revision.readUTF();
            int client = revision.readInt();
            double monto = revision.readDouble();
            
            fw.write(cod + "-" + client + "-" + monto + "\n");
        }
        
        fw.close();
    }

}
