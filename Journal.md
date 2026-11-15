# Journal
Phase 0 Response 

To organize the program I will need a class structure that stores spells and their attributes, tracks active retrievals, identify dangerous spells, and handle search operations. 

The core data model would need to define a danger flag and a power-level indicator. Once instantiated, the spells can be loaded into another class that manages storage and tracks retrieval history. After this establish then we can run the 'magical pipeline' that would handle filtering and extracting.

To specifically handle the  'magical pipeline', I would create a processing loop that iterates through the spell collection, applies power-level filters, and extracts designated spells.



_________

Phase 1 Response

What did you accomplish in this phase? Looking at your collection of spells, what do you now understand about the difference between a class blueprint and an actual object instance?

During this phase, I implemented the Spell class blueprint with encapsulated instance variables and constructor validation to establish the blueprint. In the main method, I initialized an ArrayList, populated it with ten spell instances, and used a simple for loop to print their details. 
The distinction between a class blueprint and object instance, is the blueprint, acts as a template defining required attributes and an object instances, holds unique, concrete data.



____________


Phase 2 Response


How does the filter operation decide which elements to keep? In your own words, what is the role of the lambda expression inside the filter?

The .filter decides which elements to keep by evaluating a boolean condition for every item in the stream. 

The lambda expression plays the role as an instruction manual that tells the stream how to test each element. 