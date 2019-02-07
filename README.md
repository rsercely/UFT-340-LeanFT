# UFT-340-LeanFT

This project can be used to demo LeanFT. There are 4 branches:

1. master - a project that has the recorded simple business process, with an appropriate leanft.properties
2. WithApplicationModel - application model is created with a few items, but not all arer added to the test
3. ApplicationModelWorking - all the steps in the correct order. A few object identifications were also modified to handle more dynamic objects. This can be used so that you don't have to ensure exact correct placement of steps. Allows for a quicker demo.
4. SRF - Browser launch is updated to connect to and do a remote execution in SRF. Note that if you are going to demon this, be sure to set the LeanFT runtime engine settings with your client information. Also, at the moment, the test is set to use Internet Explorer and this fails. Change the browser settings to Chrome, version latest and is should work.
