import type { NextPage } from 'next'
import { useEffect, useState } from 'react';
import Head from 'next/head'
import { Form, Button } from 'react-bootstrap';

const Home: NextPage = () => {
  const [question, setQuestion] = useState('');
  const [possibleAnswers, setPossibleAnswers] = useState([]);
  
  const handleSubmit = (evt : React.FormEvent<HTMLFormElement>) => {
    evt.preventDefault();

    callApi().then(() => { console.log("Submitted responses"); });
  };

  const getQuestionBody = () => {
    return JSON.stringify({
        question: question
    });
  }

  const callApi = () => {
    var baseUrl = process.env.NEXT_PUBLIC_API_BASE_URL;
    return fetch(baseUrl + "/question", {
      method: 'POST', mode: 'cors', cache: 'no-cache',
      credentials: 'same-origin', headers: {
          'Content-Type': 'application/json'
        },
      redirect: 'error', referrerPolicy: 'origin',
      body: getQuestionBody()
    });
  };

  const setAnswerDisplayText = (answer, newDisplayText) => {
    answer.displayText = newDisplayText;
  };

  const addPossibility = () => {
    setPossibleAnswers([ ...possibleAnswers, { displayText: "Because Wings" } ]);
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
          <div className="col-md">
            <Form className="form-inline" onSubmit={handleSubmit}>


              <Form.Group className="mb-3" controlId="contactUs.contact">
                <Form.Label>Whats Your Question</Form.Label>
                <Form.Control type="text" placeholder="Contact" value={question} onChange={e => setQuestion(e.target.value) } />
              </Form.Group>

              {
                possibleAnswers.map(function (answer) {
                  return (
                      <Form.Group className="mb-3" controlId="contactUs.contact">
                        <Form.Label>Answer:</Form.Label>
                        <Form.Control type="text" placeholder="Answer" value={answer.displayText} onChange={e => setAnswerDisplayText(answer, e.target.value) } />
                      </Form.Group>
                  );
                })
              }

              <Button variant="secondary"
                      type="submit"
                      className="mr-2"
                      onClick={ addPossibility }
              >More Possibles, Please</Button>
              <Button variant="primary" type="submit">Create Question</Button>
            </Form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Home
