# Journal
Phase 0 Response 

To organize the program I will need a class structure that stores spells and their attributes, tracks active retrievals, identify dangerous spells, and handle search operations. 

The core data model would need to define a danger flag and a power-level indicator. Once instantiated, the spells can be loaded into another class that manages storage and tracks retrieval history. After this establish then we can run the 'magical pipeline' that would handle filtering and extracting.

To specifically handle the  'magical pipeline', I would create a processing loop that iterates through the spell collection, applies power-level filters, and extracts designated spells.