// CollegeDetails.js
import { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';
import './App.css'

const CollegeDetails = () => {
    const { id } = useParams();
    const [college, setCollege] = useState(null);

    useEffect(() => {
        axios.get(`http://localhost:8080/api/colleges/${id}`)
            .then(response => setCollege(response.data))
            .catch(error => console.error(error));
    }, [id]);

    if (!college) return <div>Loading...</div>;

    return (
        <div>
            <h1>{college.name}</h1>
            <table className='table'>
                <thead>
                    <tr>
                        <th>Course Name</th>
                        <th>Course Fee</th>
                        <th>Duration</th>
                        <th>Accommodation</th>
                        <th>Accommodation Fee</th>
                    </tr>
                </thead>
                <tbody>
                    {college.courses.map(course => (
                        <tr key={course.id}>
                            <td>{course.name}</td>
                            <td>{course.fee}</td>
                            <td>{course.duration}</td>
                            <td>{college.accommodation}</td>
                            <td>{college.accommodationFee}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default CollegeDetails;
