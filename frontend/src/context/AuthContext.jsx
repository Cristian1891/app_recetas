import React, { useState } from 'react'

export const AuthContext = createContext()

export const AuthProvider = ({children}) => {

  const [user, setUser] = useState({
    email: null,
    logged: false
  })

  const traerIdUsuario = async (username, password) => {
    try {
        const body = {
            usuario: username,
            clave: password
        }
        const res = await axios.post('https://localhost:5173/login', body);
        const user = await res.data;
        return user;
    } catch (err) {
        console.error(err)
    }
  }

  const altaUsuario = async (body) => {
      console.log(JSON.stringify(body))
      try {
          const res = await axios.post('https://localhost:5173/register', body)
          const ret = await res.data;
          return ret
      } catch (err) {
          console.error(err)
      }
  }

  const getById = async (idUsuario) => {
      console.log(JSON.stringify(idUsuario))
      try {
          const res = await axios.get(`https://localhost:5173/obtener_usuario/${idUsuario}`,{idUsuario:idUsuario})
          const ret = await res.data;
          console.log(ret)
          return ret
      } catch (err) {
          console.error(err)
      }
  }

  return (
    <>
        {/* En este componente vamos manejar la comunicacion con grpc para poder registrarnos
        e iniciar sesion por medio de petciones http con axios, y vamos a realizar la llamada 
        correspondiente junto con la creacion  de los metodos, y utilizo un proveedor
        para proporcionar datos a componentes secundarios sin necesidad de pasar propiedades 
        manualmente a través de cada nivel de la jerarquía de componentes a traves de los props */}

        <AuthContext.Provider value={{
           user,
           traerIdUsuario,
           altaUsuario,
           getById
        }}>
            {children}
        </AuthContext.Provider>
    
    </>
  )
}

