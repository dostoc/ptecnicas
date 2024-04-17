import { BrowserRouter, Route, Routes } from "react-router-dom";
import ListadoProductos from "./productos/ListadoProductos";
import ListadoProveedores from "./productos/ListadoProveedores";


function App() {
  return (
    <div className="container text-center">
      <BrowserRouter>
        <Routes>
          <Route extact path="/productos" element={<ListadoProductos/>}></Route>
          <Route extact path="/productos/crear" element={<ListadoProductos/>}></Route>
          <Route extact path="/proveedores" element={<ListadoProveedores/>}></Route>
        </Routes>
      
      </BrowserRouter>
      
    </div>
  );
}

export default App;
