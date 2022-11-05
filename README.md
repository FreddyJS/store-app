# Store App - A Vulnerable Web Page

Fixed: :heavy_check_mark:
To Fix: :x:

## Users
* **email:** default@default.com - **password:** default
* **email:** corbi46@gmail.com - **password:** default
* **email:** sebashgt@gmail.com - **password:** default

## Vulnerabilities
* **CWE-200** (Exposure of Sensitive Information to an Unauthorized Actor): Expose if a user is registered or not in the web. **Fixed:** :heavy_check_mark:
* **JSESSIONID in URL** Changed in application.properties :heavy_check_mark:
* **Comment Rating** Fixed rating not between 0 and 5 :heavy_check_mark:
* **Arbitrary File Upload** Fixed uploads of no images in UserController create and update endpoints :heavy_check_mark:
* **JS Injection in Comments** :heavy_check_mark:
* **Orders** Any user can check the orders of others :heavy_check_mark: