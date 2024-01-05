import React from "react";
import HeaderComponent from "./Header/HeaderComponent";
import styled from "styled-components";
import { createGlobalStyle } from 'styled-components'

function MainComponent(){

    return (
        <div>
            <HeaderComponent></HeaderComponent>
            <GlobalStyle />
            <HomeStyle>
                <div className="Fondo">
                    Algo habrá aquí
                </div>
            </HomeStyle>  
        </div>
    );

    
}

const GlobalStyle = createGlobalStyle`
body {
    background-color: #FCE2E7;
}
`;

const HomeStyle = styled.nav`
.Fondo{
    flex-direction: column;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 100%;
    height: 500px;
}
`;

export default MainComponent;


