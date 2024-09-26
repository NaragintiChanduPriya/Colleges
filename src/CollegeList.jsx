// CollegeList.js
import  { useEffect, useState } from 'react';
import axios from 'axios';
import './App.css'

const CollegeList = () => {
    const [colleges, setColleges] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8080/api/colleges')
            .then(response => {
                console.log('Data fetched:', response.data);
                setColleges(response.data);
            })
            .catch(error => console.error('Error fetching data:', error));
    }, []);

    return (
        <div>
            <h1>Colleges List</h1>
            <table className='table'>
                <thead>
                    <tr>
                        <th>College Name</th>
                        <th>Course Name</th>
                        <th>Course Fee</th>
                        <th>Duration</th>
                        <th>Accommodation</th>
                        <th>Accommodation Fee</th>
                    </tr>
                </thead>
                <tbody>
                {Array.isArray(colleges) && colleges.map(college => (
                        college.courses.map(course => (
                            <tr key={course.id}>
                                <td>{college.name}</td>
                                <td>{course.name}</td>
                                <td>{course.fee}</td>
                                <td>{course.duration}</td>
                                <td>{college.accommodation}</td>
                                <td>{college.accommodationFee}</td>
                            </tr>
                        ))
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default CollegeList;
