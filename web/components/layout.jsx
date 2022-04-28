import Head from 'next/head';
import Header from './header'
import Footer from './footer'

function Layout({ children }) {
  return (
    <>
      <Head>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta name="theme-color" content="#000000" />
      </Head>

      <Header />
      <main>{children}</main>
      <Footer />
    </>
  )
}

export default Layout;