# Proxy Design Pattern

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy
controls access to the original object, allowing you to perform something either before or after the request gets
through to the original object.

The proxy object has the same interface as a service, which makes it interchangeable with a real object when passed to a client.

## Usage of the pattern in Java

While the Proxy pattern isn't a frequent guest in most Java applications, it's still very handy in some special cases.
It's irreplaceable when you want to add some additional behaviors to an object of some existing class without changing the client code.

- java.lang.reflect.Proxy
- java.rmi.*
- javax.ejb.EJB
- javax.inject.Inject
- javax.persistence.PersistenceContext

Proxies delegate all of the real work to some other object. Each proxy method should, in the end, refer to a service object
unless the proxy is a subclass of aservice.

## Real-World Analogy

A credit card is a proxy for a bank account, which is a proxy for a bundle of cash. Both implement the same interface :
they can be used for making a payment. A consumer feels great because there's no need to carry loads of cash around. A
shop owner is also happy since the income from a transaction gets added electronically to the shop's bank account
without the risk of losing the deposit or getting robbed on the way to the bank.

## Applicability

There are dozens of ways to utilize the Proxy pattern.

- Lazy Initialization (Virtual Proxy). This is when you have a heavyweight service object that wastes system resources
  by being always up, even though you only need it from time to time.
- Instead of creating the object when the app launches, you can delay the object's initialization to a time when it's
  really needed.

Access control (protection proxy). This is when you want only specific clients to be able to use the service object:
for instance, when your objects are crucial parts of an operating system and clients are various launched applications
(including malicious ones)

The proxy can pass the request to the service object only if the client's credentials match some criteria.

- Local execution of a remote service (remote proxy). This is when the service object is located on a remote server. In
  this case, the proxy passes the client request over the network, handling all of the nasty details of working with the
  network.

Logging requests(logging proxy). This is when you want to keep a history of requests to the service object. The proxy
can log each request before passing it to the service.

- Caching request results(caching proxy). This is when you need to cache results of client requests and manage the life
  cycle of this cache, especially if results are quite large.

The proxy can implement caching for recurring requests that always yield the same results. The proxy may use the
parameters of requests as the cache keys.

Smarty reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use
it. The proxy can keep track of clients that obtained a reference to the service object or its results. From time to
time, the proxy may go over the clients and check whether they are still active. If the client list gets empty, the
proxy might dismiss the service object and free the underlying system resources.

The proxy can also track whether the client had modified the service object. Then the unchanged objects may be reused by
other clients.

## Pros and Cons

- You can control the service object without clients knowing about it.
- You can manage the lifecycle of the service when clients don't care about it.
- The proxy works even if the service object isn't ready or is not available.
- Open/Closed Principle. You can introduce new proxies without changing the service or clients.
- (-) The code may become more complicated since you need to introduce a lot of new classes.
- (-) The response from the service might get delayed.

## Relations with Other patterns

- Adapter provides a different interface to the wrapped object, Proxy provides it with the same interface, and Decorator
  provides it with an enhanced interface.
- Facade is similar to Proxy in that both buffer a complex entity and initialize it on its own. Unlike Facade, Proxy has
  the same interface as its service object, which makes them interchangeable.
- Decorator and Proxy have similar structures, but very different intents. Both patterns are built on the composition
  principle where one object is supposed to delegate some of the work to another. The difference is that a Proxy usually
  manages the life cycle of its service object on its own, whereas the composition of Decorators is always controlled by
  the client.
