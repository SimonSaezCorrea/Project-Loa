import React from "react";
import { useNavigate } from 'react-router-dom';
import styled from "styled-components";

function HeaderComponent(){

    const navigate = useNavigate();
    const handleClick = () => {
        navigate("/");
    }

    return (
        <div>
            <HomeStyle>
                <div className="Barra">
                    <div className="logo">
                        <h1 onClick={handleClick}>Project LOA</h1>
                    </div>
                    <button>Opción 1</button>
                    <button>Opcion 2</button>
                    <button>Opcion 3</button>
                    <button>Opcion 4</button>
                </div>
            </HomeStyle>
        </div>
    );

    
}

const HomeStyle = styled.nav`

.Barra{
    background-color: #E03E52;
    display: flex;
    justify-content: flex-end;
    align-items: center;
    height: 85px;
    weight: 100%;
    padding: 5px 10%;
}

.Barra .logo{
    margin-right: auto;
    color: #FFF6F6;
    font-family: 'Pacifico',serif;
    font-size: 30px;
    cursor: pointer;
}

.Barra button{
    background-color: #FFF6F6;
    margin-left: 20px;
    font-weight: 700;
    color: #1b3039;
    padding: 15px 50px;
    border: none;
    border-radius: 50px;
    cursor: pointer;
}

`;

export default HeaderComponent;


