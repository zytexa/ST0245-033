/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taller01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author julianrojasgallego
 */

public class Fecha {
	private int dia,
	mes,
	año;
	public Fecha(int dia, int mes, int año) {
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia=dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes=mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año=año;
	}
	public String get_FechaStr(Fecha f) throws ParseException {
		String fecha=String.valueOf(f.getDia())+"/"+String.valueOf(f.getMes())+"/"+String.valueOf(f.getAño());
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
		Date fecha_1=formatter1.parse(fecha);
		int dia=fecha_1.getDate();
		int mes=f.VerMes(f);
		int año=f.VerAño(f);
		String fechastr=String.valueOf(dia)+" del "+String.valueOf(año);
		return fechastr;
	}
	public int VerDia(Fecha f) throws ParseException {
		String fecha=String.valueOf(f.getDia())+"/"+String.valueOf(f.getMes())+"/"+String.valueOf(f.getAño());
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
		Date fecha_1=formatter1.parse(fecha);
		//variable que almacena el número del día
		int dia=fecha_1.getDate();
		//variable que almacena el nombre del día
		int dia_2=fecha_1.getDay();
		switch(dia_2) {
			case 0: System.out.print("Domingo");
			break;
			case 1: System.out.print("Lunes");
			break;
			case 2: System.out.print("Martes");
			break;
			case 3: System.out.print("Miércoles");
			break;
			case 4: System.out.print("Jueves");
			break;
			case 5: System.out.print("Viernes");
			break;
			case 6: System.out.print("Sabado");
			break;
			default: System.out.print("no");
			break;
		}
		return dia;
	}
	public int VerMes(Fecha f) throws ParseException {
		String fecha=String.valueOf(f.getDia())+"/"+String.valueOf(f.getMes())+"/"+String.valueOf(f.getAño());
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
		Date fecha_1=formatter1.parse(fecha);
		//variable que almacena el número del mes
		int mes=fecha_1.getMonth();
		switch(mes) {
			case 0: System.out.print("Enero");
			break;
			case 1: System.out.print("Febrero");
			break;
			case 2: System.out.print("Marzo");
			break;
			case 3: System.out.print("Abril");
			break;
			case 4: System.out.print("Mayo");
			break;
			case 5: System.out.print("Junio");
			break;
			case 6: System.out.print("Julio");
			break;
			case 7: System.out.print("Agosto");
			break;
			case 8: System.out.print("Septiembre");
			break;
			case 9: System.out.print("Octubre");
			break;
			case 10: System.out.print("Noviembre");
			break;
			case 11: System.out.print("Diciembre");
			break;
			default: System.out.println("");
			break;
		}
		return mes;
	}
	public int VerAño(Fecha f) throws ParseException {
		String fecha=String.valueOf(f.getDia())+"/"+String.valueOf(f.getMes())+"/"+String.valueOf(f.getAño());
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
		Date fecha_1=formatter1.parse(fecha);
		//variable que almacena el número del año
		int año=fecha_1.getYear();
		return año+1900;
	}
	public boolean Iguales(Fecha f) throws ParseException {
		boolean resultado=false;
		if(f.getAño()==this.año && f.getMes()==this.mes && f.getDia()==this.dia) {
			System.out.println("las fechas son iguales");
			resultado=true;
		}
		return resultado;
	}
	public void CompararFecha(Fecha f) throws ParseException {
		if(f.getAño() > this.año || f.getMes() > this.mes || f.getDia() > this.dia) {
			System.out.println(" fecha 1 es primero que la fecha 2");
		}
		else {
			if(f.getAño() < this.año || f.getMes() < this.mes || f.getDia() < this.dia) {
				System.out.println(" fecha 2 es primero que la fecha 1");
			}
			else {
				this.Iguales(f);
			}
			;
		}
	}
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) throws ParseException {
		Fecha fecha=new Fecha(05, 11, 2012);
		Fecha fecha2=new Fecha(05, 11, 2022);
		System.out.println(" "+fecha.get_FechaStr(fecha));
		System.out.println(" "+fecha.VerDia(fecha));
		System.out.println(" mes No.: " + fecha.VerMes(fecha));
		System.out.println(" año: " + fecha.VerAño(fecha));
		fecha.CompararFecha(fecha2);
	}
}