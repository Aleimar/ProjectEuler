#To run this file. Enter python randomizer.py

import random

# List of programming languages I can use to solve programming problems
programming_list=['C', 'C++', 'C#', 'Java', 'Python', 'Javascript (Node)', 'Scala']

#PL randomly chosen
random_pl = random.choice(programming_list)

#Display PL of the problem
print("Solve the problem using:" , random_pl)
