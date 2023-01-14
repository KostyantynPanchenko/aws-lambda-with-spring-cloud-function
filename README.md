# Getting Started

## How to

* Build this project `./gradlew build`
* Login into you AWS account
* Navigate to Lambda service
* Create new function with Java 11 as runtime and jar file from step 1
* Test it

Then add SnapStart functionality by editing
* Go to `Configuration` tab
* In `General Configuration` press `Edit`
* In `SnapStart` dropbox choose `PublishedVersions`
* Wait till it is done and test once again

### Functions could be automatically exported as HTTP endpoints.
| Method |     Path     |Request | Response |Status |
|--------|:------------:|:-------------------:|:----------------:|:------------:|
| GET | /{supplier} | - | Items from the named supplier | 200 OK |
| POST | /{consumer} | JSON object or text | Mirrors input and pushes request body into consumer | 202 Accepted |
| POST | /{consumer} | JSON array or text with new lines | Mirrors input and pushes body into consumer one by one | 202 Accepted |
| POST | /{function} | JSON object or text | The result of applying the named function | 200 OK |
| POST | /{function} | JSON array or text with new lines | The result of applying the named function | 200 OK |
| GET | /{function}/{item} | - | Convert the item into an object and return the result of applying the function | 200 OK |

### Reference Documentation
For further reference, please consider the following sections:

* [Spring Cloud Function](https://spring.io/projects/spring-cloud-function)
* [Spring Cloud Function - Standalone Web Application](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html#_standalone_web_applications)
* [Spring Cloud Function - AWS Lambda Adapter](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html#_aws_lambda)
* [Spring Cloud Function - Reference Documentation](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html)

### Additional Links

* [Starting up faster with AWS Lambda SnapStart](https://aws.amazon.com/ru/blogs/compute/starting-up-faster-with-aws-lambda-snapstart/)
* [Runtime hooks for Lambda SnapStart](https://docs.aws.amazon.com/lambda/latest/dg/snapstart-runtime-hooks.html)
* [Building Lambda functions with Java](https://docs.aws.amazon.com/lambda/latest/dg/lambda-java.html)

