import './App.css'
import Footer from './components/Footer/Footer'
import Home from './components/Home/Home'
import { BrowserRouter, Navigate, Route, Routes } from 'react-router-dom'
import NavBar from './components/NavBar/NavBar'
import LoginScreen from './components/LoginScreen/LoginScreen'
import RegisterScreen from './components/LoginScreen/RegisterScreen'

function App() {
  // const { user } = useContext(AuthContext)

  return (
    <>
      <BrowserRouter>
        {/* { 
            user.logged
            ? <> */}
          <NavBar/>
          <Routes>
              {/* rutas privadas */}
              <Route path='/' element={ <Home/> }/>
              <Route path='/login' element={<LoginScreen/>}/>
              <Route path='/register' element={<RegisterScreen/>}/>
              {/* <Route path='/category/:categoryId' element={ <ItemListContainer />}/> */}
              {/* <Route path='/item/:itemId' element={ <ItemDetailContainer/> }/> */}
              <Route path='*' element={ <Navigate to="/"/>} />
              {/* <Route path='/cart' element={<Cart/>}/>
              <Route path='/checkout' element={ <Checkout/> }/> */}
          </Routes>
          <Footer/>
              {/* </> */}
              {/* // : <Routes>
              //       
              //       <Route path='/login' element={<LoginScreen/>}/>
              //       <Route path='/register' element={<RegisterScreen/>}/>
              //       <Route path='*' element={ <Navigate to="/login"/>}/>
              //   </Routes> */}
        {/* } */}
      </BrowserRouter>
      
        {/* </BrowserRouter> */}
    </>
  )
}

export default App
