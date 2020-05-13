## Protocol Handler Bug

To see the bug. Pull the project and run it in dev mode, then compile it to a war and try to run the war app.

In dev mode you'll see messages printed to the console indicating success.
In war mode a stacktrace will be thrown with a MalformedURLException: unknown protocol exception.