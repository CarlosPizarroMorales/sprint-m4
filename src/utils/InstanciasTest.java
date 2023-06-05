package utils;

import java.time.LocalDate;
import java.time.LocalTime;

import entities.*;
import main.Main;

/**
 * Clase que contiene objetos para testear el funcionamiento 
 * de parte de la funcionalidad del proyecto. 
 */
public abstract class InstanciasTest {
	//_________________REVISIONES__________________
	public static Revision revision01 = new Revision("101", "Revisión 1", "Detalles de la revisión 1", (byte) 1);
	public static Revision revision02 = new Revision("102", "Revisión 2", "Detalles de la revisión 2", (byte) 2);
	public static Revision revision03 = new Revision("103", "Revisión 3", "Detalles de la revisión 3", (byte) 3);
	public static Revision revision04 = new Revision("104", "Revisión 4", "Detalles de la revisión 4", (byte) 1);
	public static Revision revision05 = new Revision("105", "Revisión 5", "Detalles de la revisión 5", (byte) 2);
	public static Revision revision06 = new Revision("106", "Revisión 6", "Detalles de la revisión 6", (byte) 3);
	public static Revision revision07 = new Revision("107", "Revisión 7", "Detalles de la revisión 7", (byte) 1);
	public static Revision revision08 = new Revision("108", "Revisión 8", "Detalles de la revisión 8", (byte) 2);
	public static Revision revision09 = new Revision("109", "Revisión 9", "Detalles de la revisión 9", (byte) 3);
	public static Revision revision10 = new Revision("110", "Revisión 10", "Detalles de la revisión 10", (byte) 1);
	//___________________VISITAS___________________
	public static Visita visita01 = new Visita("09:00", "Lugar 1", "Comentarios de la visita 1", revision01, "123456789", LocalDate.now());
	public static Visita visita02 = new Visita("10:00", "Lugar 2", "Comentarios de la visita 2", revision02, "987654321", LocalDate.now());
	public static Visita visita03 = new Visita("11:00", "Lugar 3", "Comentarios de la visita 3", revision03, "456789123", LocalDate.now());
	public static Visita visita04 = new Visita("12:00", "Lugar 4", "Comentarios de la visita 4", revision04, "321654987", LocalDate.now());
	public static Visita visita05 = new Visita("13:00", "Lugar 5", "Comentarios de la visita 5", revision05, "987123456", LocalDate.now());
	public static Visita visita06 = new Visita("14:00", "Lugar 6", "Comentarios de la visita 6", revision06, "789456123", LocalDate.now());
	public static Visita visita07 = new Visita("15:00", "Lugar 7", "Comentarios de la visita 7", revision07, "456987123", LocalDate.now());
	public static Visita visita08 = new Visita("16:00", "Lugar 8", "Comentarios de la visita 8", revision08, "123789456", LocalDate.now());
	public static Visita visita09 = new Visita("17:00", "Lugar 9", "Comentarios de la visita 9", revision09, "654123789", LocalDate.now());
	public static Visita visita10 = new Visita("18:00", "Lugar 10", "Comentarios de la visita 10", revision10, "987321654", LocalDate.now());
	//_________________ACCIDENTES__________________
	public static Accidente ac01 = new Accidente("123456789", LocalDate.of(2023, 5, 10), "09:30", "Calle Principal", "Conducción distraída", "Lesiones leves");
	public static Accidente ac02 = new Accidente("987654321", LocalDate.of(2023, 6, 1), "14:15", "Avenida Central", "Exceso de velocidad", "Daños materiales");
	public static Accidente ac03 = new Accidente("456789123", LocalDate.of(2023, 4, 20), "18:45", "Calle Secundaria", "Falla mecánica", "Lesiones graves");
	public static Accidente ac04 = new Accidente("789123456", LocalDate.of(2023, 3, 5), "11:00", "Carretera Principal", "Conducción bajo los efectos del alcohol", "Lesiones graves");
	public static Accidente ac05 = new Accidente("321654987", LocalDate.of(2023, 2, 15), "16:30", "Avenida Norte", "Falta de señalización", "Daños materiales");
	public static Accidente ac06 = new Accidente("654987321", LocalDate.of(2023, 1, 10), "08:45", "Calle Este", "Exceso de velocidad", "Daños materiales");
	public static Accidente ac07 = new Accidente("987321654", LocalDate.of(2023, 6, 3), "20:00", "Calle Oeste", "Falla mecánica", "Lesiones leves");
	public static Accidente ac08 = new Accidente("123789456", LocalDate.of(2023, 5, 25), "13:15", "Avenida Sur", "Conducción distraída", "Daños materiales");
	public static Accidente ac09 = new Accidente("456123789", LocalDate.of(2023, 4, 8), "10:30", "Carretera Secundaria", "Falta de señalización", "Lesiones leves");
	public static Accidente ac10 = new Accidente("789456123", LocalDate.of(2023, 3, 18), "17:45", "Avenida Este", "Conducción bajo los efectos de drogas", "Lesiones graves");
	//_______________ADMINISTRATIVO________________
	public static Administrativo admin0 = new Administrativo("Isabel", "Ramírez", LocalDate.of(1997, 10, 7), "90123436-7", "Asistente de Recursos Humanos", "Recursos Humanos");
	public static Administrativo admin1 = new Administrativo("Juan", "Pérez", LocalDate.of(1990, 5, 15), "12345678-3", "Asistente Administrativo", "Recursos Humanos");
	public static Administrativo admin2 = new Administrativo("María", "González", LocalDate.of(1985, 9, 20), "98765432-3", "Secretaria Ejecutiva", "Ventas");
	public static Administrativo admin3 = new Administrativo("Carlos", "López", LocalDate.of(1992, 3, 10), "23456780-0", "Asistente Contable", "Finanzas");
	public static Administrativo admin4 = new Administrativo("Laura", "Rodríguez", LocalDate.of(1998, 7, 8), "34567800-1", "Asistente de Recursos Humanos", "Recursos Humanos");
	public static Administrativo admin5 = new Administrativo("Pedro", "Martínez", LocalDate.of(1991, 11, 25), "45778901-2", "Asistente de Ventas", "Ventas");
	public static Administrativo admin6 = new Administrativo("Ana", "Sánchez", LocalDate.of(1987, 2, 5), "46789012-3", "Secretaria de Gerencia", "Gerencia");
	public static Administrativo admin7 = new Administrativo("Luis", "Fernández", LocalDate.of(1995, 4, 18), "67290123-4", "Asistente Administrativo", "Recursos Humanos");
	public static Administrativo admin8 = new Administrativo("Sofía", "Hernández", LocalDate.of(1993, 8, 12), "78701234-5", "Asistente Contable", "Finanzas");
	public static Administrativo admin9 = new Administrativo("Javier", "Torres", LocalDate.of(1989, 6, 30), "80012345-6", "Secretario Ejecutivo", "Ventas");
	//________________PROFESIONAL___________________
	public static Profesional p01 = new Profesional("Juan", "Pérez", LocalDate.of(1990, 5, 15), "12245678-9", "Ingeniero", LocalDate.of(2015, 10, 1));
	public static Profesional p02 = new Profesional("María", "Gómez", LocalDate.of(1985, 8, 20), "98765432-4", "Arquitecta", LocalDate.of(2010, 6, 15));
	public static Profesional p03 = new Profesional("Carlos", "López", LocalDate.of(1992, 3, 10), "45678901-3", "Abogado", LocalDate.of(2017, 9, 30));
	public static Profesional p04 = new Profesional("Laura", "Rodríguez", LocalDate.of(1988, 7, 8), "54321098-7", "Psicóloga", LocalDate.of(2012, 3, 25));
	public static Profesional p05 = new Profesional("Andrés", "Hernández", LocalDate.of(1995, 2, 12), "78901231-5", "Contador", LocalDate.of(2019, 12, 10));
	public static Profesional p06 = new Profesional("Ana", "Torres", LocalDate.of(1991, 11, 18), "43210987-6", "Médica", LocalDate.of(2016, 8, 5));
	public static Profesional p07 = new Profesional("Pedro", "Sánchez", LocalDate.of(1987, 9, 25), "87654321-0", "Diseñador", LocalDate.of(2011, 5, 20));
	public static Profesional p08 = new Profesional("Sofía", "González", LocalDate.of(1993, 4, 6), "90123456-3", "Ingeniera Industrial", LocalDate.of(2018, 11, 15));
	public static Profesional p09 = new Profesional("Diego", "Martínez", LocalDate.of(1989, 1, 3), "66890123-4", "Economista", LocalDate.of(2013, 7, 30));
	public static Profesional p10 = new Profesional("Carolina", "Vargas", LocalDate.of(1994, 6, 28), "34367890-1", "Periodista", LocalDate.of(2020, 4, 1));
	//________________CAPACITACION__________________
	public static Capacitacion c01 = new Capacitacion("12345668-9", "Lunes", LocalTime.of(9, 0), LocalDate.of(2023, 6, 5), "Sala A", 2.5f, 20);
	public static Capacitacion c10 = new Capacitacion("12345678-8", "Lunes", LocalTime.parse("00:12", Validate.HORA_FORMAT), LocalDate.parse("12/12/1965", Validate.FECHA_FORMAT), "Sala A", 2.5f, 20);
	public static Capacitacion c02 = new Capacitacion("98765432-2", "Martes", LocalTime.of(14, 30), LocalDate.of(2023, 6, 6), "Sala B", 3.0f, 15);
	public static Capacitacion c03 = new Capacitacion("45678912-3", "Miércoles", LocalTime.of(11, 0), LocalDate.of(2023, 6, 7), "Sala C", 1.5f, 10);
	public static Capacitacion c04 = new Capacitacion("78912345-6", "Jueves", LocalTime.of(16, 0), LocalDate.of(2023, 6, 8), "Sala D", 4.0f, 30);
	public static Capacitacion c05 = new Capacitacion("32165498-7", "Viernes", LocalTime.of(10, 30), LocalDate.of(2023, 6, 9), "Sala E", 2.5f, 25);
	public static Capacitacion c06 = new Capacitacion("65498732-1", "Sábado", LocalTime.of(8, 0), LocalDate.of(2023, 6, 10), "Sala F", 3.0f, 18);
	public static Capacitacion c07 = new Capacitacion("98732165-4", "Domingo", LocalTime.of(13, 0), LocalDate.of(2023, 6, 11), "Sala G", 2.0f, 12);
	public static Capacitacion c08 = new Capacitacion("12378945-6", "Lunes", LocalTime.of(15, 30), LocalDate.of(2023, 6, 12), "Sala H", 4.5f, 28);
	public static Capacitacion c09 = new Capacitacion("45612378-9", "Martes", LocalTime.of(12, 0), LocalDate.of(2023, 6, 13), "Sala I", 1.0f, 8);
	//__________________CLIENTE____________________
	public static Cliente cl01 = new Cliente("Juan", "Pérez", LocalDate.of(1990, 5, 15), 		"12345668-9", "Calle 123", "Santiago", "+56912345678", 33, "AFP Provida", 1, 			visita01, ac01, c01);
	public static Cliente cl02 = new Cliente("María", "López", LocalDate.of(1985, 10, 20), 		"12345678-8", "Avenida 456", "Valparaíso", "+56998765432", 38, "AFP Cuprum", 2, 		visita02, ac02, c02);
	public static Cliente cl03 = new Cliente("Pedro", "González", LocalDate.of(1995, 2, 8), 	"98765432-2", "Calle 789", "Concepción", "+56923456789", 28, "AFP Modelo", 1, 		visita03, ac03, c03);
	public static Cliente cl04 = new Cliente("Carolina", "Sánchez", LocalDate.of(1983, 7, 12), 	"45678912-3", "Avenida 1234", "La Serena", "+56934567890", 40, "AFP Habitat", 2, visita04, ac04, c04);
	public static Cliente cl05 = new Cliente("Andrés", "Torres", LocalDate.of(1998, 9, 25), 	"78912345-6", "Calle 5678", "Rancagua", "+56945678901", 25, "AFP PlanVital", 1, 	visita05, ac05, c05);
	public static Cliente cl06 = new Cliente("Laura", "Martínez", LocalDate.of(1992, 12, 2), 	"32165498-7", "Avenida 5678", "Antofagasta", "+56956789012", 31, "AFP Capital", 2, visita06, ac06, c06);
	public static Cliente cl07 = new Cliente("Roberto", "Ruiz", LocalDate.of(1980, 4, 30), 		"65498732-1", "Calle 910", "Viña del Mar", "+56967890123", 43, "AFP ProVida", 1, 	visita07, ac07, c07);
	public static Cliente cl08 = new Cliente("Ana", "Gómez", LocalDate.of(1997, 6, 18), 		"98732165-4", "Avenida 8910", "Talca", "+56978901234", 26, "AFP Cuprum", 2, 			visita08, ac08, c08);
	public static Cliente cl09 = new Cliente("Ricardo", "Hernández", LocalDate.of(1991, 8, 7), 	"12378945-6", "Calle 1112", "Arica", "+56989012345", 32, "AFP Habitat", 1, 		visita09, ac09, c09);
	public static Cliente cl10 = new Cliente("Fernanda", "Torres", LocalDate.of(1987, 3, 14), 	"45612378-9", "Avenida 1314", "Puerto Montt", "+56990123456", 36, "AFP Modelo", 2,visita10, ac10, c10);
	                                                                                             
	/*
	 * Las instancias creadas como campos de la clase ahora son utilizadas
	 * para llenar los campos Contenedor.usuarios y Contenedor.capacitaciones
	 */
	public static void cargarData() {
		//_________________REVISIONES__________________
		/*
		 * estan asociadas a Visitas en relación 
		 * Revision N..1 Visita por lo tanto se cargan
		 * en el momento de crear instancias de Cliente
		 */
		//___________________VISITAS___________________
		/*
		 * tienen que estar asociados a un rut Cliente,
		 * en relación Cliente 1..N Visita por lo tanto
		 * se cargan en un campo de Cliente.visitas
		 */
		//_________________ACCIDENTES__________________
		/*
		 * tienen que estar asociados a un rut Cliente,
		 * en relación Cliente 0..N Accidente por lo tanto
		 * se cargan en un campo de Cliente.accidentes
		 */
		//__________________CLIENTE____________________
		Main.listados.almacenarCliente(cl01);
		Main.listados.almacenarCliente(cl02);
		Main.listados.almacenarCliente(cl03);
		Main.listados.almacenarCliente(cl04);
		Main.listados.almacenarCliente(cl05);
		Main.listados.almacenarCliente(cl06);
		Main.listados.almacenarCliente(cl07);
		Main.listados.almacenarCliente(cl08);
		Main.listados.almacenarCliente(cl09);
		Main.listados.almacenarCliente(cl10);
		//_______________ADMINISTRATIVO________________
		Main.listados.almacenarAdministrativo(admin0);
		Main.listados.almacenarAdministrativo(admin1);
		Main.listados.almacenarAdministrativo(admin2);
		Main.listados.almacenarAdministrativo(admin3);
		Main.listados.almacenarAdministrativo(admin4);
		Main.listados.almacenarAdministrativo(admin5);
		Main.listados.almacenarAdministrativo(admin6);
		Main.listados.almacenarAdministrativo(admin7);
		Main.listados.almacenarAdministrativo(admin8);
		Main.listados.almacenarAdministrativo(admin9);
		//________________PROFESIONAL___________________
		Main.listados.almacenarProfesional(p01);
		Main.listados.almacenarProfesional(p02);
		Main.listados.almacenarProfesional(p03);
		Main.listados.almacenarProfesional(p04);
		Main.listados.almacenarProfesional(p05);
		Main.listados.almacenarProfesional(p06);
		Main.listados.almacenarProfesional(p07);
		Main.listados.almacenarProfesional(p08);
		Main.listados.almacenarProfesional(p09);
		Main.listados.almacenarProfesional(p10);
		//________________CAPACITACION__________________
		Main.listados.almacenarCapacitacion(c01);
		Main.listados.almacenarCapacitacion(c02);
		Main.listados.almacenarCapacitacion(c03);
		Main.listados.almacenarCapacitacion(c04);
		Main.listados.almacenarCapacitacion(c05);
		Main.listados.almacenarCapacitacion(c06);
		Main.listados.almacenarCapacitacion(c07);
		Main.listados.almacenarCapacitacion(c08);
		Main.listados.almacenarCapacitacion(c09);
		Main.listados.almacenarCapacitacion(c10);
	}
}
