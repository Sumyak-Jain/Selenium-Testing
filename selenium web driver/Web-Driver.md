# Selenium Web Driver
+ In WebDriver, test scripts can be developed using any of the supported programming languages and can be run directly in most modern web browsers.
+ Languages supported by WebDriver include C#, Java, Perl, PHP, Python and Ruby.
## Selenium WebDriv-er- Architecture
+ Selenium Language Bindings
+ JSON Wire Protocol
+ Browser Drivers
+ Real Browsers

#### Selenium Language Bindings
>  Selenium developers have built language bindings/Selenium Client Libraries in order to support multiple languages.For instance, if you want to use the browser driver in java, use the java bindings.


#### JSON Wire Protocol
> JSON (JavaScript Object Notation) is an open standard for exchanging data on web. It supports data structures like object and array. So, it is easy to write and read data from JSON.  JSON Wire Protocol provides a transport mechanism to transfer data between a server and a client.

#### Browser Drivers
> Selenium uses drivers, specific to each browser in order to establish a secure connection with the browser without revealing the internal logic of browser's functionality. The browser driver is also specific to the language used for automation such as Java, C#, etc.
#### Browsers
> Browsers supported by Selenium WebDriver:
Internet Explorer,
Mozilla Firefox,
Google Chrome,
Safari

### How they work?

1. HTTP request is generated and sent to the browser driver for each Selenium command.
2. The driver receives the HTTP request through HTTP server.
3. HTTP Server decides all the steps to perform instructions which are executed on browser.
4. Execution status is sent back to HTTP Server which is subsequently sent back to automation script.

