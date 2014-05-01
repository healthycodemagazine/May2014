# Internal DSL syntax
class Number(object): 
     def __init__(self, value): 
         self.value = value 
    def evaluate(self): 
        return self.value

class Operation(object): 
      def __init__(self, *args): 
           self.terms = [self.wrap_term(term) for term in args] 
      def wrap_term(self, term): 
           return Number(term) if isinstance(term, numbers.Real) else term 
      def evaluate(self): 
           return reduce(self.operation, [term.evaluate() for term in self.terms]) 

class Add(Operation): 
      operation = operator.add 

class Sub(Operation): 
     operation = operator.sub 
class Mul(Operation): 
    operation = operator.mul 

class Div(Operation): 
    operation = operator.truediv

Add(1, Mul(2, 3), Div(90, 6)).evaluate()
Div(Mul(5, Add(3, 4)), 10).evaluate()
