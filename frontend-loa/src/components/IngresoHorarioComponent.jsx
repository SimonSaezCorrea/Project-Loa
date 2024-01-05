import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";
import { createGlobalStyle } from 'styled-components'
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import Swal from 'sweetalert2';

import HeaderComponent from "./Header/HeaderComponent";

function IngresoHorarioComponent(){
    const initialState = {
        codigo: "",
    };

    const [input, setInput] = useState(initialState);

    const navigate = useNavigate();
    const navigateHome = () => {
        navigate("/");
    };

    const changeCodigoHandler = event => {
        setInput({ ...input, codigo: event.target.value });
    };

    const ingresarEstudiante = (event) => {
        Swal.fire({
            title: "¿Desea registrar la asignatura?",
            text: "No podra cambiarse en caso de equivocación",
            icon: "question",
            showDenyButton: true,
            confirmButtonText: "Confirmar",
            confirmButtonColor: "rgb(68, 194, 68)",
            denyButtonText: "Cancelar",
            denyButtonColor: "rgb(190, 54, 54)",
        }).then((result) => {
            if (result.isConfirmed) {
                let newHorario = {
                    codigo: input.codigo,
                };
                console.log(newHorario);
                Swal.fire({
                    title: "Enviado",
                    timer: 2000,
                    icon: "success",
                    timerProgressBar: true,
                    didOpen: () => {
                        Swal.showLoading()
                      },
                    })
                navigateHome();
            }
        });
    };

    return (
        <div>
            <HeaderComponent></HeaderComponent>
            <GlobalStyle />
            <HomeStyle>
                <div className="Fondo">
                    <div className="izquierdo">
                    <Form>
                        <Form.Group className="mb-3" controlId="codigo" value = {input.codigo} onChange={changeCodigoHandler}>
                            <Form.Label className="text-label">Codigo de la asignatura:</Form.Label>
                            <Form.Control className="text-input" type="text" name="codigo"/>
                        </Form.Group>
                        <Button className="boton" onClick={ingresarEstudiante}>Registrar Proveedor</Button>
                    </Form>
                    </div>
                    <div className="derecho">
                    <table class="tb" >
                        <tr>
                            <th>Hora</th>
                            <th>Lunes</th>
                            <th>Martes</th>
                            <th>Miercoles</th>
                            <th>Jueves</th>
                            <th>Viernes</th>
                            <th>Sabado</th>
                        </tr>

                        <tr>
                            <th>8:15-9:30</th>
                            <td className="Clase"></td>
                            <td className="Clase"></td>
                            <td className="Clase"></td>
                            <td className="Clase"></td>
                            <td className="Clase"></td>
                            <td className="Clase"></td>
                        </tr>
                        
                    </table>
                    </div>
                </div>
            </HomeStyle>  
        </div>
    );

    
}

const GlobalStyle = createGlobalStyle`
body {
    background-color: #FFF6F6;
}
`;

const HomeStyle = styled.nav`
.Fondo{
    position: fixed;
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
}

.izquierdo{
    display: flex;
    justify-content: center;
    align-items: center;
    width: 20%;
    height: 100%;
}

.derecho{
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 100%;
}

table {
    border: 1px solid #000;
    padding: 20px 50px;
    background-color: #AD687A;
    margin-bottom: 10%;
}

th, td{
    background-color: #FCE2E7;
    border: 2px solid #000;
    padding: 20px 30px;
    border-spacing: 10px;
}

.Clase:hover{
    background-color: #F3EED9;
}
.text-label{
    margin-left: 40%;
    font-size: 15px;
    font-family: Verdana, Geneva, Tahoma, sans-serif;
    margin-bottom: 30px;
    margin-top: 50px;
}
.text-input{
    margin-top: 10px;
    margin-bottom: 90%;
    width: 145px;
    margin-left: 42%;
    font-weight: 700;
    padding: 10px 10px;
    border: 1px solid #000;
    border-radius: 50px;
}
.boton{
    background-color: #AD687A;
    margin-left: 42%;
    margin-top: 100%;
    font-weight: 700;
    color: #FCE2E7;
    padding: 10px 20px;
    border: none;
    border-radius: 50px;
    cursor: pointer;
}
.boton:hover{
    background-color: #AC4079;
}
`;

export default IngresoHorarioComponent;


