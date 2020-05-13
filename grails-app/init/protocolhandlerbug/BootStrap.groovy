package protocolhandlerbug

class BootStrap {

    def init = { servletContext ->
        URL u = new URL("greatness://a/great/resource")
        u.openConnection().connect()
    }
    def destroy = {
    }
}
