def estCodicional01():
  #Definir variables y otros
  print("Ejemplo estructural Condicional en Python")
  montoP=0
  #Datos de Entrada
  cantidadX=int(input("Ingrese la cantidad de lapices:"))
  #proceso
  if cantidadX>=1000:
    montoP=cantidadX*0.80
  else:
   montoP=cantidadX*0.90
  #Datos de salida
  print(" El monto a pagar es:" , montoP)

EstCondicional01()