# language: es
Característica: Ingresar a simulador Cotrafa



  @Ingresar_simulador_cotrafa
  Escenario: Validar que el usuario se encuentra en la pantalla simulador cotrafa
    Dado el usuario ingresa al sitio web de Cotrafa
    Cuando se introduce la palabra de busqueda simulador
    Entonces el sistema debe direccionar al usuario a la pantalla de simulador Cotrafa y verificar que se encuentra allí
