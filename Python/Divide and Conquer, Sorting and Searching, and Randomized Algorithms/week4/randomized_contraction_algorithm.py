'''   procedure contract(
  
    
    {\displaystyle G=(V,E)}
  
G=(V,E)):
   while 
  
    
    {\displaystyle |V|>2}
  
|V|>2
       choose 
  
    
    {\displaystyle e\in E}
  
e\in E uniformly at random
       
  
    
    {\displaystyle G\leftarrow G/e}
  
G\leftarrow G/e
   return the only cut in 
  
    
    {\displaystyle G}
  
G
'''

def randomized_contraction_algorithm(vertex, edge):
    return vertex*vertex