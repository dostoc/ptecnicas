
import axios from 'axios';
import React, { useEffect, useState } from 'react';

export default function ListadoProveedores() {
    const urlBase = "http://localhost:8080/ripsa/proveedores"

    const [proveedor, setProveedores] = useState([]);

    useEffect(() => {
        cargarProveedor();
    }, []);

    const cargarProveedor = async () => {
        const resultado = await axios.get(urlBase);
        setProveedores(resultado.data);
    }

    return (
        <div className='container'>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">nombre</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        proveedor.map((proveedor, indice) => (
                            <tr>
                                <th scope="row">{proveedor.idProveedor}</th>
                                <td>{proveedor.nombre}</td>
                            </tr>
                        ))
                    }

                </tbody>
            </table>


        </div>
    )
}
