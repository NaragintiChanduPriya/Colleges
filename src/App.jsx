
import {Routes, Route} from 'react-router-dom';

import './App.css'
import CollegeDetails from './CollegeDetails';
import CollegeList from './CollegeList';

const App = () => {
    
    return (
 
            <Routes>
                <Route path="/" element={<CollegeList/>}/>
                <Route path="colleges/:id" element= {<CollegeDetails/>}/>

               
            </Routes>

    );
};

export default App;
