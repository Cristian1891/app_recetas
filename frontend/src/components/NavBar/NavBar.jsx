import React from 'react'
import './NavBar.scss'
import { PiCookingPotFill} from "react-icons/pi";
import { Link } from 'react-router-dom';
import { IconContext } from 'react-icons';

const NavBar = () => {


  return (
    <>
        <header className='fixed z-50'>
          <nav className="bg-black border-gray-200 px-4 lg:px-6 py-2.5 dark:bg-black fixed top-0 left-0 right-0">
              <div className="flex flex-wrap justify-between items-center mx-auto max-w-screen-xl">
                  <Link to="/" className="flex items-center">
                      {/* <img src={logo} className="mr-3 h-6 sm:h-9" alt='logo' /> */}
                      <IconContext.Provider value={{ size: '2em' }}>
                        <PiCookingPotFill className='icon-red'/>
                      </IconContext.Provider>
                      <h3 className='icon-red pl-3'>CookDay</h3>
                  </Link>
                  <div className="hidden justify-between items-center w-full lg:flex lg:w-auto lg:order-1" id="mobile-menu-2">
                      <ul className="flex flex-col mt-4 font-medium lg:flex-row lg:space-x-8 lg:mt-0">
                          <li>
                              <Link to="/" className="block py-2 pr-4 pl-3 text-white rounded bg-primary-700 lg:bg-transparent lg:text-primary-700 lg:p-0 dark:text-white" aria-current="page">
                                Home
                              </Link>
                          </li>
                          <li>
                              <Link to="/login" className="block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 lg:hover:bg-transparent lg:border-0 lg:hover:text-primary-700 lg:p-0 dark:text-gray-400 lg:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white lg:dark:hover:bg-transparent dark:border-gray-700">
                                Login
                              </Link>
                          </li>
                          <li>
                              <Link to="/register" className="block py-2 pr-4 pl-3 text-gray-700 border-b border-gray-100 hover:bg-gray-50 lg:hover:bg-transparent lg:border-0 lg:hover:text-primary-700 lg:p-0 dark:text-gray-400 lg:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white lg:dark:hover:bg-transparent dark:border-gray-700">
                                Registro
                              </Link>
                          </li>
                      </ul>
                  </div>
              </div>
          </nav>
          
      </header>
    </>
  )
}

export default NavBar