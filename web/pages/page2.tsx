import type { NextPage } from 'next';
import Head from 'next/head';

const Page2: NextPage = () => {
  return (
    <div className="page2">
      <Head>
        <title>Kata - Second Page</title>
      </Head>

      <div className="banner">
        <div className="container">
          <p>Kata - Page 2</p>
        </div>
      </div>

      <div className="container">
        <div className="row">
          <div className="col">
            <p className="pad-bottom">
              Page two content
            </p>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Page2;
