package utils;

public abstract class Show {
	
	//______________________________ESTILOS___________________________________
	public static final String FONT_GREEN = "\u001B[32m";
	public static final String RESET =		 "\u001B[0m";
	public static final String BG_BLACK =	 "\u001B[40m";
	public static final String BG_BLUE =	 "\u001B[44m";
	//___________________________USER MESSAGES________________________________
	private static final String CREATE_GENERAL =	 				"\nIngrese los datos siguiendo la indicación correspondiente a cada campo.";
	private static final String CREATE_WRONG_FIELD =	 			"\nIngrese el dato siguiendo las indicaciones";
	private static final String SEARCH_DOESNT_EXISTS =	 		"\nNo se han encontrado usuarios bajo el criterio.";
	private static final String CLIENTE_DOESNT_EXISTS =			"\nNo existen usuarios de tipo Cliente registrados bajo ese rut";
 	private static final String USER_EXISTS = 						"\nEl rut ingresado ya existe.";
	private static final String DELETE_USER = 						"\nRUT USUARIO______________Ingrese el rut de un usuario registrado________";
	private static final String DELETE_USER_OK = 					"\nEl usuario ha sido eliminado exitosamente.";
	private static final String CREATE_NOMBRES = 					"\nNOMBRES__________________obligatorio, entre 5 y 30 caracteres___________";
	private static final String CREATE_APELLIDOS = 				"\nAPELLIDOS________________obligatorio, entre 5 y 30 caracteres___________";
	private static final String CREATE_RUN = 						"\nRUN______________________obligatorio, formato 11111111-1________________";
	private static final String CREATE_FECHA_NAC = 				"\nFECHA DE NACIMIENTO______obligatorio, formato DD/MM/AAAA________________";
	private static final String CREATE_CLIENTE_TELEFONO = 		"\nTELEFONO_________________obligatorio, formato +56912345678______________";
	private static final String CREATE_CLIENTE_AFP = 				"\nAFP______________________no obligatorio, entre 4 y 30 caracteres________";
	private static final String CREATE_CLIENTE_SALUD = 			"\nSISTEMA DE SALUD_________no obligatorio, [1]FONASA - [2]Isapre__________";
	private static final String CREATE_CLIENTE_DIRECCION =		"\nDIRECCIÓN________________no obligatorio, hasta 70 caracteres____________";
	private static final String CREATE_CLIENTE_COMUNA = 			"\nCOMUNA___________________no obligatorio, hasta 50 caracteres____________";
	private static final String CREATE_CLIENTE_EDAD = 			"\nEDAD_____________________no obligatorio, máximo: 150____________________";
	private static final String CREATE_PROFESIONAL_TITULO = 		"\nTÍTULO___________________obligatorio, entre 10 y 50 caracteres__________";
	private static final String CREATE_PROFESIONAL_INGRESO =		"\nFECHA DE INGRESO_________no obligatorio, formato DD/MM/AAAA)____________";
	private static final String CREATE_ADMINISTRATIVO_AREA = 		"\nAREA_____________________obligatorio, entre 5 y 20 caracteres___________";
	private static final String CREATE_ADMINISTRATIVO_EXPERIEN = "\nEXPERIENCIA______________no obligatorio, hasta 100 caracteres___________";
	private static final String CREATE_CAPACITACION_RUT_CLTE =	"\nRUT CLIENTE______________Ingrese el rut de un cliente registrado________";
	private static final String CREATE_CAPACITACION_DIA =			"\nDÍA______________________en palabras, entre lunes y domingo_____________";
	private static final String CREATE_CAPACITACION_FECHA =		"\nFECHA____________________obligatorio, formato DD/MM/AAAA________________";
	private static final String CREATE_CAPACITACION_HORA =		"\nHORA_____________________no obligatorio, entre 00:00 y 23:59____________";
	private static final String CREATE_CAPACITACION_LUGAR =	 	"\nLUGAR____________________obligatorio, entre 10 y 50 caracteres__________";
	private static final String CREATE_CAPACITACION_DURACION = 	"\nDURACIÓN_________________no obligatorio, hasta 70 caracteres____________";
	private static final String CREATE_CAPACITACION_ASISTENTES = "\nCANT. ASISTENTES_________obligatorio, hasta 1000 caracteres_____________";
	private static final String CREATE_ACCIDENTE_RUT_CLTE =		"\nRUT CLIENTE______________Ingrese el rut de un cliente registrado________";
	private static final String CREATE_ACCIDENTE_FECHA =			"\nFECHA____________________no obligatorio, formato DD/MM/AAAA_____________";
	private static final String CREATE_ACCIDENTE_HORA =			"\nHORA_____________________no obligatorio, entre 00:00 y 23:59____________";
	private static final String CREATE_ACCIDENTE_LUGAR =			"\nLUGAR____________________obligatorio, entre 10 y 50 caracteres__________";
	private static final String CREATE_ACCIDENTE_ORIGEN =			"\nORIGEN___________________no obligatorio, hasta 100 caracteres___________";
	private static final String CREATE_ACCIDENTE_CONSECUENCIAS =	"\nCONSECUENCIAS____________no obligatorio, hasta 100 caracteres___________";
	private static final String CREATE_VISITA_RUT_CLIENTE =		"\nRUT CLIENTE______________Ingrese el rut de un cliente registrado________";
	private static final String CREATE_VISITA_FECHA =				"\nFECHA____________________no obligatorio, formato DD/MM/AAAA_____________";
	private static final String CREATE_VISITA_HORA =				"\nHORA_____________________no obligatorio, entre 00:00 y 23:59____________";
	private static final String CREATE_VISITA_LUGAR =				"\nLUGAR____________________obligatorio, entre 10 y 50 caracteres__________";
	private static final String CREATE_VISITA_COMENTARIOS =		"\nCOMENTARIOS______________no obligatorio, hasta 100 caracteres___________";
	private static final String CREATE_REVISION_ID_VISITA =		"\nID. VISITA_______________ingrese ID válido, en formato \"vis-0000\"_______";
	private static final String CREATE_REVISION_ASUNTO =			"\nASUNTO___________________obligatorio, entre 10 y 50 caracteres__________";
	private static final String CREATE_REVISION_DETALLE =			"\nDETALLE__________________no obligatorio, hasta 100 caracteres___________";
	private static final String CREATE_REVISION_ESTADO =			"\nESTADO__no obligatorio [1]Sin problemas [2]Con observaciones [3]No aprueba__";
	private static final String SELECT_CATEGORY = 					"\nSeleccione [1] Cliente [2] Profesional [3] Administrativo";
	//____________________CAMBIAR ESTILOS DE PRESENTACIÓN DE MENSAJES________________
	public static void style(String kind) {
		switch(kind) {
			case "fontGreen":
				System.out.print(FONT_GREEN);
				break;
			case "bgBlue":
				System.out.print(BG_BLUE);
				break;
			case "reset":
				System.out.print(RESET);
				break;
		}
	}
	
	//____________________MOSTRAR MENSAJES DE AYUDA AL USUARIO________________
	public static void guide(String kind) {
		switch (kind) {
			case "createGeneral":									// Comienzo creación
				System.out.println(CREATE_GENERAL);
				break;
			case "createWrongField":								// Creación ingreso erróneo
				System.out.println(CREATE_WRONG_FIELD);
				break;
			case "usuarioNoExiste":									// Usuario no ha sido encontrado
				System.out.println(SEARCH_DOESNT_EXISTS);
				break;
			case "usuarioYaExiste":									// El usuario ya existe
				System.out.println(USER_EXISTS);
				break;
			case "rutNoCliente":									// Cliente no existe
				System.out.println(CLIENTE_DOESNT_EXISTS);
				break;
			case "deleteUsuario":									// Eliminar usuario
				System.out.println(DELETE_USER);
				break;
			case "deleteUsuarioOk":									// Eliminar usuario exitoso
				System.out.println(DELETE_USER_OK);
				break;
			case "createNombres":									// Usuario nombres
				System.out.println(CREATE_NOMBRES);
				break;
			case "createApellidos":									// Usuario apellidos
				System.out.println(CREATE_APELLIDOS);				
				break;
			case "createRut":										// Usuario rut
				System.out.println(CREATE_RUN);
				break;
			case "createFechaNac":									// Usuario Fecha Nacimiento
				System.out.println(CREATE_FECHA_NAC);				
				break;
			case "createClienteTelefono":							// Cliente Telefono
				System.out.println(CREATE_CLIENTE_TELEFONO );		
				break;
			case "createClienteAfp":								// Cliente AFP
				System.out.println(CREATE_CLIENTE_AFP);			
				break;
			case "createClienteSalud":								// Cliente Sist Salud
				System.out.println(CREATE_CLIENTE_SALUD);			
				break;
			case "createClienteDireccion":							// Cliente dirección
				System.out.println(CREATE_CLIENTE_DIRECCION);	
				break;
			case "createClienteComuna":								// Cliente comuna
				System.out.println(CREATE_CLIENTE_COMUNA);	
				break;
			case "createClienteEdad":								// Cliente edad
				System.out.println(CREATE_CLIENTE_EDAD);			
				break;
			case "createProfesionalTitulo":							// Profesional titulo
				System.out.println(CREATE_PROFESIONAL_TITULO);	
				break;
			case "createProfesionalIngreso":						// Profesional fechaIngreso
				System.out.println(CREATE_PROFESIONAL_INGRESO);	
				break;
			case "createAdministrativoArea":						// Administrativo area
				System.out.println(CREATE_ADMINISTRATIVO_AREA);	
				break;
			case "createAdministrativoExperiencia":					// Administrativo experiencia
				System.out.println(CREATE_ADMINISTRATIVO_EXPERIEN);	
				break;
			case "createCapacitacionRutCliente":					// Capacitacion rut cliente registrado
				System.out.println(CREATE_CAPACITACION_RUT_CLTE);
				break;
			case "createCapacitacionDia":							// Capacitacion dia
				System.out.println(CREATE_CAPACITACION_DIA);
				break;
			case "createCapacitacionFecha":							// Capacitacion fecha *agregado como parte de la solución
				System.out.println(CREATE_CAPACITACION_FECHA);
				break;
			case "createCapacitacionHora":							// Capacitacion hora
				System.out.println(CREATE_CAPACITACION_HORA);
				break;
			case "createCapacitacionLugar":							// Capacitacion lugar
				System.out.println(CREATE_CAPACITACION_LUGAR);
				break;
			case "createCapacitacionDuracion":						// Capacitacion duracion
				System.out.println(CREATE_CAPACITACION_DURACION);
				break;
			case "createCapacitacionAsistentes":					// Capacitacion asistentes
				System.out.println(CREATE_CAPACITACION_ASISTENTES);
				break;
			case "createAccidenteRutCliente":						// Accidente rut cliente registrado
				System.out.println(CREATE_ACCIDENTE_RUT_CLTE);
				break;
			case "createAccidenteFecha":							// Accidente fecha
				System.out.println(CREATE_ACCIDENTE_FECHA);
				break;
			case "createAccidenteHora":								// Accidente hora
				System.out.println(CREATE_ACCIDENTE_HORA);
				break;
			case "createAccidenteLugar":							// Accidente lugar
				System.out.println(CREATE_ACCIDENTE_LUGAR);
				break;
			case "createAccidenteOrigen":							// Accidente origen
				System.out.println(CREATE_ACCIDENTE_ORIGEN);
				break;
			case "createAccidenteConsecuencias":					// Accidente rut cliente registrado
				System.out.println(CREATE_ACCIDENTE_CONSECUENCIAS);
				break;
			case "createVisitaRutCliente":							// Visita rut cliente registrado
				System.out.println(CREATE_VISITA_RUT_CLIENTE);
				break;
			case "createVisitaFecha":								// Visita fecha
				System.out.println(CREATE_VISITA_FECHA);
				break;
			case "createVisitaHora":								// Visita hora
				System.out.println(CREATE_VISITA_HORA);
				break;
			case "createVisitaLugar":								// Visita lugar
				System.out.println(CREATE_VISITA_LUGAR);
				break;
			case "createVisitaComentarios":							// Visita comentarios
				System.out.println(CREATE_VISITA_COMENTARIOS);
				break;
			case "createRevisionIdVisita":							// Revision id visita
				System.out.println(CREATE_REVISION_ID_VISITA);
				break;
			case "createRevisionAsunto":							// Revision asunto
				System.out.println(CREATE_REVISION_ASUNTO);
				break;
			case "createRevisionDetalle":							// Revision detalle
				System.out.println(CREATE_REVISION_DETALLE);
				break;
			case "createRevisionEstado":							// Revision estado
				System.out.println(CREATE_REVISION_ESTADO);
				break;
			case "selectCategory":									// Elegir categoría de usuario para Display.category()
				System.out.println(SELECT_CATEGORY);
				break;
			default:
				System.out.println("Ups! fin del switch de mensajes");
				break;
		}										// ends switch msg
	}											// ends static void guide() 
}												// ends static class Utils
