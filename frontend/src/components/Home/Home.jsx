import React from 'react'
import { Carousel } from "@material-tailwind/react";

const Home = () => {
    return (
        <>
            <div className='mt-24'>
                <h3 className='text-center text-2xl font-bold mb-8'>Bienvenido/a a CookDay
                </h3>
                <div className="max-w-2xl mx-auto relative">
                    <Carousel className="rounded-xl">
                        <img
                            src="/img/receta_1.jpg"
                            alt="receta_1"
                            className="h-full z-0 w-full object-cover"
                        />
                        <img
                            src="/img/receta_2.jpg"
                            alt="receta_2"
                            className="h-full z-0 w-full object-cover"
                        />
                        <img
                            src="/img/receta_3.jpg"
                            alt="receta_3"
                            className="h-full z-0 w-full object-cover"
                        />
                    </Carousel>
                </div>
            </div>
        </>
    )
}

export default Home