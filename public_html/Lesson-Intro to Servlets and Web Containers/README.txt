Status Report
1. MVS Tutorial Project
Status: Completed
Details: Implemented and tested a simple web application using the MVC pattern. Successfully deployed on Tomcat.
2. Calculator Servlet
Status: Completed
Details: Developed a calculator servlet to handle arithmetic operations with input validation. Deployed and tested on Tomcat.
3. Deployment Exercise
Status: Completed
Details: Manually deployed a servlet application on Tomcat, following steps to configure web.xml, package the WAR file, and deploy it. Application ran as expected

Answers to Deployment Lab Questions
1. What is the purpose of the directory structure given on p. 30?
Ensures proper organization for server to locate and load resources.
2. What is the purpose of the directory structure given on p. 31?
Guides manual packaging of the app into a WAR file for deployment.
3. Why do you need to be in the project1 directory for step 5?
Ensures correct file paths during deployment.
4. Why is the copying of step 6 necessary?
Places files in the correct structure for server access.
5. Where is the name of the web app defined? Try changing it.
Defined by the WAR file or directory name; can be changed to update the access URL.
6. Why is step 9 necessary? Try changing display text in the servlet. What steps are
necessary for your changes to appear in the browser?
Restarting Tomcat reloads changes; recompile, redeploy, and clear cache to see updates.
7. Describe an interesting problem you encountered (if any) and how you solved it.
Changes not showing; solved by restarting Tomcat and clearing browser cache.