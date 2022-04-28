import type { AppProps } from 'next/app'
import Layout from '../components/layout';
import Script from 'next/script';

function Kata({ Component, pageProps }: AppProps) {
  return (
    <div className="App">
      <Script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" strategy="beforeInteractive" />
      
      <Layout>
        <Component {...pageProps} />
      </Layout>
    </div>
   );
}

export default Kata;