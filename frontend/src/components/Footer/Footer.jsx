import React from 'react'
import { PiCookingPotFill} from "react-icons/pi";
import { Link } from 'react-router-dom';

const Footer = () => {
  return (
    <>
        
        <footer className="bg-black rounded-lg shadow dark:bg-black m-4">
            <div className="w-full max-w-screen-xl mx-auto p-4 md:py-8">
                <div className="sm:flex sm:items-center sm:justify-between">
                    <Link to="/" className="flex items-center mb-4 sm:mb-0">
                        {/* <img src={logo} class="h-8 mr-3" alt="logo" /> */}
                        {/* <PiCookingPotFill/> */}
                        <h3 className='text-white'>CookDay</h3>
                        {/* <span class="self-center text-2xl font-semibold whitespace-nowrap dark:text-white">Flowbite</span> */}
                    </Link>
                    <ul className="flex flex-wrap items-center mb-6 text-sm font-medium text-gray-500 sm:mb-0 dark:text-gray-400">
                        <li>
                            <a href="#" className="mr-4 hover:underline md:mr-6 ">About</a>
                        </li>
                        <li>
                            <a href="#" className="mr-4 hover:underline md:mr-6">Privacy Policy</a>
                        </li>
                        <li>
                            <a href="#" className="mr-4 hover:underline md:mr-6 ">Licensing</a>
                        </li>
                        <li>
                            <a href="#" className="hover:underline">Contact</a>
                        </li>
                    </ul>
                </div>
                <hr className="my-6 border-gray-200 sm:mx-auto dark:border-gray-700 lg:my-8" />
                <span className="block text-sm text-gray-500 sm:text-center dark:text-gray-400">© 2023 <a href="#" className="hover:underline">CookDay™</a>. All Rights Reserved.</span>
            </div>
        </footer>
    </>
  )
}

export default Footer