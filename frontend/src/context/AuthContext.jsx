import React from 'react'

export const AuthContext = createContext()

export const AuthProvider = () => {
  return (
    <>
        {/* En este componente vamos manejar la comunicacion con grpc para poder registrarnos
        e iniciar sesion por medio de petciones http con axios, y vamos a realizar la llamada 
        correspondiente junto con la creacion  de los metodos, y utilizo un proveedor
        para proporcionar datos a componentes secundarios sin necesidad de pasar propiedades 
        manualmente a través de cada nivel de la jerarquía de componentes a traves de los props */}

        <AuthContext.Provider value={{
           
        }}>
            {children}
        </AuthContext.Provider>
    
    </>
  )
}

