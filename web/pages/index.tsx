import type { NextPage } from 'next'
import { useEffect, useState } from 'react';
import Head from 'next/head'
import { Form, Button } from 'react-bootstrap';

const Home: NextPage = () => {
  const [contact, setContact] = useState('');
  const [feedback, setFeedback] = useState('');
  
  const handleSubmit = (evt : React.FormEvent<HTMLFormElement>) => {
    evt.preventDefault();
    callApi().then(() => { console.log("Submitted responses"); });
  };

  const getFeedbackData = () => { return contact + " " + feedback; }

  const callApi = () => {
    var baseUrl = process.env.NEXT_PUBLIC_API_BASE_URL;
    return fetch(baseUrl + "/feedback", {
      method: 'POST', mode: 'cors', cache: 'no-cache',
      credentials: 'same-origin', headers: {
          'Content-Type': 'text/plain'
        },
      redirect: 'error', referrerPolicy: 'origin',
      body: getFeedbackData()
    });
  };

  return (
    <div className="something">
      <Head>
        <title>Kata - Home Page</title>
      </Head>

      <div className="banner">
        <div className="container">
          <p>Kata - Home</p>
        </div>
      </div>

      <div className="container pad-top">
        <div className="row">
          { /* Tossed a simple feedback form here for quick coolness & to test out submission & connectivity */ }

          <div className="col-md">
            <Form className="form-inline" onSubmit={handleSubmit}>
              <Form.Group className="mb-3" controlId="contactUs.contact">
                <Form.Label>Contact (optional)</Form.Label>
                <Form.Control type="text" placeholder="Contact" value={contact} onChange={e => setContact(e.target.value) } />
              </Form.Group>
              <Form.Group className="mb-3" controlId="contactUs.feedback">
                <Form.Label>Feedback</Form.Label>
                <Form.Control as="textarea"  value={feedback} onChange={e => setFeedback(e.target.value) } rows={3} />
              </Form.Group>
              <Button variant="primary" type="submit">Send Feedback</Button>
            </Form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Home
