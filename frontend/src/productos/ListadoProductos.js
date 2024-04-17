import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';


export default function ListadoProductos() {

    const urlBase = "http://localhost:8080/ripsa/productos";

    let navegacion = useNavigate();

    const[ productos, setProductos ] = useState([]);

    useEffect(() => {
        cargarProductos();
    }, []);

    const cargarProductos = async () => {
        const resultado = await axios.get(urlBase);
        console.log("Resultado de cargar empleados");
        setProductos(resultado.data);
    }

    return (

        <div className='container'>

            <table className="table">
                <thead>
                    <tr>
                        <th scope="col">Proveedor</th>
                        <th scope="col">Codigo</th>
                        <th scope="col">Descripcion</th>
                        <th scope="col">Precio</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        productos.map((producto, indice) => (
                            <tr key={indice}>
                                <th scope='row'>{producto.proveedor.nombre}</th>
                                <td>{producto.codigo}</td>
                                <td>{producto.descripcion}</td>
                                <td>{producto.precio}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>

        </div>
    )
}

