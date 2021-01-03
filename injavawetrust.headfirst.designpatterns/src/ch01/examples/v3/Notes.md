

Joe realized that inheritance probably wasn't the answer , because he just got a memo that says that
the executives now want to update the product every six months.

I could take the fly() out of the Duck superclass, and make a Flyable interface with a fly() method.
That way, only the ducks that are supposed to fly will implement that interface and have a fly() method.

I might as well make a Quackable , too, since not all ducks can quack.

We know that not all of the subclasses should have flying or quacking behavior ,
so inheritance isn't the right answer. But while having the subclasses implement Flyable and/or Quackable solves
part of the problem. (no inappropriately flying rubber ducks) , it completely destroys code reuse for those behaviors
so it just creates a different maintenance nightmare.


## The one constant in software development : CHANGE ##
No matter how well you design an application , over time an application must grow and change or it will die.
