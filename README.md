Welcome .

I'm working with AWS right now, and I was wondering why the response times on a lambda were so up and down.

First , you have to remember that AWS is like a big machine that shares computer time. If a service, like a lambda, isn't used for a while, its running image will just be taken off and then started again when needed

So, to keep the service working well all the time, it's important to choose the right tools and technology to helps make the start and reload times shorter

I'm an experienced Java developer, and I decided to try making a lambda in this language. To be honest, Amazon's Java 17 runtime is already really good, but it has a big problem with performance the first time it starts.

This is where GraalVM comes in.


