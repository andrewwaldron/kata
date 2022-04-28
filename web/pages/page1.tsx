import type { NextPage } from 'next';
import Head from 'next/head';

const Page1: NextPage = () => {
  return (
    <div className="page1">
      <Head>
        <title>Kata - First Page</title>
      </Head>

      <div className="banner">
        <div className="container">
          <p>Kata - Page 1</p>
        </div>
      </div>

      <div className="container">
        <div className="row">
          <div className="col">
            <p className="pad-bottom">
              Page one content
            </p>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Page1;
